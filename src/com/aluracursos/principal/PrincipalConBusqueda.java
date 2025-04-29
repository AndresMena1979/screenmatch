package com.aluracursos.principal;

import com.aluracursos.screnmatch.excepsion.ErrorEnConversionDeDuracionException;
import com.aluracursos.screnmatch.modelos.Titulo;
import com.aluracursos.screnmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalConBusqueda {

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner lectura = new Scanner(System.in);

  //  -----------------------------------
        List<Titulo> titulos = new ArrayList<>();

//------------------------------------- Se saco del try
        Gson gson = new GsonBuilder()   //crea politica para que reconozca minusculas de los titulos como mayusculas (public record TituloOmdb(String title, String year, String runtime)
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()  //mejora la presentacion del jason archivo
                .create();
//-------------------------------------------


        // hace que todo el tiempo este buscando una película

        while (true){

            System.out.println("Escriba el nombre de una pelicula: ");
            var busqueda = lectura.nextLine();

            if (busqueda.equalsIgnoreCase("salir") ){  // equalsIgnoreCase , ignora si es mayuscula o minuscula

                break;
            }

            String clave = "464cb2ce"; //"COLOQUE AQUI SU CLAVE DE OMDb";

            String direccion = "https://www.omdbapi.com/?t=" + busqueda.replace(" ","+") + "&apikey=" + clave; // busqueda.replace(" ", "+") cambia los espacios por +

            try {     // se movio el try aquí para evitar el error por espacios

                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder().uri(URI.create(direccion)).build();


                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString()); //llama a Client y envia dentro de los parametros el request
                // BodyHandlers, interpeta el mensaje que vamos a recibir
                System.out.println(response.body()); //response.body() muestra los datos de la consulta
//----------------------------------------------------------------------------------------------------------
                String json = response.body();  // Se encuentra los datos recibidos
             //   System.out.println(json);

                //Gson gson = new Gson();




                TituloOmdb miTituloOmdb = gson.fromJson(json, TituloOmdb.class);
              //  System.out.println(miTituloOmdb);

                // para tratar de capturar un error

                Titulo miTitulo = new Titulo(miTituloOmdb);

                System.out.println("Titulo ya convertido"+miTitulo);
//----------------------------------------------------------------------------------------------------------------
//                FileWriter escritura = new FileWriter("peliculas.txt") ;  //crtl+P dentro de los parentesis, crea archivo llamado pelicula.txt
//                escritura.write(miTitulo.toString());
//                escritura.close(); // se cierra

//----------------------------------------------------------------------------------------------------------------
             titulos.add(miTitulo);



//--------------------------------------------------------------------------------------------------
            }catch (NumberFormatException e){                 //Siempre que haya un try habra un catch

                System.out.println("Ocurrio un error: ");
                System.out.println(e.getMessage());       //getMessage es el mensaje de la excepcion  (bichos)


            }catch (IllegalArgumentException e){  // se creo para los espacios entre las palabras de la pelicula (top gun)

                System.out.println("Error en la URI, verifique la dirección: ");


            }catch (ErrorEnConversionDeDuracionException e){  //este Exception es la clase madre de todos los tros exceptions, pero se cambio por ErrorEnConversio... que es una propia excepcion

                System.out.println(e.getMessage()); //Excepcion es la clase hija de Throwable
            }

        }
   // ----------------------------------------------------

        System.out.println(titulos);

        FileWriter escritura = new FileWriter("titulos.json");

        escritura.write(gson.toJson(titulos));  // para convertir titulos a Json

        escritura.close();

        System.out.println("Finalizo la ejecucion del programa");


        //Titulo miTitulo = new Titulo(miTituloOmdb);   //instancia de titulo para colocar datos en titulo (se crea un constructor en la clase Titulo)

        //  System.out.println(miTitulo);






    }



}

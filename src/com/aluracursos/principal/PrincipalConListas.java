package com.aluracursos.principal;

import com.aluracursos.screnmatch.modelos.Pelicula;
import com.aluracursos.screnmatch.modelos.Series;
import com.aluracursos.screnmatch.modelos.Titulo;

import javax.swing.plaf.SliderUI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class PrincipalConListas {



    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula("Jurassic Park" , 1993);
        miPelicula.evalua(9);
        Pelicula otraPelicula = new Pelicula("Jurassic world", 2015);
        otraPelicula.evalua(6);
        var peliculaDeBrueno = new Pelicula("El señor de los anillos" , 2001);
        peliculaDeBrueno.evalua(10);

        Series casaDragon = new Series("La casa del dragón",2022);

        ArrayList<Titulo> lista = new ArrayList<>(); // se crea un ArrayList para agregar las peliculas //se cambio a titulo para poder agregar tambien series


        lista.add(miPelicula);
        lista.add(otraPelicula);
        lista.add(casaDragon);
        lista.add(peliculaDeBrueno);



for(Titulo item: lista
        ){
    System.out.println(item.getNombre());
    // se hace un casteo para convertir el tipo de dato
    if (item instanceof Pelicula pelicula && pelicula.getClasificacion()> 2){            //para quitar el error de que no imprimia la serie
                                                                                         // y se realiza el casteo
       // Pelicula pelicula =(Pelicula)item; // casteo

        System.out.println(pelicula.getClasificacion());

    }


        }

//---------------------------------------------------------------- Crear y ordenar artistas
        ArrayList<String> listaDeArtistas = new ArrayList<>();

        listaDeArtistas.add("Penelope Cruz");
        listaDeArtistas.add("Antonio Banderas");
        listaDeArtistas.add("Ricardo Darin");
        listaDeArtistas.add("Shakira");

        System.out.println("Lista de artista no ordenada\n" + listaDeArtistas);

        Collections.sort(listaDeArtistas);                                //El sort ordena la lista
        System.out.println("Lista de Artistas ordenada\n" + listaDeArtistas);

        //----------------------------------------------------------------

        Collections.sort(lista);

        System.out.println("Lista de Titulos ordenados de lista " + lista ); //genera lista ordenada de Lista que tiene varios atributos
                                                                             // ademas del nombre




            }



}

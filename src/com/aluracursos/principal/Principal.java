package com.aluracursos.principal;

import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempos;
import com.aluracursos.screenmatch.calculos.FiltroRecomendacion;
import com.aluracursos.screnmatch.modelos.Episodios;
import com.aluracursos.screnmatch.modelos.Pelicula;
import com.aluracursos.screnmatch.modelos.Series;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula("Jurassic Park" , 1993);

       // miPelicula.setNombre();  llamado al metodo setter de la variable privada nombre , pero como se creo un constructor para setNombre ya no se utiliza
      //  miPelicula.setFechaDeLanzamiento(1993);   // Se deshabilita por que ya esta en los parametros junto con nombre
        miPelicula.setDuracionEnMinutos(120);
        miPelicula.evalua(7);
        miPelicula.evalua(9);
        miPelicula.evalua(8);


        miPelicula.muestraFichaTecnica();
        System.out.println(miPelicula.getTotalDeLasEvaluaciones()); // llamado al metodo getTotalDeLasEvaluaciones , modificador de accesdo
        System.out.println(miPelicula.calculaMedia());


        Series casaDragon = new Series("La casa del dragón",2022);

        //casaDragon.setNombre("La casa del dragón");
        //casaDragon.setFechaDeLanzamiento(2022);
        casaDragon.setTemporadas(1);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.setEpisodiosPorTemporada(10);

        casaDragon.muestraFichaTecnica();
        System.out.println(casaDragon.getDuracionEnMinutos());  // llama a duraccion en minutos segun la clase invocada

        Pelicula otraPelicula = new Pelicula("Jurassic world", 2015);

        //otraPelicula.setFechaDeLanzamiento(2015);
        otraPelicula.setDuracionEnMinutos(180);


        CalculadoraDeTiempos calculadora = new CalculadoraDeTiempos(); //instancia para calcular duracion de varias peliculas y series

        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        calculadora.incluye(otraPelicula);


        System.out.println("Tiempo necesario para ver tus titulos favoritos estas vacaciones " + calculadora.getTiempoTotal());


        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();

        filtroRecomendacion.filtra(miPelicula);

        Episodios episodios = new Episodios();

        episodios.setNombre("La Casa Targaryan");
        episodios.setNumero(1);
        episodios.setSeries(casaDragon);
        episodios.setTotalVisualizaciones(300);

        filtroRecomendacion.filtra(episodios);

       // ---------------------------------------------------------------------------------------------------

       var peliculaDeBrueno = new Pelicula("El señor de los anillos" , 2001); //var hace referencia a la Clase Pelicula, por eso podemos colocar var en vez de Pelicula


        peliculaDeBrueno.setDuracionEnMinutos(180);
       // peliculaDeBrueno.setFechaDeLanzamiento(2001);

        ArrayList <Pelicula> listaDePeliculas = new ArrayList<>(); // se crea un ArrayList para agregar las peliculas

        listaDePeliculas.add(peliculaDeBrueno);
        listaDePeliculas.add(miPelicula);
        listaDePeliculas.add(otraPelicula);

        // Para imprimir tamaño de la lista y numero de la pelicula (Imprime la referencia del objeto en la memoria

        System.out.println("Tamaño de la Pelicula: " + listaDePeliculas.size());
        System.out.println("La primera Pelicula es: " +listaDePeliculas.get(0).getNombre());

        // Imprimir lista de peliculas
        System.out.println(listaDePeliculas);

        System.out.println("toString de la pelicula. " + listaDePeliculas.get(0).toString());










    }
}

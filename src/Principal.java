import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempos;
import com.aluracursos.screnmatch.modelos.Pelicula;
import com.aluracursos.screnmatch.modelos.Series;

public class Principal {
    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula();

        miPelicula.setNombre("Jurassic Park"); // llamado al metodo setter de la variable privada nombre
        miPelicula.setFechaDeLanzamiento(1993);
        miPelicula.setDuracionEnMinutos(120);
        miPelicula.evalua(7);
        miPelicula.evalua(9);
        miPelicula.evalua(8);


        miPelicula.muestraFichaTecnica();
        System.out.println(miPelicula.getTotalDeLasEvaluaciones()); // llamado al metodo getTotalDeLasEvaluaciones , modificador de accesdo
        System.out.println(miPelicula.calculaMedia());


        Series casaDragon = new Series();

        casaDragon.setNombre("La casa del dragón");
        casaDragon.setFechaDeLanzamiento(2022);
        casaDragon.setTemporadas(1);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.setEpisodiosPorTemporada(10);

        casaDragon.muestraFichaTecnica();
        System.out.println(casaDragon.getDuracionEnMinutos());  // llama a duraccion en minutos segun la clase invocada

        Pelicula otraPelicula = new Pelicula();

        otraPelicula.setNombre("Jurassic world");
        otraPelicula.setFechaDeLanzamiento(2015);
        otraPelicula.setDuracionEnMinutos(180);


        CalculadoraDeTiempos calculadora = new CalculadoraDeTiempos(); //instancia para calcular duracion de varias peliculas y series

        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        calculadora.incluye(otraPelicula);


        System.out.println("Tiempo necesario para ver tus titulos favoritos estas vacaciones " + calculadora.getTiempoTotal());










    }
}

package com.aluracursos.screnmatch.modelos;

public class Series extends Titulo {
    int temporadas;
    int episodiosPorTemporada;
    int minutosPorEpisodio;

//---------------------------------------------------------------------------------------------------
    public Series(String nombre, int fechaDeLanzamiento) {   //llaamada al constructor de titulo
        super(nombre, fechaDeLanzamiento);
    }
//----------------------------------------------------------------------------------------------------------
    @Override              //indica que este metodo es una sobre escritura
    public int getDuracionEnMinutos() {  // calcular la duracion en minutos de la serie



        return temporadas * episodiosPorTemporada * minutosPorEpisodio;
    }
//-------------------------------------------------------------------------------------
    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }


    @Override
    public String toString() {
        return "Series: " + this.getNombre() + "(" + this.getFechaDeLanzamiento() + ")" ;
    }
}





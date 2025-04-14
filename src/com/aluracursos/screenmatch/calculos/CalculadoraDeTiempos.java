package com.aluracursos.screenmatch.calculos;

import com.aluracursos.screnmatch.modelos.Pelicula;
import com.aluracursos.screnmatch.modelos.Series;
import com.aluracursos.screnmatch.modelos.Titulo;

public class CalculadoraDeTiempos {

    private int tiempoTotal;

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public void incluye(Titulo titulo) {                    //polimorfismo

        this.tiempoTotal += titulo.getDuracionEnMinutos();


    }

    /*public void incluye(Series series) {

        tiempoTotal += series.getDuracionEnMinutos();


    }*/
}

package com.aluracursos.screnmatch.modelos;

import com.aluracursos.screenmatch.calculos.Clasificacion;

public class Pelicula extends Titulo implements Clasificacion {
private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override                                   //para la clasificacion en estrellas
    public int getClasificacion() {
        return (int) (calculaMedia() / 2);


    }
}

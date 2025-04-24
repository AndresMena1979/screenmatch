package com.aluracursos.screnmatch.modelos;

import com.aluracursos.screenmatch.calculos.Clasificacion;

public class Pelicula extends Titulo implements Clasificacion {
private String director;

//----------------------------------------------------------------------------------------------------------

 // public Pelicula(String nombre) { //COnstructor eliminado al crear el constructor que recibe dos parametros
 // this. setNombre(nombre);
 //   }

//------------------------------------------------------------------------- *** llamada al constructor de la clase madre (Titulo)

    public Pelicula(String nombre, int fechaDeLanzamiento) {
        super(nombre, fechaDeLanzamiento);
    }
//--------------------------------------------------------------------------------------
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
   // Sobre escribio toString() para mostrar los datos de la pelicula y no su codigo en memoria
    @Override
    public String toString() {
        return "Pelicula: " + this.getNombre() + "(" + getFechaDeLanzamiento() + ")";


    }
}


package com.aluracursos.screnmatch.modelos;

import com.aluracursos.screnmatch.excepsion.ErrorEnConversionDeDuracionException;

public class Titulo implements Comparable<Titulo > {
    private String nombre;
    private   int fechaDeLanzamiento;
    private   int duracionEnMinutos;
    private boolean incluidoEnElPlan;
    private double sumaDeLasEvaluaciones;
    private int totalDeLasEvaluaciones;

    // ------------------------------------------------------------ Creacion de Constructor


    public Titulo(String nombre, int fechaDeLanzamiento) {
        this.nombre = nombre;
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }
//-------------------------------------------------------------------------------
    public Titulo(TituloOmdb miTituloOmdb) throws ErrorEnConversionDeDuracionException {         //Constructor que recibe los datos jason

        this.nombre=miTituloOmdb.title();
        this.fechaDeLanzamiento=Integer.valueOf(miTituloOmdb.year());

        if (miTituloOmdb.runtime().contains("N/A")) {

            throw new ErrorEnConversionDeDuracionException("no pude convertir la duración," +
                    "porque contiene un N/A");
        }

        this.duracionEnMinutos= Integer.valueOf(miTituloOmdb.runtime().substring(0,3).replace(" ", "")); //substring extare los 3 primero caracteres de Runtime




        }
//--------------------------------------------------------------------------------------

    public String getNombre() {       //getter para llamar a las variable privadas
        return nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public boolean isIncluidoEnElPlan() {
        return incluidoEnElPlan;
    }

    // --------------------------------------------------------------------------------------------------
    public void setNombre(String nombre) {    // Setter para la varaibler privada nombre
        this.nombre = nombre;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
        this.incluidoEnElPlan = incluidoEnElPlan;
    }

    public int getTotalDeLasEvaluaciones(){

        return  totalDeLasEvaluaciones;    // para poder llamar a la variable privada  totalDeLasEvaluaciones

    }

    public void muestraFichaTecnica(){

        System.out.println(nombre);
        System.out.println(fechaDeLanzamiento);
        System.out.println(getDuracionEnMinutos());



    }

    public void evalua (double nota) {

        sumaDeLasEvaluaciones += nota;
        totalDeLasEvaluaciones++;



    }

    public double calculaMedia(){

        return sumaDeLasEvaluaciones / totalDeLasEvaluaciones;
    }

    @Override                                           //Permite comparar nombre de  lista que tiene varios atributos
    public int compareTo(Titulo otroTitulo) {
        return this.getNombre().compareTo(otroTitulo.getNombre());
    }


    @Override
    public String toString() {
        return  "(nombre='" + nombre +
                ", fechaDeLanzamiento= " + fechaDeLanzamiento +
                ", duracion= " + duracionEnMinutos +
                ")";
    }
}

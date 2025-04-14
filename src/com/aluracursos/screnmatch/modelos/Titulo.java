package com.aluracursos.screnmatch.modelos;

public class Titulo {
    private String nombre;
    private   int fechaDeLanzamiento;
    private   int duracionEnMinutos;
    private boolean incluidoEnElPlan;
    private double sumaDeLasEvaluaciones;
    private int totalDeLasEvaluaciones;


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
}

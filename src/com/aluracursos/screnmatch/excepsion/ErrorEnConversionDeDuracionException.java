package com.aluracursos.screnmatch.excepsion;

public class ErrorEnConversionDeDuracionException extends RuntimeException {

    private String mensaje;

public ErrorEnConversionDeDuracionException(String mensaje){

    this.mensaje=mensaje;


}

    @Override
    public String getMessage() {  //cambia el mensaje de getMensaje por el mensaje creado por nosotros
        return this.mensaje;
    }
}

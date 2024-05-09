package com.aluracursos.screenmatch.modelos;

import com.aluracurosos.screenmatch.calculadora.Clasidicacion;

public class Pelicula extends Titulo implements Clasidicacion {
    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClasificacion() {
        return (int) (calculaMedia()/2);
    }
}

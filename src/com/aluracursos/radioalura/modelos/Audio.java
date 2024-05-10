package com.aluracursos.radioalura.modelos;

public class Audio {
    private String titulo;
    private int duracion;
    private int totalDeReproduccion;
    private int meGusta;
    private int casificaciones;

    public void meGusta(){
        this.meGusta++;    }
    public void reproducir(){
        this.totalDeReproduccion++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getTotalDeReproduccion() {
        return totalDeReproduccion;
    }

    public void setTotalDeReproduccion(int totalDeReproduccion) {
        this.totalDeReproduccion = totalDeReproduccion;
    }

    public int getMeGusta() {
        return meGusta;
    }

    public void setMeGusta(int meGusta) {
        this.meGusta = meGusta;
    }

    public int getCasificaciones() {
        return casificaciones;
    }

    public void setCasificaciones(int casificaciones) {
        this.casificaciones = casificaciones;
    }

}

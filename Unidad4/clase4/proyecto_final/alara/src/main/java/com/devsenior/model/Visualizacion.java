package com.devsenior.model;

public class Visualizacion {
   
    private Usuario usuario;
    private Pelicula pelicula;
    private int minutos;


    public Visualizacion(Usuario usuario, Pelicula pelicula, int minutos) {
        this.usuario = usuario;
        this.pelicula = pelicula;
        this.minutos = minutos;
    }


    public Usuario getUsuario() {
        return usuario;
    }


    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }


    public Pelicula getPelicula() {
        return pelicula;
    }


    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }


    public int getMinutos() {
        return minutos;
    }


    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }


    @Override
    public String toString() {
        return "Visualizacion [usuario=" + usuario + ", pelicula=" + pelicula + ", minutos=" + minutos + "]";
    }

    
    

    
}

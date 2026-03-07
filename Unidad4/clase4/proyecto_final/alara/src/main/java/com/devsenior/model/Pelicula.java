package com.devsenior.model;

public class Pelicula {
  
    private int id;
    private String titulo;
    private Genero genero;
    private int duración;

    
    public Pelicula(int id, String titulo, Genero genero, int duración) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.duración = duración;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public Genero getGenero() {
        return genero;
    }
    public void setGenero(Genero genero) {
        this.genero = genero;
    }
    public int getDuración() {
        return duración;
    }
    public void setDuración(int duración) {
        this.duración = duración;
    }


    @Override
    public String toString() {
        return "Pelicula [titulo=" + titulo + ", genero=" + genero + "]";
    }

    
}

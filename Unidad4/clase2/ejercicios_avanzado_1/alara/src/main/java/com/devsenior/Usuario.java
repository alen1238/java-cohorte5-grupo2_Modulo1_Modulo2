package com.devsenior;

import java.util.List;

public class Usuario {
    private String nombre;
    private int edad;
    private String carrera;
    private int publicaciones;
    private List<String> intereses;

    public Usuario(String nombre, int edad, String carrera, int publicaciones, List<String> intereses) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
        this.publicaciones = publicaciones;
        this.intereses = intereses;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public int getPublicaciones() {
        return publicaciones;
    }

    public List<String> getIntereses() {
        return intereses;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", carrera='" + carrera + '\'' +
                ", publicaciones=" + publicaciones +
                ", intereses=" + intereses +
                '}';
    }
}

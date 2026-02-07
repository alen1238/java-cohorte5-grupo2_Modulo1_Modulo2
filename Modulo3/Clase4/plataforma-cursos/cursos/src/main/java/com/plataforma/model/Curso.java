package com.plataforma.model;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nombre;
    private String codigo;
    private int capcidad;
    private List<Estudiante> estudiantes;

    public Curso(String nombre, String codigo, int capcidad) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.capcidad = capcidad;
        this.estudiantes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getCapcidad() {
        return capcidad;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nombre='" + nombre + '\'' +
                ", codigo='" + codigo + '\'' +
                ", capcidad=" + capcidad +
                ", estudiantes=" + estudiantes +
                '}';
    }
}

package com.plataforma.model;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nombre;
    private String codigo;
    private int capacidad;
    private List<Estudiante> estudiantes;

    public Curso(String nombre, String codigo, int capcidad) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.capacidad = capcidad;
        this.estudiantes = new ArrayList<>();
    }

        public void agregarEstudiante(Estudiante estudiante) {
            if (!estaLleno()) {
                estudiantes.add(estudiante);
            }
        }

        public void eliminarEstudiante(Estudiante estudiante) {
            estudiantes.remove(estudiante);
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

    public int getCapacidad() {
        return capacidad;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public boolean estaLleno() {
        return estudiantes.size() >= capacidad;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nombre='" + nombre + '\'' +
                ", codigo='" + codigo + '\'' +
                ", capacidad=" + capacidad +
                ", estudiantes=" + estudiantes +
                '}';
    }
}

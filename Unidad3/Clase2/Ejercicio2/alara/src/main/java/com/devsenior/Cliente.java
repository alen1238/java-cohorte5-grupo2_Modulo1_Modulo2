package com.devsenior;

public class Cliente {
    private String nombre;
    private boolean activo;

    public Cliente(String nombre, boolean activo) {
        this.nombre = nombre;
        this.activo = activo;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isActivo() {
        return activo;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", activo=" + activo +
                '}';
    }
}

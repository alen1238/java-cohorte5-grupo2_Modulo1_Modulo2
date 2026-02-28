package com.devsenior;

public class Producto {
    private String nombre;
    private String categoria;
    private int precio;
    private boolean disponible;

    public Producto(String nombre, String categoria, int precio, boolean disponible) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.disponible = disponible;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getPrecio() {
        return precio;
    }

    public boolean isDisponible() {
        return disponible;
    }

    @Override
    public String toString() {
        return "Producto [nombre=" + nombre + ", categoria=" + categoria + ", precio=" + precio + ", disponible="
                + disponible + "]";
    }

    
    
}

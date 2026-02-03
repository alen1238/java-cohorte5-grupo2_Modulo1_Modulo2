package com.devsenior;

public class Cliente {
    private String nombre;
    private String documento;

    public Cliente(String nombre, String documento) {
        if(nombre == null || documento == null) {
            throw new IllegalArgumentException("Datos del cliente invalidos");
        }
        this.nombre = nombre;
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }
    public String getDocumento() {
        return documento;
    }


}

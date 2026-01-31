package com.devsenior;

public class Pedido {
    private Cliente cliente;
    private Producto producto;
    private int cantidad;

    public Pedido(Cliente cliente, Producto producto, int cantidad) {
        this.cliente = cliente;
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "cliente=" + cliente +
                ", producto=" + producto +
                ", cantidad=" + cantidad +
                '}';
    }
}

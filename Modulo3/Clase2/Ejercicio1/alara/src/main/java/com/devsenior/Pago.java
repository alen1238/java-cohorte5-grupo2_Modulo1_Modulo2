package com.devsenior;

public class Pago {
    private Cliente cliente;
    private double monto;
    private double saldoDisponible;

    public Pago(Cliente cliente, double monto, double saldoDisponible) {
        this.cliente = cliente;
        this.monto = monto;
        this.saldoDisponible = saldoDisponible;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getMonto() {
        return monto;
    }

    public double getSaldoDisponible() {
        return saldoDisponible;
    }
    

}

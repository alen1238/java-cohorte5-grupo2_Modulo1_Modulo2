package com.devsenior;

public class CuentaBancaria {
    private double saldo;
    private Cliente cliente;
    private TipoCuenta tipoCuenta;

    public CuentaBancaria(Cliente cliente, TipoCuenta tipoCuenta, double saldoInicial) {
        if(this.cliente == null || this.tipoCuenta == null) {
            throw new IllegalArgumentException("Cliente y TipoCuenta no pueden ser nulos");
        }
        if(saldoInicial < 0) {
            throw new IllegalArgumentException("El saldo inicial no puede ser negativo");
        }
        this.cliente = cliente;
        this.tipoCuenta = tipoCuenta;
        this.saldo = saldoInicial;
    }

    public void consignar(double monto) {
        if(monto <= 0) {
            throw new IllegalArgumentException("El monto a consignar debe ser mayor que cero");
        }
        saldo += monto;
    }

    public void retirar(double monto) {
        if(monto <= 0) {
            throw new IllegalArgumentException("El monto a retirar debe ser mayor que cero");
        }
        if(monto > saldo) {
            throw new IllegalArgumentException("Fondos insuficientes para realizar el retiro");
        }
        saldo -= monto;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }
    
    public TipoCuenta getTipoCuenta() {
        return tipoCuenta;
    }
}

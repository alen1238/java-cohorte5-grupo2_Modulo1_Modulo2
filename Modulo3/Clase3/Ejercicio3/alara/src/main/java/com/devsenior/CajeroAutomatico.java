package com.devsenior;

public class CajeroAutomatico {
   
    private int saldo;

    public CajeroAutomatico(int saldoInicial) {
        this.saldo = saldoInicial;
    }

    public boolean tieneFondos(){
        return saldo > 0;
    }

     public int consultarSaldo(){
        return saldo;
     }

     public int retirar(int cantidad){
        if(cantidad > this.saldo){
            throw new IllegalArgumentException("Fondos insuficientes");
        }
        this.saldo -= cantidad; //this.saldo = this.saldo - cantidad
        return cantidad; // retorna la cantidad retirada
     }
}

package com.devsenior;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private List<CuentaBancaria> cuentas = new ArrayList<>();

    public void agregarCuenta(CuentaBancaria cuenta) {
        if(cuenta == null) {
            throw new IllegalArgumentException("La cuenta no puede ser nula");
        }   
        cuentas.add(cuenta);
    }

    public boolean existeCuenta(CuentaBancaria cuenta) {
        return cuentas.contains(cuenta);
    }

    public int totalCuentas() {
        return cuentas.size();
    }

}
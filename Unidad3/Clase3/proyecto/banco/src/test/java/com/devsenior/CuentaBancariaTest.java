package com.devsenior;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CuentaBancariaTest {

    //Probamos que cuando la cuenta recibe datos validos se crea correctamente
    //debe devolver el cliete adecuado, el tipo de cuenta y el saldo inicial
    @Test
    void testCrearCuentaValida() {
        Cliente cliente = new Cliente("Juan Perez", "123456789");
        TipoCuenta tipoCuenta = TipoCuenta.AHORRO;
        CuentaBancaria cuenta = new CuentaBancaria(cliente, tipoCuenta, 1000.0);

        assertNotNull(cuenta);
        assertEquals(cliente, cuenta.getCliente());
        assertEquals(tipoCuenta, cuenta.getTipoCuenta());
        assertEquals(1000.0, cuenta.getSaldo());
    }

    @Test
    void testCrearCuentaConClienteNulo() {
        TipoCuenta tipoCuenta = TipoCuenta.AHORRO;
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new CuentaBancaria(null, tipoCuenta, 1000.0);
        });
        assertEquals("Cliente y TipoCuenta no pueden ser nulos", exception.getMessage());
    }
}

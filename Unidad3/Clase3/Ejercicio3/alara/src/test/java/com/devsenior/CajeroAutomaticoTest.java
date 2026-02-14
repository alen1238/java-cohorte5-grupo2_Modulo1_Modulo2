package com.devsenior;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CajeroAutomaticoTest {
    @Test
    void testConsultarSaldoInicial() {
        CajeroAutomatico cajero = new CajeroAutomatico(1000);
        assertEquals(1000, cajero.consultarSaldo());
        assertTrue(cajero.tieneFondos());
    }

    @Test
    void testRetiroCorrecto() {
        CajeroAutomatico cajero = new CajeroAutomatico(1000);
        assertEquals(300, cajero.retirar(300));
        assertEquals(700, cajero.consultarSaldo());
        assertTrue(cajero.tieneFondos());
    }

    //testeamos la regla de negocio:
    // no se puede retirar mas dinero del que hay en el cajero
    //esperamos que lance un mensaje de error adecuado, y que el saldo no se modifique
    @Test
    void testRetiroExcedeSaldo() {
        CajeroAutomatico cajero = new CajeroAutomatico(500);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            cajero.retirar(600);
        });
        assertEquals("Fondos insuficientes", exception.getMessage());
        assertEquals(500, cajero.consultarSaldo());
        assertTrue(cajero.tieneFondos());
    }

    //testeamos el comportamiento cuando la cantidad a retirar es igual al saldo disponible,
    //esperamos que el retiro sea exitoso y que el saldo quede en cero
    @Test
    void testRetiroTotal() {
        CajeroAutomatico cajero = new CajeroAutomatico(400);
        assertEquals(400, cajero.retirar(400));
        assertEquals(0, cajero.consultarSaldo());
        assertFalse(cajero.tieneFondos());
    }

    //Un cajero con saldo inicial en cero, debe reflejar que no tiene fondos disponibles
    // debe ser un elemento listo para usarse despues de su creacion.
    @Test
    void testInstanciaNoNula() {
        CajeroAutomatico cajero = new CajeroAutomatico(0);
        assertNotNull(cajero);
        assertFalse(cajero.tieneFondos());
    }

}

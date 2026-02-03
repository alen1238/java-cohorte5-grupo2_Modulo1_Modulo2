package com.devsenior;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ClienteTest {
    @Test
    void testCrearClienteValido() {
        Cliente cliente = new Cliente("Juan Perez", "12345678");
        assertNotNull(cliente);
        assertEquals("Juan Perez", cliente.getNombre());
        assertEquals("12345678", cliente.getDocumento());
    }   

    @Test
    void testCrearClienteConNombreNulo() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Cliente(null, "12345678");
        });
        assertEquals("Datos del cliente invalidos", exception.getMessage());
    }

    @Test
    void testCrearClienteConDocumentoNulo() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Cliente("Juan Perez", null);
        });
        assertEquals("Datos del cliente invalidos", exception.getMessage());
    }

    
}

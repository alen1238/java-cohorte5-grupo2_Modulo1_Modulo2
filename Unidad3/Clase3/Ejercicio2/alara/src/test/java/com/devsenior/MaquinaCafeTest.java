package com.devsenior;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MaquinaCafeTest {
    @Test
    void testCafeListo(){
        MaquinaCafe maquina = new MaquinaCafe(true, true);
        assertEquals("Café preparado", maquina.prepararCafe());
    }

    @Test
    void testFaltaAgua(){
        MaquinaCafe maquina = new MaquinaCafe(false, true);
        assertEquals("Falta agua", maquina.prepararCafe());
    }

    @Test
    void testFaltaCafe(){
        MaquinaCafe maquina = new MaquinaCafe(true, false);
        assertEquals("Falta café", maquina.prepararCafe());
    }

    @Test
    void testFaltaAguaYCafe(){
        MaquinaCafe maquina = new MaquinaCafe(false, false);
        assertEquals("Falta agua y café", maquina.prepararCafe());
    }
}

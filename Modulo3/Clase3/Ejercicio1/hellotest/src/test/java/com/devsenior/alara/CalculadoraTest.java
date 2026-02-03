package com.devsenior.alara;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    @Test
    void testSuma(){
        Calculadora calc = new Calculadora();
        assertEquals(5,calc.sumar(3, 2));
    }

    @Test
    void testResta(){
        Calculadora calc = new Calculadora();
        assertEquals(1,calc.restar(3, 2));
    }

    @Test
    void testMultiplicacion(){
        Calculadora calc = new Calculadora();
        assertEquals(6,calc.multiplicar(3, 2));
    }

    @Test
    void testDivision(){
        Calculadora calc = new Calculadora();
        assertEquals(2,calc.dividir(4, 2));
    }

    @Test
    void testDivisionPorCero(){
        Calculadora calc = new Calculadora();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calc.dividir(4, 0);
        });
        assertEquals("El divisor no puede ser cero.", exception.getMessage());
    }
}

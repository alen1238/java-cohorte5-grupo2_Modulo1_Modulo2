package com.devsenior;

import org.apache.logging.log4j.*;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        logger.info("===Sistema de pagos iniciado===");

        ProcesadorPago procesador = new ProcesadorPago();

        Pago pagoValido = new Pago(new Cliente("Juan Perez", 123), 150.0, 200.0);
        Pago pagoInvalido = new Pago(new Cliente("Maria Gomez", 456), 300.0, 250.0);
        Pago pagoCero = new Pago(new Cliente("Carlos Ruiz", 789), 0.0, 0.0);


        procesador.procesar(pagoValido);
        procesador.procesar(pagoInvalido);
        procesador.procesar(pagoCero);

        logger.info("===Sistema de pagos finalizado===");
    }
}
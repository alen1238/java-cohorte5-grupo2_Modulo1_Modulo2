package com.devsenior;

import org.apache.logging.log4j.*;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class); // instanciamos el logger, que es el que nos permite crear o escribir los logs configurdos.
    public static void main(String[] args) {
            logger.info("Inicio del programa"); // Nivel INFO

            Empleado empleado = new Empleado("Juan Perez", 30, 50000);
            Gerente gerente = new Gerente("Ana Gomez", 40, 80000, "Ventas");

            //mostrar informacion de los objetos creados
            logger.info("Creando empleado: " + empleado); // Nivel DEBUG
            logger.info("Creando gerente: " + gerente); // Nivel DEBUG

            // Simulamos una operacion
            empleado.aumentarSalario(10);
            logger.info("Salario del empleado despues del aumento: " + empleado.getSalario()); // Nivel INFO

            gerente.aumentarSalario(15);
            logger.info("Salario del gerente despues del aumento: " + gerente.getSalario());


            logger.info("Fin del programa"); // Nivel INFO
            logger.trace("Este es un mensaje de traza detallada"); // Nivel TRACE
            logger.debug("Este es un mensaje de depuracion"); // Nivel DEBUG
            logger.warn("Este es un mensaje de advertencia"); // Nivel WARN
            logger.error("Este es un mensaje de error"); // Nivel ERROR
            logger.fatal("Este es un mensaje fatal"); // Nivel FATAL

    }
}
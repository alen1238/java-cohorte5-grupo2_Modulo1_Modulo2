package com.devsenior;

import org.apache.logging.log4j.*;

public class ProcesadorPago {
    private static final Logger logger = LogManager.getLogger(ProcesadorPago.class);


    public void procesar(Pago pago) {
        //info: información general sobre el flujo de la aplicación
        logger.info("Iniciando el procesamiento del pago para el cliente: {}", 
                                                         pago.getCliente().getNombre());

        //debug: información técnica para el desarrollador
        logger.debug("Detalles del pago - Monto: {}, Saldo Disponible: {}", 
                                             pago.getMonto(), pago.getSaldoDisponible());

        if(pago.getMonto() <= 0){
            //aqui va el código para manejar el caso de monto inválido, incluyendo lanzament de excepción
            //Error: problemas que impiden el funcionamiento correcto de la aplicación
            logger.error("El monto del pago debe ser mayor que cero. Monto proporcionado: {}", pago.getMonto());
            return; // Salir del método en caso de error, y retornar el manejo del error y excepciones según sea necesario
        }

        if(pago.getMonto() > pago.getSaldoDisponible()){
            //aqui va el código para manejar el caso de fondos insuficientes, incluyendo lanzament de excepción
            logger.error("Fondos insuficientes para el cliente: {}. Monto del pago: {}, Saldo Disponible: {}", 
                         pago.getCliente().getNombre(), pago.getMonto(), pago.getSaldoDisponible());
            return; // Salir del método en caso de advertencia, y retornar el manejo del error y excepciones según sea necesario
        }

        //aqui va el código para procesar el pago exitosamente
        logger.info("Pago procesado exitosamente para el cliente: {}. Monto: {}", 
                     pago.getCliente().getNombre(), pago.getMonto());

        logger.info("Fin del procesamiento del pago para el cliente: {}", 
                      pago.getCliente().getNombre());

        
    }
}

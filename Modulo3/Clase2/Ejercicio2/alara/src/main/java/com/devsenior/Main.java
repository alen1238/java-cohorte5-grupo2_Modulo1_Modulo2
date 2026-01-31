package com.devsenior;

import org.apache.logging.log4j.*;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        logger.info("Application started.");
        Cliente cliente = new Cliente("João Silva", true);
        logger.info("Created client: " + cliente);

        Cliente clienteInactivo = new Cliente("Maria Souza", false);
        logger.info("Created client: " + clienteInactivo);

        Producto producto = new Producto("Laptop", 50, 3500.00);
        logger.info("Created product: " + producto);
        Producto producto2 = new Producto("Smartphone", 100, 1500.00);
        logger.info("Created product: " + producto2);

        Producto producto3 = new Producto("Tablet", 30, 800.00);
        logger.info("Created product: " + producto3);

        ProcesadorPedido procesadorPedidos = new ProcesadorPedido();
        procesadorPedidos.procesar(new Pedido(cliente, producto, 2));
        procesadorPedidos.procesar(new Pedido(clienteInactivo, producto2, 1));
        procesadorPedidos.procesar(new Pedido(cliente, producto3, 0));
        procesadorPedidos.procesar(new Pedido(cliente, producto3, 40));
        

        // Your application logic here
        logger.info("Application finished.");
    }
}
package com.devsenior;

import org.apache.logging.log4j.*;

public class ProcesadorPedido {
    
    private static final Logger logger = LogManager.getLogger(ProcesadorPedido.class);

    public void procesar(Pedido pedido) {
            logger.info("Procesando pedido para el cliete {}", pedido.getCliente().getNombre());

            //Detalles técnicos del pedido
            logger.debug("Producto {}, cantidad solicitada {}, stock disponible {}", 
                         pedido.getProducto().getNombre(), 
                         pedido.getCantidad(), 
                         pedido.getProducto().getStock());

            //Regla 1: el cliente debe estar activo
            if (!pedido.getCliente().isActivo()) {
                logger.error("El cliente {} no está activo. No se puede procesar el pedido.", pedido.getCliente().getNombre());
                return;
            }

            //Regla 2: el pedido debe contener al menos un producto
            if (pedido.getCantidad() <= 0) {
                logger.error("La cantidad solicitada {} no es válida para el producto {}.", 
                             pedido.getCantidad(), 
                             pedido.getProducto().getNombre());
                return;
            }

            //Regla 3: debe haber suficiente stock para el producto solicitado
            if (pedido.getCantidad() > pedido.getProducto().getStock()) {
                logger.error("No hay suficiente stock para el producto {}. Cantidad solicitada: {}, Stock disponible: {}", 
                             pedido.getProducto().getNombre(), 
                             pedido.getCantidad(), 
                             pedido.getProducto().getStock());
                return;
            }

            //Si todas las reglas se cumplen, procesar el pedido
            pedido.getProducto().reducirStock(pedido.getCantidad());
            logger.info("Pedido procesado exitosamente para el cliente {}. Producto: {}, Cantidad: {}", 
                        pedido.getCliente().getNombre(), 
                        pedido.getProducto().getNombre(), 
                        pedido.getCantidad());

            //info. en etapa de desarrollo
            logger.debug("Nuevo stock para el producto {}: {}", 
                         pedido.getProducto().getNombre(), 
                         pedido.getProducto().getStock());
            

    }

}

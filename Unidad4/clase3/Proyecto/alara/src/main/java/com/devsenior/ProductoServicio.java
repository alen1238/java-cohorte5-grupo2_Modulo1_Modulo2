package com.devsenior;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductoServicio {
    private List<Producto> productos;

    public ProductoServicio(List<Producto> productos) {
        this.productos = productos;
    }

    public List<String> productosDisponiblesMayorA(int precioMinimo){
        var resultado = productos.stream()          
                                .filter(Producto::isDisponible)
                                .filter(p -> p.getPrecio() > precioMinimo)
                                .map(Producto::getNombre)
                                .toList();
            return resultado;
    }

    public List<Producto> productosPorCategoriaOrdenados(String categoria){
        return productos.stream() 
                        .filter(p -> p.getCategoria().equalsIgnoreCase(categoria))
                        .sorted(Comparator.comparingInt(Producto::getPrecio))
                        .toList();
    }

    public List<Double> obtenerPreciosConPorcentajeDescuento(double descuento){
        return productos.stream()   
                        .map(p -> p.getPrecio()*(1-descuento))
                        .toList();
    }

    public Map<String, Double> obtenerProductosConDescuento(double descuento){
        var precios = productos.stream()       
                        .map(p ->
                            p.getPrecio()*(1-descuento))
                        .toList();
        var nombres = productos.stream()
                                .map(Producto::getNombre)
                                .toList();
        
        Map<String, Double> resultado = new HashMap<>();
        for (int i = 0; i < nombres.size();i++) {
            resultado.put(nombres.get(i), precios.get(i));
        }
        return resultado;
    }
    
}

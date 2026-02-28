package com.devsenior;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Producto> productos = List.of(
            new Producto("Laptop", "tecnologia", 3000),
            new Producto("Mouse", "tecnologia", 80),
            new Producto("Silla", "hogar", 300),
            new Producto("Mesa", "hogar", 700),
            new Producto("Monitor", "tecnologia", 600)
        );

        
        //ejemploGroupingByConParametros(productos);
       //  ejemploSumingInt(productos);
        //ejemploGroupingBySummingInt(productos);
        ejemploSummarizingInt(productos);
   }

   public static void ejemploGroupingBy(List<Producto> productos) {
          var resultado = productos.stream() //pipelines son métodos sucesivos que se pasan valores unos a otros
                 .collect(Collectors.groupingBy(Producto::getCategoria)); // (key) ---> map(key, list<T>)
          
       resultado.forEach((categoria, lista)->{
            System.out.println("categoría: " + categoria);
            lista.forEach(p -> System.out.println(p.getNombre()));
       });
   }

   public static void ejemploGroupingByConParametros(List<Producto> productos) {
            var resultado = productos.stream()
                                        .collect(Collectors.groupingBy(
                                            producto -> producto.getCategoria(),
                                            Collectors.counting()
                                        ));
            
           resultado.forEach((categoria, valor)->{
                  System.out.println("categoria: " + categoria);
                  System.out.println(valor);
           });
   }

   public static void ejemploSumingInt(List<Producto> productos) {
        //Sirve para sumar un campo o parámetro int de cada elemento del stream
       var resultado =  productos.stream()
                .collect(Collectors.summingInt(Producto::getPrecio));
        System.out.println(resultado);
   }

   public static void ejemploGroupingBySummingInt(List<Producto> productos) {
        //vamos a sumar precios por categoría: 1) agrupor por categoría  2) sumar totales de precios por categoria
      var resultado =  productos.stream()
                 .collect(Collectors.groupingBy(Producto::getCategoria,
                        Collectors.summingInt(Producto::getPrecio)    
                 ));
    
      resultado.forEach((categoria, total)->{
             System.out.printf("%s -> %d%n", categoria, total);    
      });
   }


   public static void ejemploSummarizingInt(List<Producto> productos) {
        
   }

}
package com.devsenior;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
       // ejercicio1();
        ejercicio2();
    }

    public static void ejercicio1(){
        /*
            Dada una lista de objetos de tipo Empleado, cada uno con los atributos nombre y salario,
            Filtra los empleados que tienen un salario mayor a 50000 y cuenta cuantos empleados
            cumplen con esta condición. Imprime el numero de empleados que ganan más de 50000.
        */

        var empleados = List.of(
                new Empleado("Juan", 45000),
                new Empleado("Maria", 55000),
                new Empleado("Pedro", 60000),
                new Empleado("Ana", 48000),
                new Empleado("Luis", 52000)
        );

         long cantidad = empleados.stream()
                .filter(e -> e.getSalario() > 50000)
                .count();

         System.out.println("Número de empleados con salario mayor a 50000: " + cantidad);

    }


    public static void ejercicio2(){
        /*
            Dada una lista de palabras, agrupalas segun la longitud de cada palabra.
            Imprime las palabras agregadas por su longitud, mostrando la longitud y
            la lista de palabras que tienen esa longitud.
        */

        var palabras = List.of("hola", "mundo", "java", "stream", "programacion", "devsenior", "ejercicio", "lambda", "filter", "map");
        var agrupadas = palabras.stream()
                .collect(Collectors.groupingBy(s -> s.length()));

        for(var entry : agrupadas.entrySet()){
            System.out.println("Longitud: " + entry.getKey() + " - Palabras: " + entry.getValue());
        }
    }
}
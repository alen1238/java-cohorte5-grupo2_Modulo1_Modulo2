package com.devsenior;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Usuario> usuarios = Datos.cargarUsuarios();


        List<Usuario> mayoresDe20 = usuarios.stream()
                .filter(u -> u.getEdad() > 20)
                .collect(Collectors.toList());
        System.out.println("Usuarios mayores de 20 años:");
        //mayoresDe20.forEach(System.out::println); // u -> System.out.println(u)
        

        List<String> estudiantesIngenieria = mayoresDe20.stream()
                .filter(u -> u.getCarrera().equalsIgnoreCase("Ingeniería de Sistemas"))
                .filter(u -> u.getPublicaciones() > 5)
                .map(u -> u.getNombre()) //map toma el stream de usuarios y lo transforma en un stream de nombres
                .collect(Collectors.toList());

        System.out.println("\nUsuarios mayores de 20 años que estudian Ingeniería de Sistemas:");
       // estudiantesIngenieria.forEach(System.out::println);

        double promedioEdadIA = usuarios.stream()
                .filter(u -> u.getIntereses().contains("IA"))
                .mapToInt(Usuario::getEdad) //mapToInt toma el stream de usuarios y lo transforma en un stream de enteros (edades)
                .average() //calcula el promedio de las edades
                .orElse(0); //si no hay usuarios con interés en IA, devuelve 0
        System.out.println("\nPromedio de edad de usuarios con interés en IA: " + promedioEdadIA);
    }
}   
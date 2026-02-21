package com.devsenior;

import java.util.ArrayList;
import java.util.List;

public class Datos {
    public static List<Usuario> cargarUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Alice", 25, "Ingeniería de Sistemas", 5, List.of("Programación", "IA")));
        usuarios.add(new Usuario("Bob", 30, "Ciencias de la Computación", 10, List.of("Seguridad Informática", "Redes")));
        usuarios.add(new Usuario("Charlie", 22, "Sistemas de Información", 3, List.of("Base de Datos", "Desarrollo Web")));
        usuarios.add(new Usuario("Diana", 28, "Ingeniería de Sistemas", 7, List.of("Programación", "DevOps", "IA")));
        usuarios.add(new Usuario("Eve", 35, "Ciencias de la Computación", 12, List.of("IA", "Seguridad Informática")));
        usuarios.add(new Usuario("Frank", 27, "Sistemas de Información", 4, List.of("Desarrollo Web", "Base de Datos")));
        usuarios.add(new Usuario("Grace", 18, "Ingeniería de Sistemas", 6, List.of("Programación", "Redes")));
        usuarios.add(new Usuario("Heidi", 32, "Ingeniería de Sistemas", 2, List.of("Seguridad Informática", "IA")));
        usuarios.add(new Usuario("Ivan", 29, "Ingeniería de Sistemas", 8, List.of("Redes", "DevOps", "IA")));
        //crea 10 usuarios mas de ingeniería de sistemas con diferentes edades, años de experiencia y habilidades
        usuarios.add(new Usuario("Judy", 24, "Ingeniería de Sistemas", 4, List.of("Programación", "IA")));
        usuarios.add(new Usuario("Karl", 26, "Ingeniería de Sistemas", 6, List.of("Seguridad Informática", "Redes")));
        usuarios.add(new Usuario("Leo", 31, "Ingeniería de Sistemas", 9, List.of("Base de Datos", "Desarrollo Web")));
        usuarios.add(new Usuario("Mallory", 27, "Ingeniería de Sistemas", 5, List.of("Programación", "DevOps", "IA")));
        usuarios.add(new Usuario("Nina", 29, "Ingeniería de Sistemas", 7, List.of("IA", "Seguridad Informática")));
        usuarios.add(new Usuario("Oscar", 23, "Ingeniería de Sistemas", 3   , List.of("Desarrollo Web", "Base de Datos")));
        usuarios.add(new Usuario("Peggy", 30, "Ingeniería de Sistemas", 8, List.of("Programación", "Redes")));
        usuarios.add(new Usuario("Quentin", 28, "Ingeniería de Sistemas", 6, List.of("Seguridad Informática", "IA")));
        usuarios.add(new Usuario("Rupert", 26, "Ingeniería de Sistemas", 4, List.of("Redes", "DevOps", "IA")));
        usuarios.add(new Usuario("Sybil", 27, "Ingeniería de Sistemas", 5, List.of("Programación", "IA"))); 
        return usuarios;
    }
}

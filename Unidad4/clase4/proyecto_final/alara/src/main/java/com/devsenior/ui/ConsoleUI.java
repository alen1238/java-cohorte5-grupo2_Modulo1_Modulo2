package com.devsenior.ui;

import java.util.Scanner;

import com.devsenior.service.AnalyticsService;

public class ConsoleUI {
    private AnalyticsService servicio;
    private Scanner sc;

    public ConsoleUI(AnalyticsService service){
        this.servicio = service;
        sc = new Scanner(System.in);
    }

    public void iniciar(){
        int opcion;

        do {
            System.out.println("1. Películas mas vistas");
            System.out.println("2. Películas por género");
            System.out.println("3. Tiempo total visto por usuario");
            System.out.println("4. Top usuarios");
            System.out.println("5. Promedio duracion por genero");
            System.out.println("0. Salir");
            opcion = sc.nextInt();
            
            switch (opcion) {
                case 1:
                        servicio.peliculasMasVistas()
                        .forEach(System.out::println);
                    break;
            
                default:
                    break;
            }
            
        } while (opcion != 0);
    }
}

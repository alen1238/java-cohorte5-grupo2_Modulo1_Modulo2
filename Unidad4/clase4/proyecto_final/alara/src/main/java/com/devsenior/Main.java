package com.devsenior;


import com.devsenior.repository.DataRepository;
import com.devsenior.service.AnalyticsService;
import com.devsenior.ui.ConsoleUI;

public class Main {
    public static void main(String[] args) {
        
        DataRepository data = new DataRepository();
        AnalyticsService servicio = new AnalyticsService(data);
        ConsoleUI inicio = new ConsoleUI(servicio);
        inicio.iniciar();
    }
}
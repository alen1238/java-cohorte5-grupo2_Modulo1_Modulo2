package com.devsenior.service;

import java.security.KeyStore.Entry;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.devsenior.model.Genero;
import com.devsenior.model.Pelicula;
import com.devsenior.model.Usuario;
import com.devsenior.model.Visualizacion;
import com.devsenior.repository.DataRepository;

public class AnalyticsService {
    private DataRepository data;

    public AnalyticsService(DataRepository data){
            this.data = data;
            //this.data = new DataRepository();
    }

    public List<Map.Entry<Pelicula, Long>> peliculasMasVistas(){

        var resultado = data.visualizaciones.stream()
        .collect(Collectors.groupingBy(Visualizacion::getPelicula,
                                        Collectors.counting()))
        .entrySet()
        .stream()
        .sorted(Map.Entry.<Pelicula, Long>comparingByValue()
                            .reversed()
                )//ordenar de acuerdo al valor
        .toList();

        return resultado;
    }

    public Map<Genero, List<Pelicula>> peliculasPorGenero(){
       var resultado = data.peliculas.stream()
                      .collect(Collectors.groupingBy(Pelicula::getGenero));
        return resultado;
    }

    public Map<Usuario, Integer> tiempoVistoPorusuario(){
            var resultado = data.visualizaciones.stream()
                                .collect(Collectors.groupingBy(Visualizacion::getUsuario,
                                                             Collectors.summingInt(Visualizacion::getMinutos)
                                ));
            return resultado;
    }

    public List<Map.Entry<Usuario,Integer>> topUsuarios(){
        var resultado = tiempoVistoPorusuario()
                        .entrySet()
                        .stream()
                        .sorted(Map.Entry.<Usuario,Integer>comparingByValue().reversed())
                        .limit(3)
                        .toList();
        return resultado;
    }

    


}

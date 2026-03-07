package com.devsenior.repository;

import java.util.ArrayList;
import java.util.List;

import com.devsenior.model.Genero;
import com.devsenior.model.Pelicula;
import com.devsenior.model.Usuario;
import com.devsenior.model.Visualizacion;

public class DataRepository {

    public List<Usuario> usuarios = new ArrayList<Usuario>();
    public List<Pelicula> peliculas = new ArrayList<Pelicula>();
    public List<Visualizacion> visualizaciones = new ArrayList<Visualizacion>();

    public DataRepository(){

            Usuario u1 = new Usuario(1, "Carlos");
            Usuario u2 = new Usuario(2, "Margarita");
            Usuario u3 = new Usuario(3, "Raul");
            Usuario u4 = new Usuario(4, "Genesis");
            Usuario u5 = new Usuario(5, "Juan");

            usuarios.add(u1);
            usuarios.add(u2);
            usuarios.add(u3);
            usuarios.add(u4);
            usuarios.add(u5);


            Pelicula p1 = new Pelicula(1, "matrix", Genero.CIENCIA_FICCION, 134);
            Pelicula p2 = new Pelicula(2, "Avengers", Genero.ACCION, 124);
            Pelicula p3 = new Pelicula(3, "Titanic", Genero.DRAMA, 150);
            Pelicula p4 = new Pelicula(4, "Rambo", Genero.ACCION, 110);
            Pelicula p5 = new Pelicula(5, "matrix", Genero.CIENCIA_FICCION, 134);
            Pelicula p6 = new Pelicula(6, "Scary movie", Genero.COMEDIA, 114);
            Pelicula p7 = new Pelicula(7, "Jhon Wick", Genero.ACCION, 134);

            peliculas.add(p1);
            peliculas.add(p2);
            peliculas.add(p3);
            peliculas.add(p4);
            peliculas.add(p5);
            peliculas.add(p6);
            peliculas.add(p7);

            Visualizacion v1 = new Visualizacion(u1, p1, 130);
            Visualizacion v2 = new Visualizacion(u2, p3, 148);
            Visualizacion v3 = new Visualizacion(u2, p5, 110);
            Visualizacion v4 = new Visualizacion(u4, p4, 109);
            Visualizacion v5 = new Visualizacion(u1, p7, 120);
            Visualizacion v6 = new Visualizacion(u2, p1, 130);
            Visualizacion v7 = new Visualizacion(u5, p6, 110);
            Visualizacion v8 = new Visualizacion(u5, p3, 140);
            Visualizacion v9 = new Visualizacion(u3, p1, 130);
            Visualizacion v10 = new Visualizacion(u2, p6, 110);

            visualizaciones.add(v1);
            visualizaciones.add(v2);
            visualizaciones.add(v3);
            visualizaciones.add(v4);
            visualizaciones.add(v5);
            visualizaciones.add(v6);
            visualizaciones.add(v7);
            visualizaciones.add(v8);
            visualizaciones.add(v9);
            visualizaciones.add(v10);

    }

    

}

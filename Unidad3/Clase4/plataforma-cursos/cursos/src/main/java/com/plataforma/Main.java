package com.plataforma;


import org.apache.logging.log4j.*;

import com.plataforma.model.Curso;
import com.plataforma.model.Estudiante;
import com.plataforma.service.CursoService;
import com.plataforma.service.InscripcionService;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class.getName());
    public static void main(String[] args) {
        CursoService cursoService = new CursoService();
        InscripcionService inscripcionService = new InscripcionService();

        //crear cursos
        Curso javaBasico = new Curso("Java Básico", "Aprende los fundamentos de Java", 2);
        Curso pythonIntermedio = new Curso("Python Intermedio", "Mejora tus habilidades en Python", 3);
        
        cursoService.addCurso(javaBasico);
        cursoService.addCurso(pythonIntermedio);

        //inscribir estudiantes
        Estudiante estudiante1 = new Estudiante("Juan Pérez", "E001", "juan.perez@example.com");
        Estudiante estudiante2 = new Estudiante("María Gómez", "E002", "maria.gomez@example.com");
        
        inscripcionService.inscribirEstudiante(javaBasico, estudiante1);
        inscripcionService.inscribirEstudiante(pythonIntermedio, estudiante2);

    
    
    
    }
}
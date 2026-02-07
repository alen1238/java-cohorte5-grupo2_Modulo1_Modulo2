package com.plataforma.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.plataforma.exception.CursoLlenoException;
import com.plataforma.exception.EstudianteNoEncontradoException;
import com.plataforma.model.Curso;
import com.plataforma.model.Estudiante;
import com.plataforma.model.Inscripcion;

public class InscripcionService {
    private static final Logger logger = LogManager.getLogger(InscripcionService.class);

    private List<Inscripcion> inscripciones;

    public InscripcionService(){
        logger.info("InscripcionService initialized");
        this.inscripciones = new ArrayList<>();
    }

    public void inscribirEstudiante(Curso curso, Estudiante estudiante){
       if(curso.estaLleno()){
           logger.warn("No se puede inscribir al estudiante " + estudiante.getNombre() + " en el curso " + curso.getNombre() + " porque el curso está lleno.");
           throw new CursoLlenoException("El curso " + curso.getNombre() + " está lleno");
       }

         Inscripcion inscripcion = new Inscripcion(estudiante, curso);
         inscripciones.add(inscripcion);
         curso.agregarEstudiante(estudiante);
         logger.info("Estudiante " + estudiante.getNombre() + " inscrito en el curso " + curso.getNombre());
    }

    public List<Inscripcion> listarInscripciones(){
        logger.info("Retrieving list of inscripciones");
        return inscripciones;
     }

     public List<Inscripcion> ListarInscripcionesPorEstudiante(Estudiante estudiante) throws EstudianteNoEncontradoException{
            List<Inscripcion> resultado = new ArrayList<>();
            for(Inscripcion inscripcion : inscripciones){
                if(inscripcion.getEstudiante().getId().equals(estudiante.getId())){
                    resultado.add(inscripcion);
                }
            }

            if(resultado.size() == 0){
                logger.warn("No se encontraron inscripciones para el estudiante " + estudiante.getNombre());
                throw  new EstudianteNoEncontradoException("Estudiante no relacionado a inscripciones");
            }
            logger.info("Found " + resultado.size() + " inscripciones for estudiante " + estudiante.getNombre());
            return resultado;
     }

}

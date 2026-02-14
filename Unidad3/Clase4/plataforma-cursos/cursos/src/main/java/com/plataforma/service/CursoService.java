package com.plataforma.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.*;

import com.plataforma.exception.CursoLlenoException;
import com.plataforma.model.Curso;

public class CursoService {
    private static final Logger logger = LogManager.getLogger(CursoService.class);

    private List<Curso> cursos;

    public CursoService() {
        logger.info("CursoService initialized");
        cursos = new ArrayList<>();
    }

    public void addCurso(Curso curso) {
        logger.info("Adding curso: " + curso.getNombre());
        cursos.add(curso);
    }

    public List<Curso> listarCursos() {
        logger.info("Retrieving list of cursos");
        return cursos;
    }

    public Curso buscarCursoPorCodigo(String codigo) throws CursoLlenoException {
        for(Curso curso : cursos){
            if(curso.getCodigo().equals(codigo)){
                logger.info("Curso found: " + curso.getNombre());
                return curso; //este return permite salir del método una vez que se encuentra el curso
            }
        }
        logger.warn("Curso not found for codigo: " + codigo);
        throw new CursoLlenoException("Curso con código " + codigo + " no fue encontrado");
    }
}

package com.estudiante.estudiante_programacion.service;

import java.util.List;

import com.estudiante.estudiante_programacion.model.Curso;
import com.estudiante.estudiante_programacion.model.Tema;

public interface ICursoService {
    
    public void saveCurso(Curso curso);
    
    public Curso updateCurso(Curso curso);
    
    public void deleteCurso(Long id);


    //find
    public List<Curso> findAllCursos();

    public Curso findCursoById(Long id);

    public List<Tema> findTemasByCursoId(Long id);

    public List<Curso> findCursosByNombre(String nombre);

}

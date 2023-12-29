package com.estudiante.estudiante_programacion.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estudiante.estudiante_programacion.model.Curso;
import com.estudiante.estudiante_programacion.model.Tema;
import com.estudiante.estudiante_programacion.repository.ICursoRepository;

@Service
public class CursoService implements ICursoService{
    @Autowired
    private ICursoRepository repository;

    @Override
    public void deleteCurso(Long id) {
        repository.deleteById(id);
    }

    @Override
    public void saveCurso(Curso curso) {
        repository.save(curso);
    }

    @Override
    public Curso updateCurso(Curso curso) {
        repository.save(curso);
        return (Curso) repository.findById(curso.getId()).orElse(null);
    }


    //Find
    @Override
    public List<Curso> findAllCursos() {
        List<Curso> cursos = repository.findAll();
        return cursos;
    }

    @Override
    public Curso findCursoById(Long id) {
        return (Curso) repository.findById(id).orElse(null);
    }

    @Override
    public List<Curso> findCursosByNombre(String nombre) {
        List <Curso> cursos = this.findAllCursos();
        List<Curso> resultado = new ArrayList<>();

        for (Curso curso : cursos) {
            if (curso.getNombre().equals(nombre)) {
                resultado.add(curso);                
            }
        }
        
        return resultado;
    }

    @Override
    public List<Tema> findTemasByCursoId(Long id) {
        List<Tema> temas = this.findCursoById(id).getListaDeTemas();
        return temas;
    }


    
}

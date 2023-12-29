package com.estudiante.estudiante_programacion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.estudiante.estudiante_programacion.model.Curso;
import com.estudiante.estudiante_programacion.model.Tema;
import com.estudiante.estudiante_programacion.service.ICursoService;

@RestController
public class CursoController {
    @Autowired
    private ICursoService service;

    //<-- CRUD -->
    @PostMapping("/crear")
    public void saveCurso(@RequestBody Curso curso){
        service.saveCurso(curso);
        System.out.println("Se guardo el curso");
    }

    @PutMapping("/actualizar")
    public Curso updateCurso(@RequestBody Curso curso){
        return service.updateCurso(curso);
    }

    @DeleteMapping("/borrar/{id}")
    public void deleteCurso(@PathVariable Long id){
        service.deleteCurso(id);
    }

    //find
    @GetMapping("/buscarid/{id}")
    public Curso findCursoById(@PathVariable Long id){
        return service.findCursoById(id);
    }
    @GetMapping("/buscartodos")
    public List<Curso> findAllCursos(){
        return service.findAllCursos();
    }
    @GetMapping("/buscarnombre/{nombre}")
    public List<Curso> findCursosByNombre(@PathVariable String nombre){
        return service.findCursosByNombre(nombre);
    }
    @GetMapping("/temasporcurso/{id}")
    public List<Tema> findTemasByCursoId(@PathVariable Long id){
        return service.findTemasByCursoId(id);
    }
}

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

import com.estudiante.estudiante_programacion.model.Tema;
import com.estudiante.estudiante_programacion.service.ITemaService;


@RestController
public class TemaController{
    @Autowired
    private ITemaService service;

    //CRUD
    @PostMapping("/creartema")
    public void saveTema(@RequestBody Tema tema) {
        service.saveTema(tema);
    }
    
    @PutMapping("/actualizartema")
    public Tema updateTema(@RequestBody Tema tema) {
        return service.updateTema(tema);
    }    
    
    @GetMapping("/temas")
    public List<Tema> findAllTemas() {
        return service.findAllTemas();   
    }
    
    @DeleteMapping("/borrontema/{id}")
    public void deleteTema(@PathVariable Long id) {
        service.deleteTema(id);
    }

    
}

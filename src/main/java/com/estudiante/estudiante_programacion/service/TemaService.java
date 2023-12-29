package com.estudiante.estudiante_programacion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estudiante.estudiante_programacion.model.Tema;
import com.estudiante.estudiante_programacion.repository.ITemaRepository;

@Service
public class TemaService implements ITemaService{
    @Autowired
    private ITemaRepository repository;

    @Override
    public void deleteTema(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<Tema> findAllTemas() {
        List<Tema> temas = repository.findAll();
        return temas;
    }

    @Override
    public void saveTema(Tema tema) {
        repository.save(tema);
    }

    @Override
    public Tema updateTema(Tema tema) {
        repository.save(tema);
        
        return (Tema) repository.findById(tema.getId()).orElse(null);
    }
    
    
}

package com.estudiante.estudiante_programacion.service;

import java.util.List;

import com.estudiante.estudiante_programacion.model.Tema;

public interface ITemaService {
    
    public void saveTema(Tema tema);
    
    public Tema updateTema(Tema tema);

    public void deleteTema(Long id);

    public List<Tema> findAllTemas();
}

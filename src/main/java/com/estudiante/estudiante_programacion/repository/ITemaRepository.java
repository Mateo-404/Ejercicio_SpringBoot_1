package com.estudiante.estudiante_programacion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.estudiante.estudiante_programacion.model.Tema;

@Repository
public interface ITemaRepository extends JpaRepository<Tema, Long> {
}

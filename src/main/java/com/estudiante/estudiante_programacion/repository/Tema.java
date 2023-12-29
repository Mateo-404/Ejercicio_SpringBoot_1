package com.estudiante.estudiante_programacion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Tema extends JpaRepository<Tema, Long> {
}

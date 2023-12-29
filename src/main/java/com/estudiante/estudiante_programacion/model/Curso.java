package com.estudiante.estudiante_programacion.model;

import java.time.LocalDate;

import java.util.List;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

enum Modalidad {
    Presencial, Virtual
}
@Setter @Getter
@Entity
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Basic
    private String nombre;
    private Modalidad modalidad;
    @Temporal(TemporalType.DATE)
    private LocalDate fechaFinalizacion;
    @OneToMany
    List<Tema> listaDeTemas;
    
    //Constructores
    public Curso() {
    }
    public Curso(Long id, String nombre, Modalidad modalidad, LocalDate fechaFinalizacion, List<Tema> listaDeTemas) {
        this.id = id;
        this.nombre = nombre;
        this.modalidad = modalidad;
        this.fechaFinalizacion = fechaFinalizacion;
        this.listaDeTemas = listaDeTemas;
    }
    

}

package com.luis.proyectoRegCalificaciones.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Entity
public class Profesor extends Persona{

   // @Autowired
    @OneToMany(mappedBy = "profesor", cascade = CascadeType.ALL)
    private List<Materia> materias;
}

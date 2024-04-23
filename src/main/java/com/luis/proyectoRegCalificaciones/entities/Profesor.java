package com.luis.proyectoRegCalificaciones.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Entity
public class Profesor extends Persona{

    public Profesor(){

    }

    public Profesor(Long id, String nombre, String apellidoPaterno, String apellidoMaterno, int edad){
        super(id, nombre, apellidoPaterno, apellidoMaterno, edad);
    }

   // @Autowired
    //@OneToMany(mappedBy = "profesor", cascade = CascadeType.ALL)
   @OneToMany(mappedBy = "profesor")
    private List<Materia> materias;

    
}

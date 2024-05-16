package com.luis.proyectoRegCalificaciones.services;

import com.luis.proyectoRegCalificaciones.entities.Estudiante;

import java.util.List;
import java.util.Optional;

public interface EstudianteService {
    List<Estudiante> findAll();

    Optional findById(Long id);

    Estudiante save(Estudiante estudiante);

    Estudiante update(Long id, Estudiante estudiante);

    void delete(Long id);


}

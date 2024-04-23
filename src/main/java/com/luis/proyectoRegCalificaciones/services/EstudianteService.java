package com.luis.proyectoRegCalificaciones.services;

import com.luis.proyectoRegCalificaciones.entities.Estudiante;

import java.util.List;

public interface EstudianteService {
    List<Estudiante> obtenerTodoE();

    Estudiante obtenerEstudiantePorId(Long id);

    Estudiante crearEstudiante(Estudiante estudiante);

    Estudiante actualizarEstudiante(Long id, Estudiante estudiante);

    void eliminarEstudiante(Long id);

    Long contarEstudiantes();
}

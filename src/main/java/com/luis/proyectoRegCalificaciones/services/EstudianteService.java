package com.luis.proyectoRegCalificaciones.services;

import com.luis.proyectoRegCalificaciones.entities.Estudiante;

import java.util.List;

public interface EstudianteService {
    List<Estudiante> obtenerTodoE();

    Estudiante obtenerPorId(Long id);

    Estudiante crearEstudiante(Estudiante estudiante);

    Estudiante actualizarPersona(Long id, Estudiante estudiante);

    void eliminarPersona(Long id);

    Long contarEstudiantes();
}

package com.luis.proyectoRegCalificaciones.services.impl;

import com.luis.proyectoRegCalificaciones.entities.Estudiante;
import com.luis.proyectoRegCalificaciones.repository.EstudianteRepository;
import com.luis.proyectoRegCalificaciones.services.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteServiceImpl implements EstudianteService {

    @Autowired
    private EstudianteRepository estudianteRepository;

    @Override
    public List<Estudiante> obtenerTodoE() {
        return estudianteRepository.findAll();
    }

    @Override
    public Estudiante obtenerPorId(Long id) {
        return estudianteRepository.findById(id).orElse(null);
    }

    @Override
    public Estudiante crearEstudiante(Estudiante estudiante) {
        return estudianteRepository.save(estudiante);
    }

    @Override
    public Estudiante actualizarPersona(Long id, Estudiante estudiante) {
        Estudiante estudianteBd = estudianteRepository.findById(id).orElse(null);

        if(estudianteBd != null){
            estudianteBd.setNombre(estudiante.getNombre());
        }
        return null;
    }

    @Override
    public void eliminarPersona(Long id) {
        estudianteRepository.deleteById(id);
    }

    @Override
    public Long contarEstudiantes() {
        return estudianteRepository.count();
    }
}

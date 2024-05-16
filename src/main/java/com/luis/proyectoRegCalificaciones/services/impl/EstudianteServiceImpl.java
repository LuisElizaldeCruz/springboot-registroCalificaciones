package com.luis.proyectoRegCalificaciones.services.impl;

import com.luis.proyectoRegCalificaciones.entities.Estudiante;
import com.luis.proyectoRegCalificaciones.repository.EstudianteRepository;
import com.luis.proyectoRegCalificaciones.services.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstudianteServiceImpl implements EstudianteService {

    @Autowired
    private EstudianteRepository estudianteRepository;

    @Override
    public List<Estudiante> findAll() {
        return estudianteRepository.findAll();
    }

    @Override
    public Optional<Estudiante> findById(Long id) {
       return estudianteRepository.findById(id);
    }

    @Override
    public Estudiante save(Estudiante estudiante) {
        return estudianteRepository.save(estudiante);
    }

    public Estudiante update(Long id, Estudiante estudiante) {
        Estudiante estudianteBd = estudianteRepository.findById(id).orElse(null);

        if(estudianteBd != null){
            estudianteBd.setNombre(estudiante.getNombre());
        }
        return null;
    }

    @Override
    public void delete(Long id) {
        estudianteRepository.deleteById(id);
    }

}

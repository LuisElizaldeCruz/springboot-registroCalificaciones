package com.luis.proyectoRegCalificaciones.controllers;

import com.luis.proyectoRegCalificaciones.entities.Estudiante;
import com.luis.proyectoRegCalificaciones.services.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/estudiante")
public class EstudController {

    @Autowired
    private EstudianteService estudianteService;

    @PostMapping()
    public ResponseEntity<Estudiante> create(@RequestBody Estudiante estudiante){
        return ResponseEntity.status(HttpStatus.CREATED).body(estudianteService.save(estudiante));
    }
}

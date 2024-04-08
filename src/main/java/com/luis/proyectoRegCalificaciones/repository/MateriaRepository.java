package com.luis.proyectoRegCalificaciones.repository;

import com.luis.proyectoRegCalificaciones.entities.Materia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MateriaRepository extends JpaRepository <Materia, Long> {

}

package com.luis.proyectoRegCalificaciones.entities;

import jakarta.persistence.*;

@Entity
public class Calificacion {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private double califParcial1;
    private double califParcial2;
    private double promedio;

    @ManyToOne()
    @JoinColumn(name = "id_estudiante")
    private Estudiante estudiante;

    @ManyToOne()
    @JoinColumn(name = "id_materia")
    private Materia materia;

    public Calificacion(){

    }

    public Calificacion(Long id, double califParcial1, double califParcial2, double promedio, Estudiante estudiante/*, Materia materia*/) {
        this.id = id;
        this.califParcial1 = califParcial1;
        this.califParcial2 = califParcial2;
        this.promedio = promedio;
        this.estudiante = estudiante;
        //this.materia = materia;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getCalifParcial1() {
        return califParcial1;
    }

    public void setCalifParcial1(double califParcial1) {
        this.califParcial1 = califParcial1;
    }

    public double getCalifParcial2() {
        return califParcial2;
    }

    public void setCalifParcial2(double califParcial2) {
        this.califParcial2 = califParcial2;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
/*
    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }
    */
}

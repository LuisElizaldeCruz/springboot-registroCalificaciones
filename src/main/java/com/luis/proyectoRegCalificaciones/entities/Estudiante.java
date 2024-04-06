package com.luis.proyectoRegCalificaciones.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Estudiante extends Persona{

    private String gradoEscolar;
    private String correo;
    @Column(name = "numero_telefonico")
    private String numTelefono;

    public Estudiante() {
    }

    public Estudiante(Long id, String nombre, String apellidoPaterno, String apellidoMaterno, int edad, String gradoEscolar, String correo, String numTelefono) {
        super(id, nombre, apellidoPaterno, apellidoMaterno, edad);
        this.gradoEscolar = gradoEscolar;
        this.correo = correo;
        this.numTelefono= numTelefono;
    }

    @OneToMany(mappedBy = "estudiante")
    private List<Materia> materias;

    @OneToMany(mappedBy = "estudiante")
    private List<Calificacion> calificaciones;

    public String getGradoEscolar() {
        return gradoEscolar;
    }

    public void setGradoEscolar(String gradoEscolar) {
        this.gradoEscolar = gradoEscolar;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }


    public String getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }

}

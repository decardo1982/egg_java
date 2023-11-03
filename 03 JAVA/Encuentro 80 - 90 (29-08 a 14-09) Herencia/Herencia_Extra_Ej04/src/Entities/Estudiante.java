package Entities;

import Enums.EstadoCivil;

public class Estudiante extends Persona{
    private String cursoMatriculado;

    public Estudiante() {
    }

    public Estudiante(String cursoMatriculado) {
        this.cursoMatriculado = cursoMatriculado;
    }

    public Estudiante(String cursoMatriculado, String nombre, String apellido, Integer id, EstadoCivil estadoCivil) {
        super(nombre, apellido, id, estadoCivil);
        this.cursoMatriculado = cursoMatriculado;
    }

    public String getCursoMatriculado() {
        return cursoMatriculado;
    }

    public void setCursoMatriculado(String cursoMatriculado) {
        this.cursoMatriculado = cursoMatriculado;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "cursoMatriculado=" + cursoMatriculado + '}';
    }
    
    
}

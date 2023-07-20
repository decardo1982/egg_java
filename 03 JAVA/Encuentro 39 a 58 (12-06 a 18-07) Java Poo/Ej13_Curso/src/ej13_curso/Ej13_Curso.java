package ej13_curso;

import Servicio.CursoServicio;

public class Ej13_Curso {

    public static void main(String[] args) {
        
        CursoServicio curso = new CursoServicio();
        
//        curso.cargarAlumnos();
        curso.crearCurso();
        curso.calcularGananciaSemanal();

    }
    
}

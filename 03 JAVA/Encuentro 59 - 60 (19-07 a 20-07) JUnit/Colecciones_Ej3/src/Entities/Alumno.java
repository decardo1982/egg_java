package Entities;

import java.util.Objects;

public class Alumno {
    
    private String nombre;
    
    private Integer nota1;
    
    private Integer nota2;
    
    private Integer nota3;

    public Alumno() {
    }

    public Alumno(String nombre, Integer nota1, Integer nota2, Integer nota3) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNota1() {
        return nota1;
    }

    public void setNota1(Integer nota1) {
        this.nota1 = nota1;
    }

    public Integer getNota2() {
        return nota2;
    }

    public void setNota2(Integer nota2) {
        this.nota2 = nota2;
    }

    public Integer getNota3() {
        return nota3;
    }

    public void setNota3(Integer nota3) {
        this.nota3 = nota3;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.nombre);
        hash = 53 * hash + Objects.hashCode(this.nota1);
        hash = 53 * hash + Objects.hashCode(this.nota2);
        hash = 53 * hash + Objects.hashCode(this.nota3);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.nota1, other.nota1)) {
            return false;
        }
        if (!Objects.equals(this.nota2, other.nota2)) {
            return false;
        }
        if (!Objects.equals(this.nota3, other.nota3)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Alumno " + nombre + "\n Nota 1 = " + nota1 +  "\n Nota 2 = " + nota2 + "\n Nota 3 = " + nota3 + "\n";
    }
    
}

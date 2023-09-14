package Entidades;
import java.util.Scanner;


import Enum.EstadoCivil;
import java.util.ArrayList;
import java.util.Arrays;

public abstract class Persona {

    protected String nombre;

    protected String apellido;

    protected int identificacion;

    protected EstadoCivil estado;

    protected Scanner read = new Scanner(System.in).useDelimiter("\n");
    
    public void cambioEstadoCivil() {
        System.out.println("Ingrese nuevo estado civil:");
        
        String nuevoEstado = read.next().toUpperCase();
        ArrayList estados = new ArrayList(Arrays.asList(EstadoCivil.values()));
        if (estados.contains(EstadoCivil.valueOf(nuevoEstado))) {
            System.out.println("ok, prosiga");
            this.estado = EstadoCivil.valueOf(nuevoEstado);
        }else{
            System.out.println("Opcion incorrecta, se asocia SOLTERO");
            this.estado = EstadoCivil.valueOf("SOLTERO");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public EstadoCivil getEstado() {
        return estado;
    }

    public void setEstado(EstadoCivil estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", apellido=" + apellido + ", identificacion=" + identificacion + ", estado=" + estado;
    }
    
    
}

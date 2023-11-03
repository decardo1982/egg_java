package Entities;

import Enums.EstadoCivil;

public abstract class Empleado extends Persona{
    protected Integer anioIngreso;
    protected Integer numDespacho;

    public Empleado() {
    }
    
    

    public Empleado(Integer anioIngreso, Integer numDespacho) {
        this.anioIngreso = anioIngreso;
        this.numDespacho = numDespacho;
    }

    public Empleado(Integer anioIngreso, Integer numDespacho, String nombre, String apellido, Integer id, EstadoCivil estadoCivil) {
        super(nombre, apellido, id, estadoCivil);
        this.anioIngreso = anioIngreso;
        this.numDespacho = numDespacho;
    }

    public Integer getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(Integer anioIngreso) {
        this.anioIngreso = anioIngreso;
    }

    public Integer getNumDespacho() {
        return numDespacho;
    }

    public void setNumDespacho(Integer numDespacho) {
        this.numDespacho = numDespacho;
    }

    @Override
    public String toString() {
        return "Empleado{" + super.toString() +  "anioIngreso=" + anioIngreso + ", numDespacho=" + numDespacho + '}';
    }
    
    
    
    
}

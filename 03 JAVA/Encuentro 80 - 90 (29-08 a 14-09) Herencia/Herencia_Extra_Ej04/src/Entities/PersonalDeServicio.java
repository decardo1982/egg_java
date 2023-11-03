package Entities;

import Enums.EstadoCivil;
import Enums.Seccion;

public class PersonalDeServicio extends Empleado {
    
    private Seccion seccionAsignada;

    public PersonalDeServicio() {
    }

    public PersonalDeServicio(Seccion seccionAsignada) {
        this.seccionAsignada = seccionAsignada;
    }

    public PersonalDeServicio(Seccion seccionAsignada, Integer anioIngreso, Integer numDespacho) {
        super(anioIngreso, numDespacho);
        this.seccionAsignada = seccionAsignada;
    }

    public PersonalDeServicio(Seccion seccionAsignada, Integer anioIngreso, Integer numDespacho, String nombre, String apellido, Integer id, EstadoCivil estadoCivil) {
        super(anioIngreso, numDespacho, nombre, apellido, id, estadoCivil);
        this.seccionAsignada = seccionAsignada;
    }

    public Seccion getSeccionAsignada() {
        return seccionAsignada;
    }

    public void setSeccionAsignada(Seccion seccionAsignada) {
        this.seccionAsignada = seccionAsignada;
    }
    
    
    
    
}

package Entities;

import Enums.Departamento;
import Enums.EstadoCivil;

public class Profesor extends Empleado {
    

    private Departamento departamentoAsignado;

    public Profesor() {
    }

    public Profesor(Departamento departamentoAsignado, Integer anioIngreso, Integer numDespacho) {
        super(anioIngreso, numDespacho);
        this.departamentoAsignado = departamentoAsignado;
    }

    public Profesor(Departamento departamentoAsignado, Integer anioIngreso, Integer numDespacho, String nombre, String apellido, Integer id, EstadoCivil estadoCivil) {
        super(anioIngreso, numDespacho, nombre, apellido, id, estadoCivil);
        this.departamentoAsignado = departamentoAsignado;
    }

    public Departamento getDepartamentoAsignado() {
        return departamentoAsignado;
    }

    public void setDepartamentoAsignado(Departamento departamentoAsignado) {
        this.departamentoAsignado = departamentoAsignado;
    }

    @Override
    public String toString() {
        return "Profesor{" + super.toString() + "departamentoAsignado=" + departamentoAsignado + '}';
    }

}

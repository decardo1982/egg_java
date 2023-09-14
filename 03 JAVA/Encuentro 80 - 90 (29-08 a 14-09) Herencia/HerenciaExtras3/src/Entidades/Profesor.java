package Entidades;


import Enum.Departamento;
import java.util.ArrayList;
import java.util.Arrays;

public class Profesor extends Empleado {

    private Departamento departamento;

    public void crearProfesor() {
        System.out.println("Ingrese nombre");
        this.nombre = read.next();
        System.out.println("Ingrese apellido");
        this.apellido = read.next();
        System.out.println("Ingrese DNI");
        this.identificacion = read.nextInt();
        this.cambioEstadoCivil();
        System.out.println("Ingrese despacho");
        this.despacho = read.nextInt();
        System.out.println("Ingrese año de ingreso");
        this.anioIncorporacion = read.nextInt();
        this.cambioDepartamento();     
    }

    public void cambioDepartamento() {
        System.out.println("Ingrese nuevo departamento");
        String nuevoDepartamento = read.next().toUpperCase();
        ArrayList estados = new ArrayList(Arrays.asList(Departamento.values()));
        if (estados.contains(nuevoDepartamento)) {
            this.departamento = Departamento.valueOf(nuevoDepartamento);
        }else{
            System.out.println("Opcion incorrecta, se asocia Secretaria");
            this.departamento = Departamento.valueOf("SECRETARIA");
        }
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public Profesor() {
    }

    @Override
    public String toString() {
        return super.toString() + "departamento=" + departamento;
    }
    
    
}

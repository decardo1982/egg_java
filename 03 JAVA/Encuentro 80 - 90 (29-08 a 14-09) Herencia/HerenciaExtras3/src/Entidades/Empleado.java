package Entidades;

import Enum.EstadoCivil;

public abstract class Empleado extends Persona {

    protected int anioIncorporacion;

    protected int despacho;
   
    public int getAnioIncorporacion() {
        return anioIncorporacion;
    }

    public void setAnioIncorporacion(int anioIncorporacion) {
        this.anioIncorporacion = anioIncorporacion;
    }

    public int getDespacho() {
        return despacho;
    }

    public void setDespacho(int despacho) {
        this.despacho = despacho;
    }
    
    public void cambioDespacho(){
        System.out.println("Ingrese nuevo despacho");
        this.despacho = read.nextInt();
    }

    @Override
    public String toString() {
        return super.toString() + "anioIncorporacion=" + anioIncorporacion + ", despacho=" + despacho;
    }

    
    
    


}

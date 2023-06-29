package ej11_clasedate;

import java.util.Date;

public class Fecha {
    
    private Date fechaDeNacimiento;

    public Fecha() {
    }

    public Fecha(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    
    public void llenarFecha(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    
    public void mostrarFecha(Date fechaDeNacimiento) {
        System.out.println("Día: " + fechaDeNacimiento.getDate() + 
                            " mes: " + fechaDeNacimiento.getMonth() + 
                            " año: " + fechaDeNacimiento.getYear());
    }

    @Override
    public String toString() {
        return "Fecha{" + "fechaDeNacimiento= "  + fechaDeNacimiento.getDate() +
                "/" + fechaDeNacimiento.getMonth() + 
                "/" + fechaDeNacimiento.getYear() + '}';
    }
    
    
    
    
}

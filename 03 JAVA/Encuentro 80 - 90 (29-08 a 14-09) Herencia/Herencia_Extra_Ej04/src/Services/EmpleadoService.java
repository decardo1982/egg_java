package Services;

import Entities.Empleado;

public class EmpleadoService extends PersonaService {
    
    Empleado empleado = new Empleado() {};
    
    public void reasignarDespacho(){
        System.out.println("El número de despacho asignado actual es " + empleado.getNumDespacho());
        System.out.println("Ingrese el nuevo número de despacho asignado:");
        empleado.setNumDespacho(read.nextInt());
        System.out.println("El nuevo despacho asignado es " + empleado.getNumDespacho());
    }
    
    
}

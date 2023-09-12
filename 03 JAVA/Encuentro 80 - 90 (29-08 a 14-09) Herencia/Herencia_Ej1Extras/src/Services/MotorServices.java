
package Services;

import Entidades.Motor;

public class MotorServices extends  BarcoServices{

    public MotorServices() {
        this.barco = new Motor();
    }

    @Override
    public void crearBarco() {
        super.crearBarco(); 
        System.out.println("Ingrese la potencia CV");
        Motor motor = (Motor) barco;
        motor.setPotencia(leer.nextInt());
    }

    @Override
    public long calcularModulo() {
        Motor motor = (Motor) barco;
        return super.calcularModulo() + motor.getPotencia();
    }
    
}

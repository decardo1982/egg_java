
package Services;

import Entidades.Yate;

public class YateServices extends  MotorServices{

    public YateServices() {
        this.barco = new Yate();
    }

    @Override
    public void crearBarco() {
        super.crearBarco();
        System.out.println("Ingrese la cantidad de camarotes que posee el barco");
        Yate yate = (Yate) barco;
        yate.setCamarotes(leer.nextInt());
    }

    @Override
    public long calcularModulo() {
        Yate yate = (Yate) barco;
        return super.calcularModulo() + yate.getCamarotes(); 
    }
}

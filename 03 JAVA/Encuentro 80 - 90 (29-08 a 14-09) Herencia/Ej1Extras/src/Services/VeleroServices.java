/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entidades.Velero;

public class VeleroServices extends  BarcoServices{

    public VeleroServices() {
        this.barco = new Velero();
    }

    @Override
    public void crearBarco() {
        super.crearBarco(); 
        System.out.println("Ingrese la cantidad de mastiles");
        Velero velero = (Velero) barco;
        velero.setMastiles(leer.nextInt());
    }

    @Override
    public long calcularModulo() {
        Velero velero = (Velero) barco;
        return super.calcularModulo() + velero.getMastiles();
    }
    
}

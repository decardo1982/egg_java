/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testjunit.services;

import testjunit.entities.Rectangulo;

/**
 *
 * @author dario
 */
public class RectanguloService {
    
    RectanguloService rs;
    
    public double calcularArea(Rectangulo r){
        return r.getAncho() * r.getLargo();
    }
    
    public double calcularPerimetro(Rectangulo r){
        return (r.getAncho()+r.getLargo())*2;
    }
    
}

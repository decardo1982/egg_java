package ej04_rectangulo;

import Entidades.Rectangulo;
import Servicio.RectanguloServicio;

public class Ej04_Rectangulo {

    public static void main(String[] args) {
        
        RectanguloServicio rs = new RectanguloServicio();
        Rectangulo prueba1 = rs.crearRectangulo();
        
        rs.calcularPerimetro(prueba1.getBase(), prueba1.getAltura());
        rs.calcularSuperficie(prueba1.getBase(), prueba1.getAltura());

    }
    
}

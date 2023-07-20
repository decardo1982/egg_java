package Servicio;

import Entidades.Circunferencia;
import java.util.Scanner;


public class CircunferenciaServicio {
    
    public Circunferencia crearCircunferencia(){
        
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el radio:");
        
        Circunferencia circulo = new Circunferencia(read.nextDouble());
        
        return circulo;
        
    }
    
    public void area(Circunferencia circulo) {
        
        Double area = Math.PI  * Math.pow(circulo.getRadio(), 2);
        
        System.out.println("El área es " + area);
    }
    
        public void perimetro(Circunferencia circulo) {
        
        Double perimetro = 2 * Math.PI  * circulo.getRadio();
        
        System.out.println("El perímetro es " + perimetro);
    }

    
}

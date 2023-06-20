package circunferencia;


import Servicio.CircunferenciaServicio;

public class Circunferencia {

    public static void main(String[] args) {
        
        CircunferenciaServicio circulo = new CircunferenciaServicio();
        
        Entidades.Circunferencia circular = circulo.crearCircunferencia();
        
        circulo.area(circular);
        
        circulo.perimetro(circular);

    }
    
}

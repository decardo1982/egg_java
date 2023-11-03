package herencia_extra_ej02;

import Entities.EdificioDeOficinas;
import Entities.Polideportivo;

public class Herencia_Extra_Ej02 {

    public static void main(String[] args) {
        
        Polideportivo pd = new Polideportivo(false, 10.0, 10.0, 10.0);
        pd.calcularSuperficie();
        
        EdificioDeOficinas office = new EdificioDeOficinas(2, 2, 3, 10.0, 10.0, 10.0);
        
        office.calcularVolumen();
        office.cantPersonas();
        

    }
    
}

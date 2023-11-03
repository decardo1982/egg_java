package Services;

import Entities.Alquiler;
import java.util.Scanner;

public class AlquilerService {
    
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    
    Alquiler alquiler = new Alquiler();
    
    public Integer calculoAlquiler(){   
        System.out.println("Ingrese la cantidad de días:");
        alquiler.setCantDias(read.nextInt());
        
        
        Integer total = alquiler.getCantDias() * alquiler.getBarco().valorModulo();
        return total;
    }
}

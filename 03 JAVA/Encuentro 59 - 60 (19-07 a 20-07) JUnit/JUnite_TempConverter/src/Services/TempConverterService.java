package Services;

import Entities.Unidades;

public class TempConverterService {

    Unidades temps = new Unidades();

    public double TemperatureConverter() {

        double C = 25.00;
        System.out.println("Tomamos como valor inicial " + C + "º Celcius.");
        System.out.println("");
        temps.setCelcius(C);
        System.out.println("C: " + C);
        celciusToF();
        celciusToK();
        return C;
    }

    public double celciusToF() {
        
        temps.setFahrenheit((temps.getCelcius() * 9 / 5) + 32);
        double F = temps.getFahrenheit();
        System.out.println("F: " + F);
        return F;
        
    }
    
    public double celciusToK(){
        double K = temps.getCelcius() + 273.15;
        
        temps.setKelvin(K);
        System.out.println("K: " + K);
        return K;
        
    }

}

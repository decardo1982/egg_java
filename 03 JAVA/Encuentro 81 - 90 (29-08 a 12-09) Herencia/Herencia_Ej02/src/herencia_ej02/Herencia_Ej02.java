package herencia_ej02;

import Services.ElectrodomesticoService;

public class Herencia_Ej02 {

    public static void main(String[] args) {
        
        ElectrodomesticoService e1 = new ElectrodomesticoService();
        
        e1.comprobarConsumoEnergetico('p');
        e1.comprobarColor("verde");
        e1.crearElectrodomestico();
        e1.precioFinal();

    }
    
}

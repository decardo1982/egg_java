//Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
//padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
//el atributo propio de la lavadora.
//• Método precioFinal(): este método será heredado y se le sumará la siguiente
//funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
//carga es menor o igual, no se incrementará el precio. Este método debe llamar al
//método padre y añadir el código necesario. Recuerda que las condiciones que hemos
//visto en la clase Electrodoméstico también deben afectar al precio.

package Entidades;

import java.util.Scanner;

public class Lavarropas extends Electrodomestico{
    private Integer carga;

    public Lavarropas() {
    }

    public Lavarropas(Integer carga) {
        this.carga = carga;
    }

    public Lavarropas(Integer carga, Integer precio, String color, Character consumo, Integer peso) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }
    
    public void crearLavarropas(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        super.crearElectrodomestico();
        System.out.println("Ingrese la carga que soporta el lavarropas");
        carga = leer.nextInt();
        precioFinal();
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if(carga > 30){
            precio+=500;
        }
    }

    @Override
    public String toString() {
        return "Lavarropas{" + "carga=" + carga +super.toString() + '}' ;
    }
}

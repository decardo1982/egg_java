package tutoria.junittutoria_electrodomesticos;

import java.util.Scanner;

public class WashingM extends Appliance{
    private int load;

    public WashingM(double price, String color, char powerConsumption, int weight, int load) {
        super(price, color, powerConsumption, weight);
        this.load = load;
    }

    public WashingM() {
    }

    public int getLoad() {
        return load;
    }

    public void setLoad(int load) {
        this.load = load;
    }

    @Override
    public String toString() {
        return "WashingM: " +
                "load: " + load +
                ", price: " + price +
                ", color: " + color + '\'' +
                ", power Consumption: " + powerConsumption +
                ", weight: " + weight;
    }



    public WashingM createWM(){
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        super.createAppliance();
        System.out.print("Enter your load: ");
        this.load = read.nextInt();
        finalPrice();
        return new WashingM();
    }

    @Override
    public void finalPrice(){
        super.finalPrice();
        if(this.load > 30){
            this.price += 500;
        }
    }


}

    /*Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
    padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
    el atributo propio de la lavadora.*/

    /*Método precioFinal(): este método será heredado y se le sumará la siguiente
    funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
    carga es menor o igual, no se incrementará el precio. Este método debe llamar al
    método padre y añadir el código necesario. Recuerda que las condiciones que hemos
    visto en la clase Electrodoméstico también deben afectar al precio.*/

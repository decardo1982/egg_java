package tutoria.junittutoria_electrodomesticos;

import java.util.Scanner;

public class Television extends Appliance{
    private int size;
    private boolean TDT;

    public Television(double price, String color, char powerConsumption, int weight, int size, boolean TDT) {
        super(price, color, powerConsumption, weight);
        this.size = size;
        this.TDT = TDT;
    }

    public Television() {
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isTDT() {
        return TDT;
    }

    public void setTDT(boolean TDT) {
        this.TDT = TDT;
    }

    @Override
    public String toString() {
        return "Television: " +
                "size: " + size +
                ", TDT: " + TDT +
                ", price: " + price +
                ", color: '" + color + '\'' +
                ", power Consumption: " + powerConsumption +
                ", weight: " + weight;
    }

    /*Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
    padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
    los atributos del televisor.*/

    public void createTV(){
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        super.createAppliance();
        System.out.print("Enter your size: ");
        this.size = read.nextInt();
        System.out.print("Does your tv have TDT? Yes|No: ");
        String answer = read.next().toLowerCase();
        if(answer.equalsIgnoreCase("yes")){
            this.TDT = true;
        }else{
            this.TDT = false;
        }
        System.out.println(TDT);
        finalPrice();
    }

    /*Método precioFinal(): este método será heredado y se le sumará la siguiente
    funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
    incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
    $500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
    también deben afectar al precio.*/

    @Override
    public void finalPrice(){
        super.finalPrice();
        if(this.size > 40){
            this.price += this.price * 0.3;
        }

        if(this.TDT == true){
            this.price += 500;
        }
    }
}

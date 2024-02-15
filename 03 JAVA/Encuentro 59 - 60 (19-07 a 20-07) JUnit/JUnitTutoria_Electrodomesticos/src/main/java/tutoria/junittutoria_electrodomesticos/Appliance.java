package tutoria.junittutoria_electrodomesticos;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Appliance {
    protected double price;
    protected String color;
    protected char powerConsumption;
    protected int weight;

    public Appliance(double price, String color, char powerConsumption, int weight) {
        this.price = price;
        this.color = color;
        this.powerConsumption = powerConsumption;
        this.weight = weight;
    }

    public Appliance() {
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(char powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Appliance: " +
                "price: " + price +
                ", color: " + color +
                ", powerConsumption: " + powerConsumption +
                ", weight: " + weight;
    }


    public char checkPowerConsumption(char letter){
        /*if ("ABCDEF".indexOf(Character.toUpperCase(letter)) == -1) {
            return 'F';
        }else{
            return letter;
        }*/
        if (letter < 'A' || letter > 'F') {
            this.powerConsumption = 'F';
        }else{
            this.powerConsumption = letter;
        }return letter;
    }

    /*Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
    usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
    blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
    minúsculas. Este método se invocará al crear el objeto y no será visible.*/

    public String checkColor(String color){
        if(!color.equalsIgnoreCase("blue") && color.equalsIgnoreCase("black") && color.equalsIgnoreCase("red") && color.equalsIgnoreCase("black") && color.equalsIgnoreCase("white") && color.equalsIgnoreCase("Gray")){
            return "WHITE";
        }else{
            return color.toUpperCase();
        }
    }

    /*Metodo crearElectrodomestico(): le pide la información al usuario y llena el
    electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
    precio se le da un valor base de $1000.*/


    public void createAppliance(){
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        this.price = 1000;
        System.out.print("Enter your color: ");
        this.color = checkColor(read.next().toUpperCase());
        System.out.print("Enter your power consumption (A-F): ");
        this.powerConsumption = checkPowerConsumption(read.next().charAt(0));
        System.out.print("Enter your appliance weight: ");
        this.weight = read.nextInt();
        //return new Appliance(price, color, letter, weight);
    }

    /*Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
precio. Esta es la lista de precios:*/

    public void finalPrice(){
        switch (this.powerConsumption){
            case 'A':
            case 'a':
                this.price += 1000;
                break;
            case 'B':
            case 'b':
                this.price += 800;
                break;
            case 'C':
            case 'c':
                this.price += 600;
                break;
            case 'D':
            case 'd':
                this.price += 500;
                break;
            case 'E':
            case 'e':
                this.price += 300;
                break;
            case 'F':
            case 'f':
                this.price +=100;
                break;
        }

        if(this.weight > 1 && this.weight <= 19){
            this.price += 100;
        }else{
            if(this.weight >=20 && this.weight <= 49){
                this.price += 500;
            }else{
                if(this.weight >=50 && this.weight <= 79){
                    this.price += 800;
                }else{
                    if(this.weight > 80){
                        this.price += 1000;
                    }
                }
            }
        }

        //System.out.println("Precio del artículo: " + this.price);
    }
}




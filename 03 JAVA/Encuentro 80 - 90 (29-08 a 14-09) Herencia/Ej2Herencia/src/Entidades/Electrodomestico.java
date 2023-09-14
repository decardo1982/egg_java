/*
atributos: precio, color,
consumo energético (letras entre A y F) y peso.

Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
si no es correcta usara la letra F por defecto. Este método se debe invocar al crear el
objeto y no será visible.
• Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
minúsculas. Este método se invocará al crear el objeto y no será visible.
13
• Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
precio se le da un valor base de $1000.
• Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
precio
 */
package Entidades;

import java.util.Scanner;

public class Electrodomestico {

    protected Integer precio;
    protected String color;
    protected Character consumo;
    protected Integer peso;

    public Electrodomestico() {
    }

    public Electrodomestico(Integer precio, String color, Character consumo, Integer peso) {
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Character getConsumo() {
        return consumo;
    }

    public void setConsumo(Character consumo) {
        this.consumo = consumo;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    private void comprobarConsumoEnergetico(char letra) {
//        Tambien se puede hacer con ascii if (letra >='A' && letra <='F')
        letra = Character.toUpperCase(letra);
        if ("ABCDEF".indexOf(letra) >= 0) {
            consumo = letra;
        } else {
            consumo = 'F';
        }
    }

    private void comprobarColor(String color) {
        for (Colores col : Colores.values()) {
            if (col.toString().equalsIgnoreCase(color)) {
                this.color = color;
                break;
            } else {
                this.color = "Blanco";
            }
        }
    }

    public void crearElectrodomestico() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el color del electrodomestico");
        color = leer.next();
        System.out.println("Ingrese el consumo del electrodomestico ");
        consumo = leer.next().charAt(0);
        System.out.println("Ingrese el peso del electrodomestico");
        peso = leer.nextInt();
        precio = 1000;

        comprobarConsumoEnergetico(consumo);
        comprobarColor(color);
    }

    public void precioFinal() {
        switch (consumo) {
            case 'A':
                precio += 1000;
                break;
            case 'B':
                precio += 800;
                break;
            case 'C':
                precio += 600;
                break;
            case 'D':
                precio += 500;
                break;
            case 'E':
                precio += 300;
                break;
            case 'F':
                precio += 100;
                break;
        }
        
        if(peso >= 1 && peso <= 19){
            precio += 100;
        } else if(peso >=20 && peso <=49){
            precio += 500;
        } else if(peso>= 50 && peso <=79){
            precio += 800;
        } else {
            precio += 1000;
        }
    }

    @Override
    public String toString() {
        return "precio=" + precio + ", color=" + color + ", consumo=" + consumo + ", peso=" + peso;
    }

}

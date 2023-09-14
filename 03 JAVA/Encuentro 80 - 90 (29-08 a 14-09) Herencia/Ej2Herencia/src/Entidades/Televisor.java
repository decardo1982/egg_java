//resolución (en pulgadas) y sintonizador TDT (booleano)
//Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
//padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
//los atributos del televisor.
//• Método precioFinal(): este método será heredado y se le sumará la siguiente
//funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
//incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
//$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
//también deben afectar al precio.
package Entidades;

import java.util.Scanner;

public class Televisor extends Electrodomestico {

    private Integer resolucion;
    private Boolean sintonizador;

    public Televisor() {
    }

    public Televisor(Integer resolucion, Boolean sintonizador) {
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public Televisor(Integer resolucion, Boolean sintonizador, Integer precio, String color, Character consumo, Integer peso) {
        super(precio, color, consumo, peso);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public Integer getResolucion() {
        return resolucion;
    }

    public void setResolucion(Integer resolucion) {
        this.resolucion = resolucion;
    }

    public Boolean getSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(Boolean sintonizador) {
        this.sintonizador = sintonizador;
    }

    public void crearTelevisor() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        super.crearElectrodomestico();
        System.out.println("Ingrese la resolucion del televisor");
        resolucion = leer.nextInt();
        System.out.println("¿El televisor cuenta con sintonizador? true/false");
        sintonizador = leer.nextBoolean();
        precioFinal();
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if (resolucion > 40) {
            precio = (int) (precio * 1.30);
        }
        if (sintonizador) {
            precio += 500;
        }
    }

    @Override
    public String toString() {
        return "Televisor{" + "resolucion=" + resolucion + ", sintonizador=" + sintonizador + super.toString() + '}';
    }
    
}

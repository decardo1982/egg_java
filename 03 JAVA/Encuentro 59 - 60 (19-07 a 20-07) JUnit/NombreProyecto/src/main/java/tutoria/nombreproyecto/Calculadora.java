package tutoria.nombreproyecto;

import java.util.Scanner;

public class Calculadora {
    private double resultado;
    private Scanner scanner;
    private double acumulador;
    
    public Calculadora() {
        resultado = 0;
        scanner = new Scanner(System.in);
    }

    
    public double getAcumualdor(){
        return acumulador;
    }
    
    public double getResultado() {
        return resultado;
    }

    public void sumar(double numero1, double numero2) {
        resultado = numero1 + numero2;
        acumulador += resultado;
    }

    public void restar(double numero1, double numero2) {
        resultado = numero1 - numero2;
        acumulador += resultado;
    }

    public void multiplicar(double numero1, double numero2) {
        resultado = numero1 * numero2;
    }

    public void dividir(double numero1, double numero2) {
            resultado = numero1 / numero2;
            if(numero2==0)
            {
                System.out.println("No esta permitida la division por 0.");
            }
    }

    public void consultarResultado() {
        System.out.println("El resultado actual es: " + resultado);
    }

    public double ingresarNumero() {
        System.out.print("Ingrese un número: ");
        return scanner.nextDouble();
    }
    
    public double consultarAcumulador()
    {
        System.out.println("El acumulador es: "+acumulador);
        return acumulador;
    }
    
    public void limpiarResultado()
    {
        resultado = 0;
    }
    
    public void limpiarAcumulador()
    {
        acumulador = 0;
        System.out.println("Acumulador limpio");
    }
    
}
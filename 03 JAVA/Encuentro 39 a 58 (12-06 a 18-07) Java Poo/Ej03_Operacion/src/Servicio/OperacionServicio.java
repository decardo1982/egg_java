package Servicio;

import Entidades.Operacion;
import java.util.Scanner;

public class OperacionServicio {

    Scanner read = new Scanner(System.in).useDelimiter("\n");

    public Operacion crearOperacion() {

        Operacion operaciones = new Operacion();

        System.out.print("Ingrese un valor para 'Numero1': ");
        operaciones.setNumero1(read.nextInt());
        System.out.print("Ingrese un valor para 'Numero2': ");
        operaciones.setNumero2(read.nextInt());
        return operaciones;
    }

    public void sumar(int Numero1, int Numero2) {
        int resultado = Numero1 + Numero2;
        System.out.print("La sumatoria es: " + resultado);
        System.out.println("");
    }

    public void restar(int Numero1, int Numero2) {
        int resultado = Numero1 - Numero2;
        System.out.print("La resta es: " + resultado);
        System.out.println("");
    }

    public void multiplicar(int Numero1, int Numero2) {
        if (Numero1 == 0 || Numero2 == 0) {
            System.out.println("Multiplicar cualquier número por 0 dará siempre como resultado 0");
        } else {
            int resultado = Numero1 * Numero2;
            System.out.print("El producto es: " + resultado);
            System.out.println("");

        }
    }

    public void dividir(int Numero1, int Numero2) {
        if (Numero1 == 0 || Numero2 == 0) {
            System.out.println("No se puede realizar la operación de división.");
        } else {
            int resultado = Numero1 / Numero2;
            System.out.print("La división es: " + resultado);
            System.out.println("");
        }
    }

}

package Entities;

import java.util.Scanner;

public class DivisionNumero {

    private String num1;
    private String num2;
    private Integer intNum1;
    private Integer intNum2;
    private Integer resultado;

    Scanner read = new Scanner(System.in).useDelimiter("\n");

    public void division() {

        try {
            System.out.println("Se pedirán 2 números para dividirlos");
            System.out.println("Ingrese el primer número:");
            num1 = read.next();
//            intNum1 = Integer.parseInt(num1);
            System.out.println("Ingrese el segundo número:");
            num2 = read.next();
//            intNum2 = Integer.parseInt(num2);

//            resultado = intNum1 / intNum2;

            System.out.println("El resultado de la división es " + Integer.parseInt(num1) / Integer.parseInt(num2));

        } catch (NumberFormatException e) {
            System.out.println("¡Debe ingresar números! Intente nuevamente");
            division();
        }

    }
}

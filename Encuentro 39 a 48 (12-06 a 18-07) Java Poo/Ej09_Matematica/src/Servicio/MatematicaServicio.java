//9. Realizar una clase llamada Matemática que tenga como atributos dos números reales con
//los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
//constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
//Math.random para generar los dos números y se guardaran en el objeto con su
//respectivos set. Deberá además implementar los siguientes métodos:

package Servicio;

import Entidades.Matematica;
import java.util.Scanner;

public class MatematicaServicio {

    Scanner read = new Scanner(System.in).useDelimiter("\n");

    Matematica numeros = new Matematica();

    public Matematica crearNumeros() {
        numeros.setNum1((int) ((Math.random() * 10) + 1));
        System.out.println("Numero 1 = " + numeros.getNum1());
        numeros.setNum2((int) (Math.random() * 10) + 1);
        System.out.println("Numero 2 = " + numeros.getNum2());

        return numeros;
    }

//a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor

    public double devolverMayor() {
        double numeroMayor;
        double numeroMenor;

        if (numeros.getNum1() > numeros.getNum2()) {
            numeroMayor = numeros.getNum1();
            numeroMenor = numeros.getNum2();
        } else {
            numeroMayor = numeros.getNum2();
            numeroMenor = numeros.getNum1();
        }
        System.out.println("El número " + numeroMayor + " es mayor que " + numeroMenor);

        return numeroMayor;
    }

 //b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado al menor número. Previamente se deben redondear ambos valores.

   public double calcularPotencia() {
       double numeroMayor = Math.max(numeros.getNum1(), numeros.getNum2());
       double numeroMenor = Math.min(numeros.getNum1(), numeros.getNum2());
       int numeroMayorRedondeado = (int) Math.round(numeroMayor);
       int numeroMenorRedondeado = (int) Math.round(numeroMenor);
       int resultado = (int) Math.pow(numeroMayorRedondeado, numeroMenorRedondeado);
       System.out.println("El número " + numeroMayorRedondeado + " elevado a la potencia de " + numeroMenorRedondeado + " es " + resultado);
       return resultado;   
    }
//c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
////Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
   
   public double calcularRaiz(){
       double numeroMenor = Math.min(numeros.getNum1(), numeros.getNum2());
       double numeroMenorAbsoluto = Math.abs(numeroMenor);
       double resultado = Math.sqrt(numeroMenorAbsoluto);
       System.out.println("La raíz cuadrada del número menor " + numeroMenorAbsoluto + " es " + resultado);
       return resultado;
   }
}

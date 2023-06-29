//Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
//clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
//Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
//usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
//deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que
//se puede conseguir instanciando un objeto Date con constructor vacío.
//Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
//Ejemplo fecha actual: Date fechaActual = new Date();
package ej11_clasedate;

import java.util.Date;
import java.util.Scanner;

public class Ej11_ClaseDate {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in).useDelimiter("\n");

        Fecha nacimiento = new Fecha();

        System.out.print("Ingrese el día: ");
        int dia = read.nextInt();
        System.out.print("Ingrese el mes: ");
        int mes = read.nextInt();
        System.out.print("Ingrese el año: ");
        int anio = read.nextInt();

        Date fechaDeNacimiento = new Date();
        fechaDeNacimiento.setDate(dia);
        fechaDeNacimiento.setMonth(mes);
        fechaDeNacimiento.setYear(anio);
        nacimiento.llenarFecha(fechaDeNacimiento);
        System.out.println("Nacimiento: " + nacimiento);
        
        Date fechaActual = new Date();
        System.out.println("Fecha Actual: " + fechaActual);
        int anioActual = fechaActual.getYear() + 1900;
        System.out.println("Año actual: " + anioActual);

        int diferenciaAnios = (anioActual - fechaDeNacimiento.getYear());
        System.out.println("Diferencia en años: " + diferenciaAnios);
    }
}

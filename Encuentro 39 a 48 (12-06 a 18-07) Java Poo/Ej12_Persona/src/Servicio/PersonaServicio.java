//Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento
//(Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los siguientes métodos:
// Agregar un método de creación del objeto que respete la siguiente firma:
//crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
//usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
//fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
// Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
//en cuenta que para conocer la edad de la persona también se debe conocer la fecha actual.
// Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
//edad y retorna true en caso de que el receptor tenga menor edad que la persona que
//se recibe como parámetro, o false en caso contrario.
// Metodo mostrarPersona(): este método muestra la persona creada en el método
//anterior.
package Servicio;

import Entidades.Persona;
import java.util.Date;
import java.util.Scanner;

public class PersonaServicio {

    Scanner read = new Scanner(System.in).useDelimiter("\n");

    Persona unaPersona = new Persona();

    public Persona crearPersona() {
        System.out.print("Ingrese el nombre de la persona: ");
        unaPersona.setNombre(read.next());

        System.out.print("Ingrese el día de nacimiento: ");
        int dia = read.nextInt();
        System.out.print("Ingrese el mes de nacimiento: ");
        int mes = read.nextInt();
        System.out.print("Ingrese el año de nacimiento: ");
        int anio = read.nextInt();

        Date fechaDeNacimiento = new Date();
        fechaDeNacimiento.setDate(dia);
        fechaDeNacimiento.setMonth(mes);
        fechaDeNacimiento.setYear(anio);
        unaPersona.setFechaDeNacimiento(fechaDeNacimiento);

        return unaPersona;
    }

    public int calcularEdad() {
        Date fechaActual = new Date();
        int anioActual = fechaActual.getYear() + 1900;
//        System.out.println("Año actual: " + anioActual);
        int anioNacimiento = unaPersona.getFechaDeNacimiento().getYear();
//        System.out.println("Año de nacimiento: " + anioNacimiento);
        int edad = anioActual - anioNacimiento;
//        System.out.println("Edad: " + edad);
        unaPersona.setEdadPersona(edad);
        return edad;
    }

    public boolean menorQue(int otraEdad) {
        boolean esMenor = false;
        System.out.println("Ingrese otra edad para comparar: ");
        otraEdad = read.nextInt();

        if (unaPersona.getEdadPersona() == otraEdad) {
            System.out.println("Tienen la misma edad");
        } else if (unaPersona.getEdadPersona() > otraEdad) {
            esMenor = false;
            System.out.println("es menor");
        } else {
            System.out.println("es mayor");
            esMenor = true;
        }
        return esMenor;
    }

    public Persona mostrarPersona() {
        System.out.println("-----------------------------");
        System.out.println(unaPersona.getNombre() + " nació el " + unaPersona.getFechaDeNacimiento().getDate()
                + "/" + unaPersona.getFechaDeNacimiento().getMonth()
                + "/" + unaPersona.getFechaDeNacimiento().getYear() +
                " y tiene " + unaPersona.getEdadPersona() + " años.");
        return null;
    }

}

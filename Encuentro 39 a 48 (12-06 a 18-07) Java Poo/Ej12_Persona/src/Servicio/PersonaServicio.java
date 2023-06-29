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
    
    public Persona crearPersona(){
        System.out.println("Ingrese el nombre de la persona:");
        unaPersona.setNombre(read.next());
        
        Date fechaDeNacimiento = new Date();
        System.out.println("Ingrese el día de nacimiento:");
        int dia = read.nextInt();
        System.out.println("Ingrese el mes de nacimiento:");
        int mes = read.nextInt();
        System.out.println("Ingrese el año de nacimiento:");
        int anio = read.nextInt();
        fechaDeNacimiento.setDate(dia);
        fechaDeNacimiento.setMonth(mes);
        fechaDeNacimiento.setYear(anio);
        unaPersona.setFechaDeNacimiento(fechaDeNacimiento);
        
        
        return unaPersona;
        
    }
}

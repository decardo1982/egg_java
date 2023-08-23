/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
package clases_ej1;

import Entities.Perro;
import Entities.Persona;


public class Clases_Ej1 {


    public static void main(String[] args) {
        
        Perro perro1 = new Perro("Sarah", "Mestizo", 6, "Pequeño");
        Perro perro2 = new Perro("Taco", "Ojevero alemán", 11, "Grande");
        
        Persona persona1 = new Persona("Dario", "Cardozo", 41, 11222333, perro1);
        Persona persona2 = new Persona("Cecilia", "garcia", 42, 12111222, perro2);
        
        System.out.println("Persona 1: " + persona1);
        System.out.println("Persona 2: " + persona2);

    }
    
}

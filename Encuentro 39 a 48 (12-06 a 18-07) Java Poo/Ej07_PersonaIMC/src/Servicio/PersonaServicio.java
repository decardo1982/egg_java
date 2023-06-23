package Servicio;

import Entidades.Persona;
import java.util.Scanner;

public class PersonaServicio {

    Scanner read = new Scanner(System.in).useDelimiter("\n");
    Persona persona = new Persona();

    public Persona crearPersona() {

        System.out.print("Ingrese el nombre de la persona: ");
        persona.setNombre(read.nextLine());

        System.out.print("Ingrese la edad de la persona: ");
        persona.setEdad(read.nextInt());

        do {
            System.out.print("Ingrese el sexo de la persona ('H'ombre / 'M'ujer / 'O'tro): ");
            persona.setSexo(read.nextLine());

        } while (!"H".equals(persona.getSexo()) && !"M".equals(persona.getSexo()) && !"O".equals(persona.getSexo()));

        System.out.print("Ingrese la altura de la persona: (1,82) ");
        persona.setAltura(read.nextDouble());

        System.out.print("Ingrese el peso de la persona: (80,5) ");
        persona.setPeso(read.nextDouble());

        return persona;
    }

    /* calcularIMC
    calculara si la persona está en su peso ideal (peso en kg/(altura^2 en mt2)).
    Si esta fórmula da por resultado un valor menor que 20, significa que la persona
    está por debajo de su peso ideal y la función devuelve un -1.
    Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa
    que la persona está en su peso ideal y la función devuelve un 0. 
    Finalmente, si el resultado de la fórmula es un valor mayor que 25 significa 
    que la persona tiene sobrepeso, y la función devuelve un 1.
     */
    public int calcularIMC(Persona persona) {

        double valorIMC = Math.floor((double) ((double) persona.getPeso() / Math.pow(persona.getAltura(), 2)) * 100) / 100;
        int personaIMC;

        if (valorIMC < 20) {
            personaIMC = -1;
        } else if (valorIMC > 25) {
            personaIMC = 1;
        } else {
            personaIMC = 0;
        }
        System.out.print("valorIMC: " + valorIMC);
        System.out.println("");
        System.out.print("personaIMC: " + personaIMC);
        System.out.println("");
        return personaIMC;
    }

    public boolean esMayorDeEdad(Persona persona) {
        if (persona.getEdad() >= 18) {
            System.out.println("Es mayor de edad.");
            return true;
        } else {
            System.out.println("No es mayor de edad.");
            return false;
        }

    }

}

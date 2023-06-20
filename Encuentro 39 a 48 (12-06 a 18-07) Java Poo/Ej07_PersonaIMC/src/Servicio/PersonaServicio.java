package Servicio;

import Entidades.Persona;
import java.util.Scanner;

public class PersonaServicio {

    Scanner read = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {

        Persona persona = new Persona();

        System.out.print("Ingrese el nombre de la persona: ");
        persona.setNombre(read.nextLine());

        System.out.print("Ingrese la edad de la persona: ");
        persona.setEdad(read.nextInt());

        do {
            System.out.print("Ingrese el sexo de la persona ('H'ombre / 'M'ujer / 'O'tro): ");
            persona.setSexo(read.nextLine());

        } while (persona.getSexo() != "H" && persona.getSexo() != "M" && persona.getSexo() != "O");

        System.out.print("Ingrese la altura de la persona: ");
        persona.setAltura(read.nextDouble());
        
        System.out.print("Ingrese el peso de la persona: ");
        persona.setPeso(read.nextDouble());

        return persona;
    }

}

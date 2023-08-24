package clases_extra_ej1;

import Entities.Perro;
import Entities.Persona;
import java.util.ArrayList;
import java.util.Scanner;

public class Clases_Extra_Ej1 {

    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in).useDelimiter("\n");

        ArrayList<Persona> personas = new ArrayList<>();
        ArrayList<Perro> perros = new ArrayList<>();

        Persona persona1 = new Persona();
        persona1.setNombre("Dario");
        personas.add(persona1);

        Persona persona2 = new Persona();
        persona2.setNombre("Ceci");
        personas.add(persona2);

        Persona persona3 = new Persona();
        persona3.setNombre("Panda");
        personas.add(persona3);

        Persona persona4 = new Persona();
        persona4.setNombre("Buny");
        personas.add(persona4);

        Perro perro1 = new Perro();
        Perro perro2 = new Perro();
        Perro perro3 = new Perro();
        Perro perro4 = new Perro();
        perro1.setNombre("Mapu");
        perro1.setAdoptado(false);
        perro2.setNombre("Taco");
        perro2.setAdoptado(false);
        perro3.setNombre("Brutus");
        perro3.setAdoptado(false);
        perro4.setNombre("Jack");
        perro4.setAdoptado(false);
        perros.add(perro1);
        perros.add(perro2);
        perros.add(perro3);
        perros.add(perro4);
        
        //Lista de perros:
        System.out.println("Perritos adoptables:");
        for (Perro perro : perros) {
            System.out.println(perro.getNombre());
        }
        
        
        for (Persona persona : personas) {
            System.out.println(persona.getNombre() + " ¿a quién querés adoptar?");
            String nombrePerro = read.nextLine();
            
            Perro perroElegido = null;
            for (Perro perro : perros) {
                if (perro.getNombre().equalsIgnoreCase(nombrePerro) && !perro.isAdoptado()) {
                    perroElegido = perro;
                    break;
                }
            }
            if (perroElegido != null) {
                persona.setMascota(perroElegido);
                perroElegido.setAdoptado(true);
                System.out.println(persona.getNombre() + " adoptó a " + perroElegido.getNombre());
            } else {
                System.out.println("Nombre de perro incorrecto o perro no disponible para adoptar...");
            }
        }
        
        System.out.println("Perros adoptados y sus dueños:");
        for (Persona persona : personas) {
            System.out.println(persona.getNombre() + " - " + (persona.getMascota() != null? persona.getMascota().getNombre() : "Ninguno"));
        }
    }

}

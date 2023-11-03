package Services;

import Entities.Persona;
import Enums.EstadoCivil;
import java.util.Scanner;

public class PersonaService {

    Scanner read = new Scanner(System.in).useDelimiter("\n");
    Persona persona = new Persona() {
    };

    public void cambiarEstadoCivil() {
        int opcion = 1;
        System.out.println("El estado civil actual es " + persona.getEstadoCivil());
        for (EstadoCivil object : EstadoCivil.values()) {
            System.out.println(opcion + " " + object);
            opcion++;
        }
        boolean flag = false;
        System.out.println("Seleccione nuevo estado civil:");

        do {
            int nuevaOpcion = read.nextInt();

            switch (nuevaOpcion) {
                case 1:
                    persona.setEstadoCivil(EstadoCivil.SOLTERO);
                    flag = true;
                    break;
                case 2:
                    persona.setEstadoCivil(EstadoCivil.CASADO);
                    flag = true;
                    break;
                case 3:
                    persona.setEstadoCivil(EstadoCivil.DIVORCIADO);
                    flag = true;
                    break;
                case 4:
                    persona.setEstadoCivil(EstadoCivil.VIUDO);
                    flag = true;
                    break;
                case 5:
                    persona.setEstadoCivil(EstadoCivil.UNION_CIVIL);
                    flag = true;
                    break;
                default:
                    System.out.println("Ingrese una opción válida");
                    break;
            }
        } while (!flag);

        System.out.println("El nuevo estado civil es " + persona.getEstadoCivil());

    }

}

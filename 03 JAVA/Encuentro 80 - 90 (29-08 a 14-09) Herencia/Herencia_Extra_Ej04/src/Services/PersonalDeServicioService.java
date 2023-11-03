package Services;

import Entities.PersonalDeServicio;
import Enums.Seccion;

public class PersonalDeServicioService extends EmpleadoService {

    PersonalDeServicio personalServicio = new PersonalDeServicio();

    public void trasladoDeSeccion() {
        int opcion = 1;
        System.out.println("La sección actual es " + personalServicio.getSeccionAsignada());

        for (Seccion object : Seccion.values()) {
            System.out.println(opcion + " " + object);
            opcion++;
        }

        boolean flag = false;
        System.out.println("Ingrese la nueva sección:");
        do {
            int nuevaOpcion = read.nextInt();

            switch (nuevaOpcion) {
                case 1:
                    personalServicio.setSeccionAsignada(Seccion.BIBLIOTECA);
                    flag = true;
                    break;
                case 2:
                    personalServicio.setSeccionAsignada(Seccion.DECANATO);
                    flag = true;
                    break;
                case 3:
                    personalServicio.setSeccionAsignada(Seccion.SECRETARIA);
                    flag = true;
                    break;
                default:
                    System.out.println("Ingrese una opción válida");
                    break;
            }

        } while (!flag);
        
        System.out.println("La nueva sección asignada es " + personalServicio.getSeccionAsignada());

    }

}

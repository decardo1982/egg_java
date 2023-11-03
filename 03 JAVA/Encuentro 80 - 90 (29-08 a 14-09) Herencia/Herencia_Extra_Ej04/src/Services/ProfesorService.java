package Services;

import Entities.Profesor;
import Enums.Departamento;

public class ProfesorService extends EmpleadoService {

    Profesor profesor = new Profesor();

    public void cambioDepartamento() {
        int opcion = 1;
        System.out.println("El departamento asignado actual es: " + profesor.getDepartamentoAsignado());

        for (Departamento object : Departamento.values()) {
            System.out.println(opcion + " " + object);
            opcion++;
        }
        boolean flag = false;
        System.out.println("Ingrese el departamento A ASIGNAR:");
        do {
            int nuevaOpcion = read.nextInt();

            switch (nuevaOpcion) {
                case 1:
                    profesor.setDepartamentoAsignado(Departamento.LENGUAJE);
                    flag = true;
                    break;
                case 2:
                    profesor.setDepartamentoAsignado(Departamento.MATEMATICAS);
                    flag = true;
                    break;
                case 3:
                    profesor.setDepartamentoAsignado(Departamento.ARQUITECTURA);
                    flag = true;
                    break;
                default:
                    System.out.println("Ingrese una opción válida");
                    break;
            }

        } while (!flag);

        System.out.println("El nuevo departamento asignado es " + profesor.getDepartamentoAsignado());

    }

}

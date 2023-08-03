package Services;

import Entities.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

public class AlumnoService {

    Scanner read = new Scanner(System.in).useDelimiter("\n");

    ArrayList<Alumno> alumnos = new ArrayList();

    public void crearAlumno() {
        String respuesta = "";
        do {
            System.out.print("Ingrese el nombre del alumno: ");
            String nombre = read.next();
            System.out.print("Ingrese la nota Nº 1: ");
            int nota1 = read.nextInt();
            System.out.print("Ingrese la nota Nº 2: ");
            int nota2 = read.nextInt();
            System.out.print("Ingrese la nota Nº 3: ");
            int nota3 = read.nextInt();

            alumnos.add(new Alumno(nombre, nota1, nota2, nota3));

            System.out.println("Ingrese 'SI' para cargar notas de otro alumno... ");
            respuesta = read.next();

        } while (respuesta.equalsIgnoreCase("si"));

        for (Alumno alumno : alumnos) {
            System.out.println(alumno);
        }

    }

    public Alumno buscarAlumno() {
        System.out.print("Ingrese el nombre del alumno para calcular su promedio: ");
        String nombre = read.next();
        double notaPromedio;
        for (Alumno alumno : alumnos) {

            if (alumno.getNombre().equalsIgnoreCase(nombre)) {

                notaPromedio = (alumno.getNota1()+alumno.getNota2()+alumno.getNota3())/3;
                
                System.out.println("El promedio de " + nombre + " es " + notaPromedio);
                break;

            } else {
                System.out.println("El alumno no se encuentra en la lista.");
            }

        }
        return null;

    }

}

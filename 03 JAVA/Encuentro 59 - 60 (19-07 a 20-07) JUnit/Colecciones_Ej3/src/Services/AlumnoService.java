package Services;

import Entities.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

public class AlumnoService {

    public void crearAlumno() {

        Scanner read = new Scanner(System.in).useDelimiter("\n");

        ArrayList<Alumno> alumnos = new ArrayList();

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
    
   

}

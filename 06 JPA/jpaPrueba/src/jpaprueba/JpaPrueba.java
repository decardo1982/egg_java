package jpaprueba;

import java.util.ArrayList;
import java.util.Date;
import jpaprueba.logica.Alumno;
import jpaprueba.logica.Controladora;
//import jpaprueba.persistencia.ControladoraPersistencia; primeramente para crear la tabla "Alumno" en la DB

public class JpaPrueba {

    public static void main(String[] args) {

//        ControladoraPersistencia controlPersis = new ControladoraPersistencia(); primeramente para crear la tabla "Alumno" en la DB
        Controladora control = new Controladora();
//        Alumno alu = new Alumno(15, "Dario", "Cardozo", new Date());
        /*Alumno alu = new Alumno(30, "Ceci", "Pifi", new Date());*/
        Alumno al2 = new Alumno(10, "Vai", "Iato", new Date());
        control.crearAlumno(al2);
//        control.crearAlumno(alu);
//        alu.setApellido("Pifi");
//        control.editarAlumno(alu);
//        control.eliminarAlumno(15);
        Alumno alu = control.traerAlumno(15);
        System.out.println("-------------------BUSQUEDA INDIVIDUAL-------------------");
        System.out.println("El alumno es " + alu.toString());
        System.out.println("--------------------BUSQUEDA DE TODOS---------------------");
        ArrayList<Alumno> listaAlumnos = control.traerListaAlumnos();
        for (Alumno listaAlumno : listaAlumnos) {
            System.out.println("El alumno es: " + listaAlumno.toString());
        }

    }

}


//video 8
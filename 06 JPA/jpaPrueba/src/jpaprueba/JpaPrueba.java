package jpaprueba;

//import java.util.ArrayList;
import java.util.Date;
import jpaprueba.logica.Alumno;
import jpaprueba.logica.Carrera;
import jpaprueba.logica.Controladora;
//import jpaprueba.persistencia.ControladoraPersistencia; primeramente para crear la tabla "Alumno" en la DB

public class JpaPrueba {

    public static void main(String[] args) {

        /*ControladoraPersistencia controlPersis = new ControladoraPersistencia(); primeramente para crear la tabla "Alumno" en la DB
        Alumno alu = new Alumno(15, "Dario", "Cardozo", new Date());
        Alumno alu = new Alumno(30, "Ceci", "Pifi", new Date());
        Alumno al1 = new Alumno(11, "Olaf", "Perrote", new Date());
        control.crearAlumno(al1);
        control.crearAlumno(alu);
        alu.setApellido("Pifi");
        control.editarAlumno(alu);
        control.eliminarAlumno(15);
        Alumno alu = control.traerAlumno(15);
        System.out.println("-------------------BUSQUEDA INDIVIDUAL-------------------");
        System.out.println("El alumno es " + alu.toString());
        System.out.println("--------------------BUSQUEDA DE TODOS---------------------");
        ArrayList<Alumno> listaAlumnos = control.traerListaAlumnos();
        for (Alumno listaAlumno : listaAlumnos) {
            System.out.println("El alumno es: " + listaAlumno.toString());
        }
         */
        Controladora control = new Controladora();

        //Creación carrera
        Carrera carre = new Carrera(25, "Tecnicatura en programación");

        //Guardado carrera en DB        
        control.crearCarrera(carre);

        //Creación alumno con carrera
        Alumno al = new Alumno(2, "Dino", "Saurio", new Date(), carre);

        //Guardamos el alumno en la DB
        control.crearAlumno(al);

        //Vemos el resultado
        System.out.println("------------------------------");
        System.out.println("---------DATOS ALUMNO---------");
        Alumno alu = control.traerAlumno(2);
        System.out.println("Alumno: " + alu.getNombre() + alu.getApellido());
        System.out.println("Cursa la carrera de: " + alu.getCarre().getNombre());
    }

}

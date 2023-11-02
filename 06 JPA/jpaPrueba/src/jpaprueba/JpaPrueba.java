package jpaprueba;

//import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import jpaprueba.logica.Alumno;
import jpaprueba.logica.Carrera;
import jpaprueba.logica.Controladora;
import jpaprueba.logica.Materia;
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

        //Creamos lista de materias y las agregamos
        LinkedList<Materia> listaMaterias = new LinkedList<Materia>();

        //Creación carrera con lista de materias
        Carrera carre = new Carrera(25, "Tecnicatura en programación", listaMaterias);

        //Guardado carrera en DB        
        control.crearCarrera(carre);

        //Creación materias
        Materia mate1 = new Materia(58, "Progamación 1", "Cuatrimestral", carre);
        Materia mate2 = new Materia(59, "Progamación 2", "Cuatrimestral", carre);
        Materia mate3 = new Materia(60, "Progamación Avanzada", "Anual", carre);

        //Guardado materias en DB
        control.crearMateria(mate1);
        control.crearMateria(mate2);
        control.crearMateria(mate3);

        //agregar a la lista las materias
        listaMaterias.add(mate1);
        listaMaterias.add(mate2);
        listaMaterias.add(mate3);
        
        carre.setListaMaterias(listaMaterias);
        control.editarCarrera(carre);

        //Creación alumno con carrera
        Alumno al = new Alumno(2, "Dino", "Saurio", new Date(), carre);

        //Guardamos el alumno en la DB
        control.crearAlumno(al);

        //Vemos el resultado
        System.out.println("------------------------------");
        System.out.println("---------DATOS ALUMNO---------");
        Alumno alu = control.traerAlumno(2);
        System.out.println("Alumno: " + alu.getNombre() + " " + alu.getApellido());
        System.out.println("Cursa la carrera de: " + alu.getCarre().getNombre());
    }

}

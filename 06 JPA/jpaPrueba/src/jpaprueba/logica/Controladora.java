package jpaprueba.logica;

import java.util.ArrayList;
import jpaprueba.persistencia.ControladoraPersistencia;

public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    //Alumno
    public void crearAlumno(Alumno alu) {

        controlPersis.crearAlumno(alu);
    }

    public void eliminarAlumno(int id) {

        controlPersis.eliminarAlumno(id);
    }

    public void editarAlumno(Alumno alu) {

        controlPersis.editarAlumno(alu);
    }

    //es una función porque tiene que retornar un valor
    public Alumno traerAlumno(int id) {
        return controlPersis.traerAlumno(id);
    }

    public ArrayList<Alumno> traerListaAlumnos() {
        return controlPersis.traerListaAlumnos();

    }

    //Carrera
    public void crearCarrera(Carrera carre) {

        controlPersis.crearCarrera(carre);
    }

    public void eliminarCarrera(int id) {

        controlPersis.eliminarCarrera(id);
    }

    public void editarCarrera(Carrera carre) {

        controlPersis.editarCarrera(carre);
    }

    //es una función porque tiene que retornar un valor
    public Carrera traerCarrera(int id) {
        return controlPersis.traerCarrera(id);
    }

    public ArrayList<Carrera> traerListaCarreras() {
        return controlPersis.traerListaCarreras();

    }

    //Materia
    public void crearMateria(Materia mate) {

        controlPersis.crearMateria(mate);
    }

    public void eliminarMateria(int id) {

        controlPersis.eliminarMateria(id);
    }

    public void editarMateria(Materia mate) {

        controlPersis.editarMateria(mate);
    }

    //es una función porque tiene que retornar un valor
    public Materia traerMateria(int id) {
        return controlPersis.traerMateria(id);
    }

    public ArrayList<Materia> traerListaMaterias() {
        return controlPersis.traerListaMaterias();

    }

}

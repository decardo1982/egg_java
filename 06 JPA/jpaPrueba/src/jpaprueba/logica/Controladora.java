package jpaprueba.logica;

import java.util.ArrayList;
import jpaprueba.persistencia.ControladoraPersistencia;

public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

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
    
    public ArrayList<Alumno> traerListaAlumnos(){
     return controlPersis.traerListaAlumnos();   
        
        
    }
    

}

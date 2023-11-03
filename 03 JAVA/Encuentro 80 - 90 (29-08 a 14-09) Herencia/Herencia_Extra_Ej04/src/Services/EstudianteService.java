package Services;

import Entities.Estudiante;

public class EstudianteService extends PersonaService {
    
    Estudiante estudiante = new Estudiante();
    
    public void matriculacion(){
        
        System.out.println("Ingrese al curso que se va a matricular:");
        estudiante.setCursoMatriculado(read.next());
        System.out.println("Se ha matriculado al curso: " + estudiante.getCursoMatriculado());
    }
    
}

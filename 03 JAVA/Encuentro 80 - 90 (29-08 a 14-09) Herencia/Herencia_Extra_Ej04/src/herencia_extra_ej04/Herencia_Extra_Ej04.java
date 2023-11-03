package herencia_extra_ej04;

import Entities.Persona;
import Entities.Profesor;
import Enums.Departamento;
import Enums.EstadoCivil;
import Services.EstudianteService;
import Services.PersonalDeServicioService;
import Services.ProfesorService;

public class Herencia_Extra_Ej04 {

    public static void main(String[] args) {

//      Profesor(Departamento departamentoAsignado, Integer anioIngreso, Integer numDespacho, String nombre, String apellido, Integer id, EstadoCivil estadoCivil)
        Profesor profe = new Profesor(Departamento.ARQUITECTURA, 2020, 3, "Dario", "Cardo", 29414, EstadoCivil.CASADO);
        ProfesorService profe1 = new ProfesorService();        

        System.out.println(profe.toString());

//        prof.reasignarDespacho();
//        prof.cambioDepartamento();
        EstudianteService estudiante = new EstudianteService();
//        estudiante.matriculacion();

        PersonalDeServicioService ps = new PersonalDeServicioService();
//        ps.trasladoDeSeccion();

    }

}

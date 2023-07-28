/*
Crear una clase llamada AlumnoMain que mantenga información sobre las notas de distintos
alumnos. La clase AlumnoMain tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.
En el servicio de AlumnoMain deberemos tener un bucle que crea un objeto AlumnoMain. Se pide
toda la información al usuario y ese AlumnoMain se guarda en una lista de tipo AlumnoMain y se le
pregunta al usuario si quiere crear otro AlumnoMain o no.
Después de ese bucle tendremos el siguiente método en el servicio de AlumnoMain:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
 */
package Main;

import Services.AlumnoService;


public class AlumnoMain {


    public static void main(String[] args) {
        
        AlumnoService as = new AlumnoService();
        
        as.crearAlumno();
        as.buscarAlumno();

    }
    
}

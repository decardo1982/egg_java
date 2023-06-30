/*Un profesor particular está dando cursos para grupos de cinco alumnos y necesita un
programa para organizar la información de cada curso. Para ello, crearemos una clase
entidad llamada Curso, cuyos atributos serán: nombreCurso, cantidadHorasPorDia,
cantidadDiasPorSemana, turno (mañana o tarde), precioPorHora y alumnos. Donde
alumnos es un arreglo de tipo String de dimensión 5 (cinco), donde se alojarán los
nombres de cada alumno. A continuación, se implementarán los siguientes métodos:
 Un constructor por defecto.
 Un constructor con todos los atributos como parámetro.
 Métodos getters y setters de cada atributo.
 método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos
que asisten a las clases. Nosotros nos encargaremos de almacenar esta información
en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el
nombre de cada alumno.
 Método crearCurso(): el método crear curso, le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Curso. En este método invocaremos al método cargarAlumnos() para asignarle valor
al atributo alumnos
 Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia
en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por
día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que
se repite el encuentro.*/
package Servicio;

import Entidades.Curso;
import java.util.Scanner;

public class CursoServicio {

    Scanner read = new Scanner(System.in).useDelimiter("\n");

    Curso cursillo = new Curso();

    public Curso cargarAlumnos() {
        //llenamos el array de 5 alumnos
        for (int i = 0; i < cursillo.getAlumnos().length; i++) {
            System.out.println("Ingrese el nombre del " + (i + 1) + "º alumno:");
            String nombre = read.next();
            cursillo.getAlumnos()[i] = nombre;
        }
        //lo mostramos por pantalla
        System.out.println("Alumnos:");
        System.out.println("--------");
        for (int i = 0; i < cursillo.getAlumnos().length; i++) {
            System.out.println("Alumno Nº: " + (i + 1) + " " + cursillo.getAlumnos()[i]);
        }
        return cursillo;
    }

    public Curso crearCurso() {

        System.out.print("Ingrese el nombre del curso: ");
        cursillo.setNombreCurso(read.next());
        System.out.print("Ingrese la cantidad de horas por día: ");
        cursillo.setCantidadHorasPorDia(read.nextInt());
        System.out.print("Ingrese la cantidad de días por semana: ");
        cursillo.setCantidadDiasPorSemana(read.nextInt());
        System.out.println("Ingrese el turno (M / T)");
        cursillo.setTurno(read.next());
        System.out.print("Ingrese el valor $$ de la hora: ");
        cursillo.setPrecioPorHora(read.nextInt());
        cargarAlumnos();
        return null;
    }

    public int calcularGananciaSemanal() {
        int gananciaSemanal = cursillo.getCantidadHorasPorDia()
                * cursillo.getCantidadDiasPorSemana()
                * cursillo.getPrecioPorHora()
                * cursillo.getAlumnos().length;

        System.out.println("La ganancia semanal para el curso de " + cursillo.getNombreCurso() + " es de $" + gananciaSemanal + ".-");

        return gananciaSemanal;
    }

}

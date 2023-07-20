package Servicios;

import Entidades.Rutina;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RutinaService {

    Scanner read = new Scanner(System.in).useDelimiter("\n");
    Rutina r1 = new Rutina();
    static List<Rutina> listaRutina = new ArrayList<>();

    public void rellenarRutina() {

        r1.setId(listaRutina.size());
        System.out.print("Nombre de la rutina: ");
        r1.setNombre(read.next());
        System.out.print("Duracion: ");
        r1.setDuracion(read.nextInt());
        System.out.print("Nivel de dificultad: ");
        r1.setNivelDificultad(read.next());
        System.out.print("Descripcion: ");
        r1.setDescripcion(read.next());
        crearRutina(r1);
    }

    //CrearRutina(Rutina rutina): recibe un objeto de tipo Rutina y lo agrega al sistema.
    public static void crearRutina(Rutina rutina) {
        listaRutina.add(rutina);
    }
//obtenerRutinas(): devuelve una lista con todas las rutinas registradas en el sistema.

    public static List obtenerRutinas() {
        return listaRutina;
    }

    public static void mostrarRutina() {
        for (int i = 0; i < listaRutina.size(); i++) {
            System.out.println(listaRutina.get(i));
        }
    }
    //actualizarRutina(int id, String nombre, int duracion, String nivelDificultad, String descripcion): recibe el identificador
    //de una rutina existente y los nuevos datos de la rutina, y actualiza la información correspondiente en el sistema.

    public void actualizarRutina(int id, String nombre, int duracion, String nivelDificultad, String descripcion) {

        Rutina cAux = new Rutina(id, nombre, duracion, nivelDificultad, descripcion);

        listaRutina.set(id, cAux);

    }

    //eliminarRutina(int id): recibe el identificador de una rutina existente y la elimina del sistema.
    public static void eliminarRutina(int id) {
        listaRutina.remove(id);
    }

    public void actualizarID() {

    }
}

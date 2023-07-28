package Service;

import Entities.Pelicula;
import java.util.ArrayList;
import java.util.Scanner;

public class PeliculaService {

    private Scanner read;

    private ArrayList<Pelicula> peliculas;

    public PeliculaService() {
        this.read = new Scanner(System.in).useDelimiter("\n");
        this.peliculas = new ArrayList();
    }
//En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
//todos sus datos y guardándolos en el objeto Pelicula

    public void crearPelicula() {
        String respuesta = "";
        String nombrePeli;
        String directorPeli;
        int duracionPeli;

        do {

            System.out.print("Ingrese el nombre de la película: ");
            nombrePeli = read.next();

            System.out.print("Ingrese el nombre del director: ");
            directorPeli = read.next();

            System.out.print("Ingrese la duración en horas: ");
            duracionPeli = read.nextInt();

            peliculas.add(new Pelicula(nombrePeli, directorPeli, duracionPeli));
            
            System.out.println("Escriba 'SI' para agregar otra película...:");
            respuesta = read.next();

        } while (respuesta.equalsIgnoreCase("si"));

    }

//Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
//crear otra Pelicula o no.

}

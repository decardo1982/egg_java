package Service;

import Entities.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
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

//    harcodeo 5 pelis para hacer las pruebas
    public void crearCincoPeliculas() {
        peliculas.add(new Pelicula("Miserables", "Abrevaya", 8));
        peliculas.add(new Pelicula("Chernobyl", "Svetlana", 3));
        peliculas.add(new Pelicula("Adios Adios", "Guachosky", 1));
        peliculas.add(new Pelicula("Harry Porter", "Rowling", 18));
        peliculas.add(new Pelicula("Los anillos del Mister", "A.C.K.K. Pinti", 20));
    }

//Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
//crear otra Pelicula o no.
//    Mostrar en pantalla todas las películas.
    public void mostrarTodasLasPeliculas() {
        Iterator iterator = peliculas.iterator();

        System.out.println("Lista de todas las películas:");
        System.out.println("-----------------------------");
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
        System.out.println("");
    }

//    Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
    public void mostrarDuracionMayorUnaHora() {
        Iterator iterator = peliculas.iterator();

        System.out.println("Películas con una duración mayor a 1 hora:");
        System.out.println("------------------------------------------");

        while (iterator.hasNext()) {
            Pelicula pelicula = (Pelicula) iterator.next();
            if (pelicula.getDuracion() > 1) {
                System.out.println(pelicula.toString());
//                System.out.println("Título: " + pelicula.getTitulo());
//                System.out.println("Director: " + pelicula.getDirector());
//                System.out.println("Duración: " + pelicula.getDuracion());
            }
        }

    }

//    Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en pantalla.
    public void ordenarDuracionMayorAMenor() {
        Comparator<Pelicula> compararPorDuracion= new Comparator<Pelicula>(){
            @Override
            public int compare(Pelicula p1, Pelicula p2){
                return Integer.compare(p2.getDuracion(), p1.getDuracion());
            }
        };
        Collections.sort(peliculas, compararPorDuracion);
        
        System.out.println("Películas ordenadas por duración (de mayor a menor):");
        System.out.println("----------------------------------------------------");
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula.toString());
            
        }
    }

//    Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en pantalla.
    public void ordenarDuracionMenorAMayor(){
        Comparator<Pelicula> compararPorDuracion = new Comparator<Pelicula>(){
            @Override
            public int compare(Pelicula p1, Pelicula p2){
                return Integer.compare(p1.getDuracion(), p2.getDuracion());
            }
        };
        Collections.sort(peliculas, compararPorDuracion);
        
        System.out.println("Películas ordenadas por duración (de menor a mayor):");
        System.out.println("----------------------------------------------------");
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula.toString());
        }
    }
    
    
//    Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
    public void ordenarPorTitulo(){
        Comparator<Pelicula> compararPorTitulo = new Comparator<Pelicula>(){
            @Override
            public int compare(Pelicula p1, Pelicula p2){
                return p1.getTitulo().compareToIgnoreCase(p2.getTitulo());
            }  
        };
        Collections.sort(peliculas, compararPorTitulo);
        
        System.out.println("Películas ordenadas por título alfabéticamente:");
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula.toString());
        }
    }
    
//    Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
    public void ordenarPorDirector(){
        Comparator<Pelicula> compararPorDirector = new Comparator<Pelicula>(){
            @Override
            public int compare(Pelicula p1, Pelicula p2){
                return p1.getDirector().compareToIgnoreCase(p2.getDirector());
            }
        };
        Collections.sort(peliculas, compararPorDirector);
        
        System.out.println("Pelicuás ordenadas por director alfabéticamente:");
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula.toString());
        }
    }
    
}

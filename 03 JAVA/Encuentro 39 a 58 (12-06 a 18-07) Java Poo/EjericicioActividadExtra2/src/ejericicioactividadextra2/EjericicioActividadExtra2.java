/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejericicioactividadextra2;

import ejericicioactividadextra2.Entidad.Servicio.AlquilerServicio;
import ejericicioactividadextra2.Entidad.Servicio.PeliculaServicio;
import java.util.Scanner;

/**
 *
 * @author Daniel Atehortuua
 */
public class EjericicioActividadExtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        AlquilerServicio as = new AlquilerServicio();
        PeliculaServicio ps = new  PeliculaServicio();
        
        Scanner leer = new Scanner(System.in);
        boolean salir = false;
        int eleccion;

        while (!salir) {

            System.out.println("Menú");
            System.out.println("1. Cargar una pelicula");
            System.out.println("2. Lista de peliculas disponibles");
            System.out.println("3. Crear un alquiler");
            System.out.println("4. Lista de todos los alquileres");
            System.out.println("5. Buscar pelicula por título");
            System.out.println("6. Buscar pelicula por genero");
            System.out.println("7. Buscar alquileres por fecha");
            System.out.println("8. Salir");
            System.out.println("Ingrese una de las opciones: ");
            eleccion = leer.nextInt();

            switch (eleccion) {
                case 1:
                    ps.crearPelicula();
                    break;
                case 2:
                    ps.ListarPeliculas();
                    break;
                case 3:
                    as.crearAlquiler();
                    break;
                case 4:
                    as.ListarPeliculasAlquiladas();
                    break;
                case 5:
                    ps.peliculaPorTitulo();
                    break;
                case 6:
                    ps.peliculaPorGenero();
                    break;
                case 7: 
                    as.alquilerPorFecha();
                    break;
                case 8:
                    salir = true;
                default:
                    throw new AssertionError();
            }
        }

        System.out.println("Ingrese una opción: ");

    }

}

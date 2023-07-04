/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejericicioactividadextra2.Entidad.Servicio;

import ejericicioactividadextra2.Entidad.Pelicula;
import java.util.Scanner;

/**
 *
 * @author Daniel Atehortuua
 */
public class PeliculaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private Pelicula[] peliculas = new Pelicula[5];

    public void crearPelicula() {

        for (int i = 0; i < 5; i++) {
            if (peliculas[i] == null) {
                Pelicula peli = new Pelicula();
                System.out.println("Ingrese el título: ");
                peli.setTitulo(leer.next());
                System.out.println("Ingrese el género: ");
                peli.setGenero(leer.next());
                System.out.println("Ingrese el año: ");
                peli.setAño(leer.nextInt());
                System.out.println("Ingrese la duración: ");
                peli.setDuración(leer.nextInt());

                peliculas[i] = peli;
            } else {
                System.out.println("No hay espacio");
            }

        }

    }
    
    public void ListarPeliculas(){
    
        System.out.println("Peliculas disponibles");
        for (int i = 0; i < 5; i++) {
            System.out.println(peliculas[i]);
        }
        
    }
    
    public void peliculaPorTitulo(){
    
        System.out.println("Ingrese el título de la película que desea buscar:");
        String buscarTitulo = leer.next();
        boolean existe = false;
        
        for (int i = 0; i < 5; i++) {
            
           if(peliculas[i].getTitulo().equals(buscarTitulo)){
               System.out.println("Si existe");
               existe = true;
               break;
           }
        }
        if(!existe){
            System.out.println("No existe");
        }
    }
}

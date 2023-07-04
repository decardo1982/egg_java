/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Pelicula;
import java.util.Scanner;

/**
 *
 * @author dario
 */
public class PeliculaServicio {
    
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    Pelicula peli = new Pelicula();
    
    public void crearPelicula(){
        System.out.println("Ingrese el título: ");
        peli.setTitulo(read.nextLine());
        System.out.println("Ingrese el género: ");
        peli.setGenero(read.nextLine());
        System.out.println("Ingrese el año:");
        peli.setAnio(read.nextInt());
        System.out.println("Ingrese la duración:");
        peli.setDuracion(read.nextInt());
    }
    
}

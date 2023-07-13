/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Alquiler;
import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author dario
 */
public class AlquilerServicio {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        Alquiler alqui = new Alquiler();
        Calendar fechaInicio = Calendar.getInstance();
    
    public void crearPelicula(){
        System.out.println("Ingrese el título de la pelicula alquilada: ");
       // alqui.setPeliculaAlquilada(read.next());
        System.out.println("Ingrese el año:");
        fechaInicio.set(Calendar.YEAR, read.nextInt());
        System.out.println("Ingrese el mes:");
        fechaInicio.set(Calendar.MONTH, read.nextInt());
        System.out.println("Ingrese el día:");
        fechaInicio.set(Calendar.DATE, read.nextInt());
        
    }
    
}

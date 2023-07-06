/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejericicioactividadextra2.Entidad.Servicio;

import ejericicioactividadextra2.Entidad.Alquiler;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author Daniel Atehortuua
 */
public class AlquilerServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Alquiler alqui = new Alquiler();
    Calendar fechaInicio = Calendar.getInstance();
    Calendar fechaFin = Calendar.getInstance();
    private Alquiler[] alquileres = new Alquiler[1];

    public void crearAlquiler() {

        for (int i = 0; i < 1; i++) {
            if (alquileres[i] == null) {
                System.out.println("Ingrese el nombre de la pelicula alquilada ");
                alqui.setPeliculaAlquilada(leer.next());
                System.out.println("Ingrese el año de fecha inicio: ");
                int anoInicio = leer.nextInt();
                fechaInicio.set(Calendar.YEAR, anoInicio);
                System.out.println("Ingrese el mes de fecha inicio: ");
                int mesInicio = leer.nextInt();
                fechaInicio.set(Calendar.MONTH, mesInicio);
                System.out.println("Ingrese el día de fecha inicio: ");
                int diaInicio = leer.nextInt();
                fechaInicio.set(Calendar.DATE, diaInicio);
                System.out.println("Ingrese el año de fecha fin: ");
                int anoFin = leer.nextInt();
                fechaFin.set(Calendar.YEAR, anoFin);
                System.out.println("Ingrese el mes de fecha fin: ");
                int mesFin = leer.nextInt();
                fechaFin.set(Calendar.MONTH, mesFin);
                System.out.println("Ingrese el día de fecha fin: ");
                int diaFin = leer.nextInt();
                fechaFin.set(Calendar.DATE, diaFin);

                alquileres[i] = alqui;
            } else {
                System.out.println("No hay espacio");
            }
        }

    }

    public void ListarPeliculasAlquiladas() {

        System.out.println("Peliculas alquiladas");
        for (int i = 0; i < 1; i++) {
            System.out.println(alquileres[i]);
        }
    }

    public void alquilerPorFecha() {

        Calendar fechaBuscar = Calendar.getInstance();
        boolean existe = false;

        System.out.println("Ingrese el año de fecha a buscar: ");
        fechaBuscar.set(Calendar.YEAR, leer.nextInt());
        System.out.println("Ingrese el mes de fecha a buscar: ");
        fechaBuscar.set(Calendar.MONTH, leer.nextInt());
        System.out.println("Ingrese el día de fecha a buscar: ");
        fechaBuscar.set(Calendar.DATE, leer.nextInt());

        for (int i = 0; i < 1; i++) {
            if (alquileres[i].getFechaInicio().after(fechaBuscar) || alquileres[i].getFechaFin().before(fechaBuscar)) {
                System.out.println("Si existe");
                System.out.println(alquileres[i].toString());
                existe = true;
                break;
            }
        }
        if (!existe) {
            System.out.println("No existe");
        }

    }
    
    public void calcularIngreso(){
                
        for (int i = 0; i < 1; i++) {
           int dias = alquileres[i].getFechaInicio().get(Calendar.DATE) - alquileres[i].getFechaFin().get(Calendar.DATE);
           if(dias == 3 ){
               alquileres[i].setPrecio(10);
           }
           else{
               alquileres[i].setPrecio(20);
           }
        }
        
    }

}

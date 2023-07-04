package ejericicioactividadextra2.Entidad.Servicio;

import ejericicioactividadextra2.Entidad.Alquiler;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;

public class AlquilerServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Alquiler alqui = new Alquiler();
    Calendar fechaInicio = Calendar.getInstance();
    Calendar fechaFin = Calendar.getInstance();
    private Alquiler[] alquileres = new Alquiler[3];

    public void crearAlquiler() {

        for (int i = 0; i < 3; i++) {
            if (alquileres[i] == null) {
                System.out.println("Ingrese el nombre de la pelicula alquilada ");
                alqui.setPeliculaAlquilada(leer.next());
                System.out.println("Ingrese el año de fecha inicio: ");
                fechaInicio.set(Calendar.YEAR, leer.nextInt());
                System.out.println("Ingrese el mes de fecha inicio: ");
                fechaInicio.set(Calendar.MONTH, leer.nextInt());
                System.out.println("Ingrese el día de fecha inicio: ");
                fechaInicio.set(Calendar.DATE, leer.nextInt());
                System.out.println("Ingrese el año de fecha fin: ");
                fechaFin.set(Calendar.YEAR, leer.nextInt());
                System.out.println("Ingrese el mes de fecha fin: ");
                fechaFin.set(Calendar.MONTH, leer.nextInt());
                System.out.println("Ingrese el día de fecha fin: ");
                fechaFin.set(Calendar.DATE, leer.nextInt());

                alquileres[i] = alqui;
            } else {
                System.out.println("No hay espacio");
            }
        }

    }

    public void ListarPeliculasAlquiladas() {

        System.out.println("Peliculas alquiladas");
        for (int i = 0; i < 3; i++) {
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

        for (int i = 0; i < 3; i++) {
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
        
        int dias = 0;
        Calendar fechaLimite = alquileres.getFechaInicio();
        fechaLimite.add(Calendar.DATE, 3);
        for (int i = 0; i < 3; i++) {
            dias = alquileres[i].getFechaInicio().get(Calendar.DATE) - alquileres[i].getFechaFin().get(Calendar.DATE);
        }
        
    }

}

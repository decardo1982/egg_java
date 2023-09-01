package Services;

import Entities.Asiento;
import Entities.Cine;
import Entities.Espectador;
import Entities.Pelicula;
import Enums.Columna;
import java.util.ArrayList;
import java.util.Scanner;

public class CineServicio {

    private Scanner read = new Scanner(System.in).useDelimiter("\n");

    public Cine abrirCine() {
        Cine c = new Cine();

        c.setPelicula(new Pelicula("Interstellar", 180, 18, "Christopher Nolan"));
        c.setPrecio(1000);

        Asiento s[][] = new Asiento[8][6];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                Integer a = 8 - i;
                String b = a.toString();

                switch (j) {
                    case 0:
                        b = b.concat("A");
                        break;
                    case 1:
                        b = b.concat("B");
                        break;
                    case 2:
                        b = b.concat("C");
                        break;
                    case 3:
                        b = b.concat("D");
                        break;
                    case 4:
                        b = b.concat("E");
                        break;
                    case 5:
                        b = b.concat("F");
                        break;
                    default:
                        throw new AssertionError();
                }
                s[i][j] = new Asiento(b, null);
            }
        }
        c.setSala(s);

        ArrayList<String> a = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            for (Columna aux : Columna.values()) {
                String asiento = (8 - i) + aux.toString();
                a.add(asiento);
            }
        }

        c.setAsientosLibres(a);
        return c;
    }

    //Menu para cambiar pelicula y precio del cine
    public Cine modificarCine(Cine c) {
        System.out.println("---MENU CINE---");
        System.out.println("a desarrollar");
        //incluir opciones de cambio de película y precio de entrada
        return c;
    }

    //Creación de espectadores posibles para ingresar al cine
    public ArrayList<Espectador> crearPosiblesEspectadores() {
        ArrayList<Espectador> interesados = new ArrayList();
        int cantidad = 25 + (int) (Math.random() * 60);
        for (int i = 0; i < cantidad; i++) {
            Espectador e = new Espectador("Interesado " + i + 1, (int) (Math.random() * 70), (int) (Math.random() * 1500));
            interesados.add(e);
        }
        System.out.println("Hay " + interesados.size() + " posibles espectadores.");
        return interesados;
    }

    //Control de posibles espectadores, cobro y asignación de butaca si corresponde
    public Cine recibirPosiblesEspectadores(Cine c, ArrayList<Espectador> interesados) {
        int rechazos = 0;
        int recibidos = 0;
        for (Espectador interesado : interesados) {
            if (interesado.getEdad() >= c.getPelicula().getEdadMinima() && interesado.getDineroDisponible() >= c.getPrecio() && c.getAsientosLibres().size() > 0) {
                //se le cobra al interesado
                interesado.setDineroDisponible(interesado.getDineroDisponible() - c.getPrecio());
                //selección de ubicación
                int posicionLista = (int) (Math.random() * c.getAsientosLibres().size());
                String ubicacion = c.getAsientosLibres().get(posicionLista);
                c.getAsientosLibres().remove(posicionLista);

                Asiento visual[][] = c.getSala();
                for (int i = 0; i < 8; i++) {
                    for (int j = 0; j < 6; j++) {
                        if (visual[i][j].getUbicacion().equalsIgnoreCase(ubicacion)) {
                            visual[i][j].setE(interesado);
                        }
                    }
                }
                recibidos++;

            } else {
                rechazos++;
            }
        }
        int recaudacion = recibidos * c.getPrecio();
        System.out.println("Espectadores recibidos: " + recibidos);
        System.out.println("Recaudación: " + recaudacion);
        System.out.println("Se rechazaron " + rechazos + " por no cumplir edad, no tener dinero o sala agotada");
        return c;
    }

    //Visualización
    public void verSala(Cine c) {
        System.out.println("");
        System.out.println("Película: " + c.getPelicula().getTitulo());
        System.out.println("Duración: " + c.getPelicula().getDuracionEnMinutos() + " minutos.");
        System.out.println("Estado de la sala durante la función:");
        Asiento visual[][] = c.getSala();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(visual[i][j].toString());
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public void revisarEspectador(Cine c) {
        Asiento visual[][] = c.getSala();
        int ctrol = 0;
        System.out.println("Seleccione una butaca para ver info del espectador:");
        String asientoABuscar = read.next();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                if (visual[i][j].getUbicacion().equalsIgnoreCase(asientoABuscar)) {
                    ctrol++;
                    System.out.println("Info del espectador ubicado en " + visual[i][j].getUbicacion());
                    System.out.println(visual[i][j].getE().toString());
                    break;
                }
            }
        }
        
        if (ctrol == 0) {
            System.out.println("Asiento no válido. Intente nuevamente");
            revisarEspectador(c);
        }
        System.out.println("¿Desea consultar otro asiento? s / n");
        String opcion = read.next();
        if (opcion.equalsIgnoreCase("s")) {
            revisarEspectador(c);
        }
    }

}

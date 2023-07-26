package mascotapp.servicios;

import java.util.ArrayList;
import java.util.Scanner;
import mascotapp.entidades.Mascota;

public class ServicioMascota {

    private Scanner leer;
    private ArrayList<Mascota> mascotas;

    public ServicioMascota() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.mascotas = new ArrayList();
    }

    public Mascota crearMascota() {

        System.out.println("Introducir nombre:");
        String nombre = leer.next();

        System.out.println("Introducir apodo:");
        String apodo = leer.next();

        System.out.println("Ingrese tipo:");
        String tipo = leer.next();

        return new Mascota(nombre, apodo, tipo);

    }

    public void agregarMascota(Mascota m) {
        mascotas.add(m);
    }

    public void mostrarMascotas() {

        System.out.println("Las mascotas actuales de la Lista Mascotas son: ");
        for (Mascota aux : mascotas) {
            System.out.println(aux.toString());
        }

        System.out.println("Cantidad = " + mascotas.size());
    }

    /**
     * Crea mascotas, TODOS iguales
     *
     * @param cantidad equivale a la cantidad de mascotas a crear y añadir a la
     * lista
     */
    public void fabricaMapus(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            mascotas.add(new Mascota("Sarah", "Mapu", "Perris"));
        }
    }

    /**
     * Crea mascotas pidiendo datos por teclado
     *
     * @param cantidad
     */
    public void fabricaMascota(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            Mascota mascotaCreada = crearMascota();
            agregarMascota(mascotaCreada);
            System.out.println(mascotaCreada.toString());
        }
    }

    //TODO añadir try and catch
    public void actualizarMascota(int index) {
        //un método
//        Mascota m = mascotas.get(index);
//        m.setApodo("nuevo apodo");

        //otro método
        if (index <= (mascotas.size() - 1)) {

            System.out.println("");
            System.out.println("------------Actualizar----------");
            Mascota m = crearMascota();

            mascotas.set(index, m);
        } else {
            System.out.println("Fallo al actualizar. El índice es erróneo");
        }

    }

    public void eliminarMascota(int index) {
        if (index <= (mascotas.size()-1)) {
            System.out.println("");
            System.out.println("----------Eliminar----------");
            mascotas.remove(index);
        } else {
            System.out.println("Fallo al eliminar. El índice es erróneo");
        }
        
    }
    
    public void eliminarMascotaPorNombre(String nombre){
        
        for (int i = 0; i < mascotas.size(); i++) {
            Mascota m = mascotas.get(i);
            
            if (m.getNombre().equals(nombre)) {
                mascotas.remove(m);
            }
        }
    }
    
    public void actualizaMascotaPorNombre(String nombreViejo, String nombreNuevo){
        
        for (int i = 0; i < mascotas.size(); i++) {
            Mascota m = mascotas.get(i);
            
            if (m.getNombre().equals(nombreViejo)) {
                m.setNombre(nombreNuevo);
            }
        }
    }
}

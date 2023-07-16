package Servicios;

import Entidades.Cliente;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClienteService {

    Cliente c1 = new Cliente();
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    static List<Cliente> listaClientes = new ArrayList<>();
    static int ID = 0;
//registrarCliente(): lo registra en el sistema.
    public void registrarCliente() {

        c1.setId(ID);
        ID++;
        System.out.print("Ingrese el nombre: ");
        c1.setNombre(read.next());

        System.out.print("Ingrese la edad: ");
        c1.setEdad(read.nextInt());
        System.out.print("Ingrese el peso: ");
        c1.setPeso(read.nextDouble());
        System.out.print("Ingrese la altura: ");
        c1.setAltura(read.nextDouble());
        System.out.print("Objetivo: ");
        c1.setObjetivo(read.next());

        listaClientes.add(c1);

    }

    public static void mostrar() {
        for (int i = 0; i < listaClientes.size(); i++) {
            System.out.println(listaClientes.get(i));
        }

    }

//obtenerClientes(): devuelve una lista con todos los clientes registrados en el sistema.
    public static List<Cliente> obtenerClientes() {
        return listaClientes;
    }

//actualizarCliente(int id, String nombre, int edad, double altura, double peso, String objetivo): recibe el identificador
//de un cliente existente y los nuevos datos del cliente, y actualiza la información correspondiente en el sistema.
    public void actualizarCliente(int id, String nombre, int edad, double peso, double altura, String objetivo) {
        // Modificar un elemento del ArrayList
        Cliente cAux = new Cliente(id, nombre, edad, altura, peso, objetivo);
        listaClientes.set(id, cAux);

    }

//eliminarCliente(int id): recibe el identificador de un cliente existente y lo elimina del sistema.
    public static void eliminarCliente(int id) {
        listaClientes.remove(id);
       
    }

   
}

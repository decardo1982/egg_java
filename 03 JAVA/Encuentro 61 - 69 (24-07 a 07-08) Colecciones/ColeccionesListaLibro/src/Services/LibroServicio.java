package Services;

import java.util.ArrayList;
import java.util.Scanner;

public class LibroServicio {
    
    ArrayList<String> libros = new ArrayList();
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    
    public void cargarLibros(){
        System.out.print("Ingrese la cantidad de libros a cargar: ");
        int cantidad = read.nextInt();
        System.out.println("");
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese el título Nº " + (i+1) + ": ");
            String titulo = read.next();
            libros.add(titulo);
        }
        
    }
    
    public void mostrarLista(){
        System.out.println("");
        System.out.println("Lista de libros:");
        System.out.println("----------------");
        for (String var : libros) {
            System.out.println(var);
        }
    }

}

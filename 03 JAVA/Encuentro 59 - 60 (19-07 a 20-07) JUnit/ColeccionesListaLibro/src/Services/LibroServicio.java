package Services;

import Entities.Libro;
import java.util.ArrayList;
import java.util.Scanner;

public class LibroServicio {
    
    private Scanner read;
    private ArrayList<Libro> libro;
    
    public LibroServicio(){
        this.read = new Scanner(System.in).useDelimiter("\n");
        this.libro = new ArrayList();
    }
    
    public Libro crearLibro(){
        System.out.println("Ingrese título del libro:");
        String titulo = read.next();
        System.out.println("Ingrese nombre del autor:");
        String autor = read.next();
        
        return new Libro(titulo, autor);
    }
    
}

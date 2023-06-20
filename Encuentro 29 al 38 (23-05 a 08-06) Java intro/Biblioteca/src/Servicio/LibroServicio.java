package Servicio;

import Entidades.Libro;
import java.util.Scanner;

public class LibroServicio {
    
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    
    public Libro altaLibro() {
        // instanciar un objeto de tipo libro
        
        Libro l1 = new Libro();
        
        //completar atributos
        
        System.out.print("Ingrese el número ISBN: ");
        l1.setISBN(read.nextInt());
        System.out.print("Ingrese el título del libro: ");
        l1.setTitulo(read.next());
        System.out.print("Ingrese el autor: ");
        l1.setAutor(read.next());
        System.out.print("Ingrese la cantidad de páginas: ");
        l1.setCantPaginas(read.nextInt());
        
        return l1;
    }
    
    

}

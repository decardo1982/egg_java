package biblioteca;

import Entidades.Libro;
import Servicio.LibroServicio;

public class Biblioteca {

    public static void main(String[] args) {
        
        LibroServicio ls = new LibroServicio();
        Libro l1 = ls.altaLibro();
        
        System.out.println(l1);

    }
    
}

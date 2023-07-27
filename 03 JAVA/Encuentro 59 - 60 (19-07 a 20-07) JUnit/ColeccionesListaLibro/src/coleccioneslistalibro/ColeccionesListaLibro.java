package coleccioneslistalibro;

import Services.LibroServicio;


public class ColeccionesListaLibro {

    public static void main(String[] args) {
        
        LibroServicio ls = new LibroServicio();
        
        ls.cargarLibros();
        ls.mostrarLista();

    }
    
}

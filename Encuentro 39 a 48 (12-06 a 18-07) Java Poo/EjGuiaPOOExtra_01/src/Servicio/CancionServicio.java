//1. Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́
//definir además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas
//vacías y otro que reciba como parámetros el titulo y el autor de la canción. Se deberán
//además definir los métodos getters y setters correspondientes.
package Servicio;

import Entidades.Cancion;
import java.util.Scanner;

public class CancionServicio {
    
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    
    Cancion temaiken = new Cancion();
    
    public Cancion crearCancion(){
        
        System.out.println("Ingrese el nombre de la canción:");
        temaiken.setTitulo(read.next());
        System.out.println("Ingrese el autor de la canción:");
        temaiken.setAutor(read.next());
        
        return temaiken;
    }
    
    public void mostrarCancion(){
        System.out.println(temaiken.toString());
    }
}

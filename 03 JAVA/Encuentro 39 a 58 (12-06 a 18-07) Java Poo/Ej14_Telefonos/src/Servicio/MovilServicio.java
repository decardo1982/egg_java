/*Una tienda que vende teléfonos móviles quiere tener registro de cada producto que
posee en un sistema computacional. Para ello, crearemos un programa donde se pueda
almacenar cada producto con su información. Crear una entidad Movil con los atributos
marca, precio, modelo, memoriaRam, almacenamiento y codigo. El atributo código será
un arreglo numérico de dimensión 7 (siete) donde cada subíndice alojará un número
correspondiente al código. A continuación, se implementarán los siguientes métodos:
 Un constructor por defecto.
 Un constructor con todos los atributos como parámetro.
 Métodos getters y setters de cada atributo.
 Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para
instanciar un objeto Celular y poder cargarlo en nuestro programa.
 Método ingresarCodigo(): este método permitirá ingresar el código completo de siete
números de un celular. Para ello, puede utilizarse un bucle repetitivo*/
package Servicio;

import Entidades.Movil;
import java.util.Scanner;

public class MovilServicio {
    
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    
    Movil celular = new Movil();
    
    public Movil cargarCelular(){
        
        System.out.println("Ingrese los datos del celular:");
        System.out.print("Marca: ");
        celular.setMarca(read.next());
        System.out.print("Precio: ");
        celular.setPrecio(read.nextDouble());
        System.out.print("Modelo: ");
        celular.setModelo(read.next());
        System.out.print("Memoria RAM: ");
        celular.setMemoriaRam(read.nextInt());
        System.out.print("Almacenamiento: ");
        celular.setAlmacenamiento(read.nextInt());
        System.out.print("Código: ");
        System.out.println("");
        cargarCodigo();
        
        return celular;
    }
    
    public int[] cargarCodigo(){
        System.out.println("Ingrese los 7 dígitos del código:");
        
        int[] codigoMovil = new int[7];
        for (int i = 0; i < 7; i++) {
            codigoMovil[i] = read.nextInt();
        }
        
        return codigoMovil;
    }
    
    public void mostrarCelular(){
        System.out.println(celular.toString());
        
    }
    
}

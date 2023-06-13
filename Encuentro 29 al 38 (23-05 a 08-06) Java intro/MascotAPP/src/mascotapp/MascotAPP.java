package mascotapp;

import java.util.Scanner;
import mascotapp.entidades.Mascota;

public class MascotAPP {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        Mascota m1 = new Mascota("Fernando Chiquit", leer.next(), "Perro");
        
        m1.setNombre("Pepe Chiquito");
      
        System.out.println(m1);
}

}

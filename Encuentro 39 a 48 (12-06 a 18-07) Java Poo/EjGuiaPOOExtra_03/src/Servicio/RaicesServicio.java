//3. Vamos a realizar una clase llamada Raices, donde representaremos los valores de una
//ecuación de 2o grado. Tendremos los 3 coeficientes como atributos, llamémosles a, b y c.
//Hay que insertar estos 3 valores para construir el objeto a través de un método
//constructor. Luego, las operaciones que se podrán realizar son las siguientes:
// Método getDiscriminante(): devuelve el valor del discriminante (double). El
//discriminante tiene la siguiente formula: (b^2)-4*a*c
// Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
//que esto ocurra, el discriminante debe ser mayor o igual que 0.
// Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
//que esto ocurra, el discriminante debe ser igual que 0.
// Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2
//posibles soluciones.
// Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz.
//Es en el caso en que se tenga una única solución posible.
// Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
//pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
//obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
//de no existir solución, se mostrará un mensaje.
//Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo delante de -b
package Servicio;

import Entidades.Raices;
import java.util.Scanner;

public class RaicesServicio {

    Scanner read = new Scanner(System.in).useDelimiter("\n");

    Raices valores = new Raices();

    public void cargarValores() {

        System.out.println("Ingresamos los valores de los 3 coeficientes:");
        System.out.print("a = ");
        valores.setA(read.nextInt());
        System.out.print("b = ");
        valores.setB(read.nextInt());
        System.out.print("c = ");
        valores.setC(read.nextInt());
        System.out.println("");
    }

// Método getDiscriminante(): devuelve el valor del discriminante (double). El
//discriminante tiene la siguiente formula: (b^2)-4*a*c
    public double getDiscriminante() {

        double discriminante = (Math.pow(valores.getB(), 2)) - 4 * valores.getA() * valores.getC();

        System.out.println("El discriminante es: " + discriminante);

        return discriminante;
    }

// Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
//que esto ocurra, el discriminante debe ser mayor o igual que 0.
    public boolean tieneRaices() {

        boolean dosSoluciones = false;

        if (getDiscriminante() >= 0) {
            dosSoluciones = true;
        }

        System.out.println("¿Tiene dos soluciones? " + dosSoluciones);

        return dosSoluciones;

    }
// Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
//que esto ocurra, el discriminante debe ser igual que 0.

    public boolean tieneRaiz() {
        boolean tieneRaiz = false;

        if (getDiscriminante() == 0) {
            tieneRaiz = true;
        }
        System.out.println("¿Tiene una única solución? " + tieneRaiz);

        return tieneRaiz;
    }

// Método obtenerRaices(): llama a tieneRaíces() y si devolvió true, imprime las 2
//posibles soluciones.
    public double obtenerRaices() {
        if (tieneRaices()) {
            System.out.println("Tiene raíces, entonces las calculamos:");
            double raiz1 = (-valores.getB() - Math.sqrt(getDiscriminante())) / 2 * valores.getA();
            double raiz2 = (-valores.getB() + Math.sqrt(getDiscriminante())) / 2 * valores.getA();
            System.out.println("Raiz 1 = " + raiz1);
            System.out.println("Raiz 2 = " + raiz2);
        } else {
            System.out.println("No se pueden obtener las raíces.");
        }
        
        return 0;
    }
}

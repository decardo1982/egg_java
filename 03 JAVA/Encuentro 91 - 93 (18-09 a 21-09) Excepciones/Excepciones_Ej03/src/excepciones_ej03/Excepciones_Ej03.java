/*Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
una división con los dos numeros y mostrar el resultado.*/

package excepciones_ej03;

import Entities.DivisionNumero;

public class Excepciones_Ej03 {

    public static void main(String[] args) {
        
        DivisionNumero dn = new DivisionNumero();
        
        dn.division();

    }
    
}

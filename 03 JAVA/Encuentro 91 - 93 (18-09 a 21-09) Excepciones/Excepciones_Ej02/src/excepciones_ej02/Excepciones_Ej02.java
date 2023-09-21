//Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
//generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
//de rango).
package excepciones_ej02;

public class Excepciones_Ej02 {

    public static void main(String[] args) {

        int[] vector = new int[5];

        try {
            for (int i = 0; i < 10; i++) {
                vector[i] = 1;
                System.out.println(i);
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ojo, te fuiste de vector!");
        }

    }

}

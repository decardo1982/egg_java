/*12. Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-
0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String. */
package javaintroejerciciosextra;

public class EjercicioExtra_12 {
    public static void main (String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    String digito1 = convertirDigito(i);
                    String digito2 = convertirDigito((j));
                    String digito3 = convertirDigito(k);
                    
                    System.out.println(digito1 + "-" + digito2 + "-" + digito3);
                }
            }
        }
    }
    public static String convertirDigito(int numero){
        if (numero == 3) {
            return "E";
        } else {
            return String.valueOf(numero);
        }
    }
    
}

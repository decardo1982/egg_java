/*
Create a function called shortcut to remove the lowercase vowels (a, e, i, o, u ) in a given string.
Examples
"hello"     -->  "hll"
"codewars"  -->  "cdwrs"
"goodbye"   -->  "gdby"
"HELLO"     -->  "HELLO"
don't worry about uppercase vowels
y is not considered a vowel for this kata
 */
package codewars;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class VowelRemover {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese palabra:");
        String palabra = read.next();

        int dimension = palabra.length();

        ArrayList<Character> arreglo = new ArrayList();

        for (int i = 0; i < dimension; i++) {
            char letra = palabra.charAt(i);
            if (letra != 'a' || letra != 'e' || letra != 'i' || letra != 'o' || letra != 'u') {
                arreglo.add(letra);
            }

        }
        System.out.println("Arreglo: " + arreglo);
    }

}

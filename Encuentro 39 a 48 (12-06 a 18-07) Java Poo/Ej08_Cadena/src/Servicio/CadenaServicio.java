package Servicio;

import Entidades.Cadena;
import java.util.Scanner;
import static java.util.stream.DoubleStream.builder;

public class CadenaServicio {

    Scanner read = new Scanner(System.in).useDelimiter("\n");

    Cadena frase = new Cadena();

    public Cadena crearFrase() {

        System.out.println("Ingrese una frase que puede ser una palabra o varias palabras separadas por un espacio en blanco:");
        frase.setFrase(read.next());
        frase.setLongitud(frase.getFrase().length());
        System.out.println("Longitud: " + frase.getLongitud());

        return frase;
    }

//    a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada
    public Cadena mostrarVocales() {
        int contadorVocales = 0;

        for (int i = 0; i < frase.getLongitud(); i++) {
            char caracter = frase.getFrase().toLowerCase().charAt(i);

            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                contadorVocales++;
            }
        }
        System.out.println("La frase contiene " + contadorVocales + " vocales.");

        return null;

    }
//    b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".

    public String invertirFrase() {
        String fraseInvertida = "";
        
        fraseInvertida = frase.getFrase();
        
        System.out.println("Frase invertida: " + fraseInvertida);
        return null;
        
    }

    /*    
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que compone la clase con otra nueva frase ingresada por el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con una nueva frase ingresada por el usuario y mostrar la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
la frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que ingresa el usuario y devuelve verdadero si la contiene y falso si no.
     */
}

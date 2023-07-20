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

//    a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada - ok
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
//    b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac". - ok

    public String invertirFrase() {
        String fraseInvertida = "";

        for (int i = frase.getLongitud() - 1; i >= 0; i--) {
            fraseInvertida = fraseInvertida + frase.getFrase().charAt(i);
//            System.out.println(frase.getFrase().charAt(i));
        }
        System.out.println("Frase invertida: " + fraseInvertida);
        return fraseInvertida;

    }

//c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
    public int vecesRepetido() {
        int veces = 0;
        System.out.print("Ingrese un caracter para contar cuántas veces figura en la frase ingresada: ");
        char caracter = read.next().charAt(0);
        for (int i = 0; i < frase.getLongitud(); i++) {
            if (caracter == frase.getFrase().charAt(i)) {
                veces++;
            }
        }
        System.out.print("El caracter aparece " + veces + " veces.");
        System.out.println("");
        return veces;

    }

//e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que compone la clase con otra nueva frase ingresada por el usuario.
    public boolean compararLongitud() {
        System.out.print("Ingrese una nueva frase para comparar las longitudes: ");
        String nuevaFrase = read.next();
        boolean longitudesIguales = false;
        if (frase.getLongitud() == nuevaFrase.length()) {
            longitudesIguales = true;
        }
        if (longitudesIguales) {
            System.out.println("Las frases tienen la misma longitud: " + frase.getLongitud() + " caracteres.");
        } else {
            System.out.println("Las frases no tienen la misma longitud.");
        }
        return longitudesIguales;
    }

//f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con una nueva frase ingresada por el usuario y mostrar la frase resultante.
    public String unirFrases() {
        System.out.print("Ingrese una nueva frase para sumar a la frase original: ");
        String fraseAUnir = read.next();
        String fraseUnida = frase.getFrase() + " " + fraseAUnir;
        frase.setFrase(fraseUnida);
        System.out.print("Nueva frase: " + frase.getFrase());
        System.out.println("");
        return fraseAUnir;
    }

//g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
//la frase resultante.
    public String reemplazandoAes() {
        System.out.print("Ingrese un caracter para reemplazar por las letras 'A' de la frase: ");
        char newCaracter = read.next().charAt(0);
        String newFrase = "";
        for (int i = 0; i < frase.getFrase().length(); i++) {
            if (frase.getFrase().charAt(i) == 'a' || frase.getFrase().charAt(i) == 'A') {
                newFrase = newFrase + newCaracter;
            } else {
                newFrase = newFrase + frase.getFrase().charAt(i);
            }
        }
        System.out.print("Nueva frase: " + newFrase);
        System.out.println("");
        return newFrase;
    }

//h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que ingresa el usuario y devuelve verdadero si la contiene y falso si no.
    public boolean contieneLetra() {
        System.out.print("Ingrese una letra para saber si está en la frase: ");
        char buscarCaracter = read.next().charAt(0);
        boolean contieneLetra = false;

        for (int i = 0; i < frase.getLongitud(); i++) {
            if (buscarCaracter == frase.getFrase().charAt(i)) {
                contieneLetra = true;
                break;
            }
        }

        if (contieneLetra) {
            System.out.println("La letra está en la frase.");

        } else {
            System.out.println("La letra no está en la frase.");
        }
        return contieneLetra;

    }

}

package codewars;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class colecciones {

    public static void main(String[] args) {
        //LISTAS
        ArrayList<Integer> numerosA = new ArrayList(); //Lista de tipo integer
        int x1 = 10;
        int x2 = 20;
        int x3 = 30;
        int x4 = 40;
        int x5 = 50;
        numerosA.add(x1);
        numerosA.add(x2);
        numerosA.add(x3);
        numerosA.add(x4);
        numerosA.add(x5);
        System.out.println("Mostrar LISTA");

        for (Integer integer : numerosA) {
            System.out.println(integer);
        }

        //CONJUNTOS
        HashSet<Integer> numerosB = new HashSet();
        Integer y1 = 10;
        Integer y2 = 20;
        Integer y3 = 30;
        Integer y4 = 40;
        Integer y5 = 50;
        numerosB.add(y1);
        numerosB.add(y2);
        numerosB.add(y3);
        numerosB.add(y4);
        numerosB.add(y5);
        System.out.println("Mostrar CONJUNTOS");
        for (Integer numero : numerosB) {
            System.out.println(numero);
        }
        

        //MAPAS
        HashMap<Integer, String> alumnos = new HashMap();
        int dni1 = 29414783;
        int dni2 = 12333444;
        int dni3 = 22444333;
        int dni4 = 28888222;
        int dni5 = 28333333;
        String nombre1 = "Dario";
        String nombre2 = "Mapu";
        String nombre3 = "Otto Motto";
        String nombre4 = "Godda";
        String nombre5 = "Quokka";
        alumnos.put(dni1, nombre1);
        alumnos.put(dni2, nombre2);
        alumnos.put(dni3, nombre3);
        alumnos.put(dni4, nombre4);
        alumnos.put(dni5, nombre5);
        System.out.println("Mostrar MAPAS");
        for (Map.Entry<Integer, String> entry : alumnos.entrySet()) {
            System.out.println("DNI: " + entry.getKey() + " Nombre: " + entry.getValue());
//            Integer key = entry.getKey();
//            String value = entry.getValue();
            
        }

    }

}

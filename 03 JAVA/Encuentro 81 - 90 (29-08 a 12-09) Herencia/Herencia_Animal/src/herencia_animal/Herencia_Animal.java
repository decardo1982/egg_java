package herencia_animal;

import java.util.ArrayList;

public class Herencia_Animal {

    public static void main(String[] args) {
        
        Animal a = new Animal();
        
        Animal b = new Perro();
        
        Animal c = new Gato();
        
        ArrayList<Animal> animales = new ArrayList<>();
        
        animales.add(a);
        animales.add(b);
        animales.add(c);
        
        for (Animal animalito : animales) {
            animalito.hacerRuido();
        }

    }
    
}

package herencia_animal;

public class Animal {

    public void hacerRuido() {
        System.out.println("Hola");
    }

}

class Perro extends Animal {

    @Override
    public void hacerRuido() {
        System.out.println("Ladrar");
    }
}

class Gato extends Animal {

    @Override
    public void hacerRuido() {
        System.out.println("Maullar");
    }
}

class Elefante extends Animal {
    
    @Override
    public void hacerRuido() {
        System.out.println("Barrita");
    }
}
package herencia_ej01;

import Entidades.Animal;
import Entidades.Caballo;
import Entidades.Gato;
import Entidades.Perro;

public class Herencia_Ej01 {

    public static void main(String[] args) {

        Animal perro1 = new Perro("Stich", "Carnivoro", 15, "Doberman");
        perro1.Alimentarse();

        Perro perro2 = new Perro("Teddy", "Croquetas", 10, "Chihuahua");
        perro2.Alimentarse();
        perro2.nombreAnimal();
        perro2.mostrar();
                
        Gato gato1 = new Gato("Pelusa", "Galletas", 15, "Siamés");
        gato1.Alimentarse();

        Animal caballo1 = new Caballo("Spark", "Pasto", 25, "Fino");
        caballo1.Alimentarse();

    }

}

package Entidades;

public class Perro extends Animal {

    public Perro(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    public Perro() {
    }

    public void mostrar() {
        System.out.println("nombre: " + nombre);
    }

}

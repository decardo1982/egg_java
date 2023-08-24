package Entities;

public class Persona {
    
    private String nombre;
    private Perro mascota;

    public Persona() {
    }

    public Persona(String nombre, Perro mascota) {
        this.nombre = nombre;
        this.mascota = mascota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Perro getMascota() {
        return mascota;
    }

    public void setMascota(Perro mascota) {
        this.mascota = mascota;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", mascota=" + mascota + '}';
    }
    
    

}

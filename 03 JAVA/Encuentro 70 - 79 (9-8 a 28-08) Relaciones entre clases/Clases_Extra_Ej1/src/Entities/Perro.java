package Entities;

public class Perro {
    
    private String nombre;
    private boolean adoptado;

    public Perro(String nombre, boolean adoptado) {
        this.nombre = nombre;
        this.adoptado = adoptado;
    }

    public Perro() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isAdoptado() {
        return adoptado;
    }

    public void setAdoptado(boolean adoptado) {
        this.adoptado = adoptado;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", adoptado=" + adoptado + '}';
    }
    
    

}

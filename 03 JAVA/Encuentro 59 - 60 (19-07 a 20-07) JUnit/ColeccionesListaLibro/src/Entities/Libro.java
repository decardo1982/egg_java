
package Entities;


public class Libro {
    
    private String nombre;
    
    private String titulo;

    public Libro() {
    }

    public Libro(String nombre, String titulo) {
        this.nombre = nombre;
        this.titulo = titulo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Libro{" + "nombre=" + nombre + ", titulo=" + titulo + '}';
    }
    
    
    
}

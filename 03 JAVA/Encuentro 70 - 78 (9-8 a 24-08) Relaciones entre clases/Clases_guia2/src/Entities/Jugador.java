
package Entities;


public class Jugador {
    
    private String nombre;
    private String apellido;
    private String position;
    private int numero;

    public Jugador() {
    }

    public Jugador(String nombre, String apellido, String position, int numero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.position = position;
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Jugador: {" + "\nnombre = " + nombre + ", \napellido = " + apellido + ", \nposicion = " + position + ", \nnumero = " + numero + "}\n";
    }
    
    
    
}

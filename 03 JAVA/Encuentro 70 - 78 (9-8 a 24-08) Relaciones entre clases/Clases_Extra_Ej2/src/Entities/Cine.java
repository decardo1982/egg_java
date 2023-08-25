package Entities;

import java.util.List;

public class Cine {
    
    private Pelicula pelicula;
    private Integer precio;
    private List<String> asientosLibres;
    private Asiento[][] sala;

    public Cine() {
    }

    public Cine(Pelicula pelicula, Integer precio, List<String> asientosLibres, Asiento[][] sala) {
        this.pelicula = pelicula;
        this.precio = precio;
        this.asientosLibres = asientosLibres;
        this.sala = sala;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public List<String> getAsientosLibres() {
        return asientosLibres;
    }

    public void setAsientosLibres(List<String> asientosLibres) {
        this.asientosLibres = asientosLibres;
    }

    public Asiento[][] getSala() {
        return sala;
    }

    public void setSala(Asiento[][] sala) {
        this.sala = sala;
    }

    @Override
    public String toString() {
        return "Cine{" + "pelicula=" + pelicula + ", precio=" + precio + ", asientosLibres=" + asientosLibres + ", sala=" + sala + '}';
    }
    
    
    
}

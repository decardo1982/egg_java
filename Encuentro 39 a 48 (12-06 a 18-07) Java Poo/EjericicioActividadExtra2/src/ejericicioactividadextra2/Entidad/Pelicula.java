/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejericicioactividadextra2.Entidad;


/**
 *
 * @author Daniel Atehortuua
 */
public class Pelicula {
    
    private String titulo;
    private String genero;
    private int año;
    private int duración;

    public Pelicula() {
    }

    public Pelicula(String titulo, String genero, int año, int duración) {
        this.titulo = titulo;
        this.genero = genero;
        this.año = año;
        this.duración = duración;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getDuración() {
        return duración;
    }

    public void setDuración(int duración) {
        this.duración = duración;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", genero=" + genero + ", a\u00f1o=" + año + ", duraci\u00f3n=" + duración + '}';
    }
    
    
}

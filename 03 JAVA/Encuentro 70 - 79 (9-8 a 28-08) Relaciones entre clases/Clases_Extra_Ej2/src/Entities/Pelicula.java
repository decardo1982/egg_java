package Entities;

public class Pelicula {
    
    private String titulo;
    private Integer duracionEnMinutos;
    private Integer edadMinima;
    private String director;

    public Pelicula() {
    }

    public Pelicula(String titulo, Integer duracionEnMinutos, Integer edadMinima, String director) {
        this.titulo = titulo;
        this.duracionEnMinutos = duracionEnMinutos;
        this.edadMinima = edadMinima;
        this.director = director;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public void setDuracionEnMinutos(Integer duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public Integer getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(Integer edadMinima) {
        this.edadMinima = edadMinima;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", duracionEnMinutos=" + duracionEnMinutos + ", edadMinima=" + edadMinima + ", director=" + director + '}';
    }
    
    
    
}

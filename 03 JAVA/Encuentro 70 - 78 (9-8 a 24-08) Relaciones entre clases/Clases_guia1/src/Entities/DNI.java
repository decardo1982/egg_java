package Entities;

public class DNI {
    
    private String serie;
    
    private Integer numero;

    public DNI(String serie, Integer numero) {
        this.serie = serie;
        this.numero = numero;
    }

    public DNI() {
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "DNI{" + "serie=" + serie + ", numero=" + numero + '}';
    }
    
    
    
}

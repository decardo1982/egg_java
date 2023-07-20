package Entidades;

public class Figura {
    
    private String tipo;
    
    private double radio;
    
    private double base;
    
    private double altura;
    
    private double apotema;

    public Figura() {
    }

    public Figura(String tipo, double radio, double base, double altura, double apotema) {
        this.tipo = tipo;
        this.radio = radio;
        this.base = base;
        this.altura = altura;
        this.apotema = apotema;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }
    
    
}

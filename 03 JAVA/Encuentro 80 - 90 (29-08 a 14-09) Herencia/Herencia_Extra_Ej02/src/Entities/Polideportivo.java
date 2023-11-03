package Entities;

public class Polideportivo extends Edificio {

    private boolean Techado;

    public Polideportivo() {
    }

    public Polideportivo(boolean Techado) {
        this.Techado = Techado;
    }

    public Polideportivo(boolean Techado, Double ancho, Double alto, Double largo) {
        super(ancho, alto, largo);
        this.Techado = Techado;
    }

    Polideportivo pd;

    @Override
    public void calcularSuperficie() {
        System.out.println("La superficie del polideportivo es " + (largo * ancho));
    }

    @Override
    public void calcularVolumen() {
        System.out.println("El volumen del polideportivo es " + (largo * ancho * alto));
    }

}

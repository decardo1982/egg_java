package Entities;

public class Circulo extends FiguraGeometrica {

    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    

    @Override
    public void calcularArea() {
        System.out.println("El área del círculo es " + Math.PI * radio * radio);
    }

    @Override
    public void calcularPerimetro() {
        System.out.println("El perímetro del círculo es " + Math.PI * radio * 2);
    }

}

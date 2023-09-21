package entidades;

public class Lavadora extends Electrodomestico<Lavadora> {

    private Double carga;

    public Lavadora() {
    }

    public Lavadora(Double precio, String color, Character consumoEnergetico, Double peso) {
        super(precio, color, consumoEnergetico, peso);
    }

    public Double getCarga() {
        return carga;
    }

    public void setCarga(Double carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return super.toString() + "carga=" + carga + " tipo = Lavadora" + '}';
    }
    
}

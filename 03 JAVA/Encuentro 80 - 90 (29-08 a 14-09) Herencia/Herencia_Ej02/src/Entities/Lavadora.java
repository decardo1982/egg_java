package Entities;

public class Lavadora extends Electrodomestico {

    private Integer carga;

    public Lavadora(Integer carga, Double precio, String color, Double peso, Character consumoEnergetico) {
        super(precio, color, peso, consumoEnergetico);
        this.carga = carga;
    }

    public Lavadora() {
    }

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }

}

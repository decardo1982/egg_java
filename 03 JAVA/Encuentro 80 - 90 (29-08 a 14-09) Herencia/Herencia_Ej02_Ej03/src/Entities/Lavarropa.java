package Entities;

import Enums.Color;
import Enums.ConsumoEnergetico;

public class Lavarropa extends Electrodomestico {

    private Integer carga;

    public Lavarropa() {
    }

    public Lavarropa(Integer carga) {
        this.carga = carga;
    }

    public Lavarropa(Integer carga, Double precio, Color color, Double peso, ConsumoEnergetico consumoEnergetico) {
        super(precio, color, peso, consumoEnergetico);
        this.carga = carga;
    }

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }
    
    


}

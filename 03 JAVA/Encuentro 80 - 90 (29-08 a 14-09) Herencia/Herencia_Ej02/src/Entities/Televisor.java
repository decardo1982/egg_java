package Entities;

import Enums.Color;
import Enums.ConsumoEnergetico;

public class Televisor extends Electrodomestico{
    
    private Integer resolucion;
    
    private boolean sintonizador;

    public Televisor() {
    }

    public Televisor(Integer resolucion, boolean sintonizador) {
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public Televisor(Integer resolucion, boolean sintonizador, Double precio, Color color, Double peso, ConsumoEnergetico consumoEnergetico) {
        super(precio, color, peso, consumoEnergetico);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public Integer getResolucion() {
        return resolucion;
    }

    public void setResolucion(Integer resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }
    
    
    
}

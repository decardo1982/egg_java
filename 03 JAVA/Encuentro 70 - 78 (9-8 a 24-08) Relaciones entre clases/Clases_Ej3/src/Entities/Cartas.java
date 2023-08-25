package Entities;

import Enums.Palos;

public class Cartas {

    private Integer numero;

    private Palos palo;

    public Cartas() {
    }

    public Cartas(Integer numero, Palos palo) {
        this.numero = numero;
        this.palo = palo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Palos getPalo() {
        return palo;
    }

    public void setPalo(Palos palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return "Carta {" + "numero " + numero + " de " + palo + '}';
    }

}

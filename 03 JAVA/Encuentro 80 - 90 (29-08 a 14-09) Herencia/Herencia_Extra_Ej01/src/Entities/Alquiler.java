package Entities;

public class Alquiler {
    
    protected Cliente cliente;
    protected Integer cantDias; //por ahora ingreso cantidad, luego desarrollar restar fechas
    protected Integer posicionAmarre;
    protected Barco barco;

    public Alquiler() {
    }

    public Alquiler(Cliente cliente, Integer cantDias, Integer posicionAmarre, Barco barco) {
        this.cliente = cliente;
        this.cantDias = cantDias;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Integer getCantDias() {
        return cantDias;
    }

    public void setCantDias(Integer cantDias) {
        this.cantDias = cantDias;
    }

    public Integer getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(Integer posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }
    
    
    
}

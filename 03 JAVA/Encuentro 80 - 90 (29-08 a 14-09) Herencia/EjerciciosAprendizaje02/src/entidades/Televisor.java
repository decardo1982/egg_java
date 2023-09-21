package entidades;

public class Televisor extends Electrodomestico<Televisor> {
    
    private Integer resolucion;
    private Boolean sintonizadorTdt;

    public Televisor() {
    }

    public Televisor(Double precio, String color, Character consumoEnergetico, Double peso) {
        super(precio, color, consumoEnergetico, peso);
    }

    public Integer getResolucion() {
        return resolucion;
    }

    public void setResolucion(Integer resolucion) {
        this.resolucion = resolucion;
    }

    public Boolean getSintonizadorTdt() {
        return sintonizadorTdt;
    }

    public void setSintonizadorTdt(Boolean sintonizadorTdt) {
        this.sintonizadorTdt = sintonizadorTdt;
    }

    @Override
    public String toString() {
        return super.toString() + "resolucion=" + resolucion + ", sintonizadorTdt=" + sintonizadorTdt + " tipo = Televisor" + '}';
    }
    
}

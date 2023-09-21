package enumeradores;

public enum ConsumoEnergetico {
    
    A(1, 'A', 1000.00), B(2, 'B', 800.00), C(3, 'C', 600.00), D(4, 'D', 500.00), E(5, 'E', 300.00), F(6, 'F', 100.00);
    
    private Integer opcion;
    private Character letra;
    private Double precio;

    private ConsumoEnergetico() {
    }

    private ConsumoEnergetico(Integer opcion, Character letra, Double precio) {
        this.opcion = opcion;
        this.letra = letra;
        this.precio = precio;
    }

    public Integer getOpcion() {
        return opcion;
    }

    public void setOpcion(Integer opcion) {
        this.opcion = opcion;
    }

    public Character getLetra() {
        return letra;
    }

    public void setLetra(Character letra) {
        this.letra = letra;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "ConsumoEnergetico{" + "opcion=" + opcion + ", letra=" + letra + ", precio=" + precio + '}';
    }

}

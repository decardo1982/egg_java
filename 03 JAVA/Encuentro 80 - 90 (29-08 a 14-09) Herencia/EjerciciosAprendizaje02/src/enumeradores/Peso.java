package enumeradores;

public enum Peso {
    
    OPCION_UNO(1, 19, 100.00), OPCION_DOS(20, 49, 500.00), OPCION_TRES(50, 79, 800.00), OPCION_CUATRO(80, 1000, 1000.00);
    
    private Integer pesoBase;
    private Integer pesoTope;
    private Double precio;

    private Peso() {
    }

    private Peso(Integer pesoBase, Integer pesoTope, Double precio) {
        this.pesoBase = pesoBase;
        this.pesoTope = pesoTope;
        this.precio = precio;
    }

    public Integer getPesoBase() {
        return pesoBase;
    }

    public void setPesoBase(Integer pesoBase) {
        this.pesoBase = pesoBase;
    }

    public Integer getPesoTope() {
        return pesoTope;
    }

    public void setPesoTope(Integer pesoTope) {
        this.pesoTope = pesoTope;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Peso{" + "pesoBase=" + pesoBase + ", pesoTope=" + pesoTope + ", precio=" + precio + '}';
    }
    
}

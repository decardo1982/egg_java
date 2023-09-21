package enumeradores;

public enum Color {
    
    BLANCO(1, "BLANCO"), NEGRO(2, "NEGRO"), ROJO(3, "ROJO"), AZUL(4, "AZUL"), GRIS(5, "GRIS");
    
    private Integer opcion;
    private String color;

    private Color() {
    }

    private Color(Integer opcion, String color) {
        this.opcion = opcion;
        this.color = color;
    }

    public Integer getOpcion() {
        return opcion;
    }

    public void setOpcion(Integer opcion) {
        this.opcion = opcion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Color{" + "opcion=" + opcion + ", color=" + color + '}';
    }
    
}

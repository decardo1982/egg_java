package junit_01.entities;

public class DiscountCalculator {
    
    private final double precioProducto = 100;
    
    private double descuento;

    public DiscountCalculator() {
    }

    public DiscountCalculator(double precioProducto, double descuento) {
        this.descuento = descuento;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
    
    
}

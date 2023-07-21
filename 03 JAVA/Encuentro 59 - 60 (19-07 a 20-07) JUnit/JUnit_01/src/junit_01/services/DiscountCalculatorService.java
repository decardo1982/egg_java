package junit_01.services;

import junit_01.entities.DiscountCalculator;

public class DiscountCalculatorService {

    DiscountCalculator Calcular;

    public double calcularDescuento() {
        System.out.println("Descuento 10%");
        Calcular.setDescuento(0.10);
        double aPagar = Calcular.getPrecioProducto() * Calcular.getDescuento();

        return aPagar;

    }

}

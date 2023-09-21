package servicios;

import entidades.Lavadora;

public class LavadoraServicio extends ElectrodomesticoServicio {
    
    /* ============================================================ */
    
    public Lavadora crearLavadora(Class claseRegistrada) {
        Lavadora lavadoraRegistrada = (Lavadora) super.crearElectrodomestico(claseRegistrada);
        Double carga = asignarCarga();
        lavadoraRegistrada.setCarga(carga);
        lavadoraRegistrada.setPrecio(lavadoraRegistrada.getPrecio() + calcularPrecioFinal(carga));
        return lavadoraRegistrada;
    }
    
    /* ============================================================ */
    
    /* METODOS CARGA */
    
    private Double asignarCarga() {
        System.out.print("Ingresar carga: ");
        Double cargaAsignada = input.nextDouble();
        
        return cargaAsignada;
    }
    
    /* ============================================================ */
    
    /* METODOS PRECIO FINAL */
    
    private Double calcularPrecioFinal(Double cargaRegistrada) {
        Double precioAsignado = 0.00;
        if (cargaRegistrada > 30) {
            precioAsignado = 500.00;
        }
        
        return precioAsignado;
    }
    
    /* ============================================================ */
}

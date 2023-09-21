package servicios;

import entidades.Televisor;

public class TelevisorServicio extends ElectrodomesticoServicio {
    
    /* ============================================================ */
    
    public Televisor crearTelevisor(Class claseRegistrada) {
        Televisor televisorRegistrado = (Televisor) super.crearElectrodomestico(claseRegistrada);
        Integer resolucion = asignarResolucion();
        Boolean sintonizadorTdt = asignarEstadoSintonizador();
        televisorRegistrado.setResolucion(resolucion);
        televisorRegistrado.setSintonizadorTdt(sintonizadorTdt);
        televisorRegistrado.setPrecio(televisorRegistrado.getPrecio() + calcularPrecioFinal(televisorRegistrado));
        return televisorRegistrado;
    }
    
    /* ============================================================ */
    
    /* METODOS CARGA */
    
    private Integer asignarResolucion() {
        System.out.print("Ingresar resolucion: ");
        Integer resolucionAsignada = input.nextInt();
        
        return resolucionAsignada;
    }
    
    /* ============================================================ */
    
    /* METODOS SINTONIZADOR */
    
    private Boolean asignarEstadoSintonizador() {
        System.out.println("1 - Contiene sintonizador");
        System.out.println("2 - No contiene sintonizador");
        System.out.print("Ingresar estado sintonizador: ");
        Integer opcionSeleccionada = input.nextInt();
        Boolean estadoSintonizador = verificarEstadoSintonizador(opcionSeleccionada);
        
        return estadoSintonizador;
    }
    
    protected Boolean verificarEstadoSintonizador(Integer opccionSeleccionada) {
        Boolean estadoSintonizador = false;
        if (opccionSeleccionada.equals(1)) {
            estadoSintonizador = true;
        }
        
        return estadoSintonizador;
    }
    
    /* ============================================================ */
    
    /* METODOS PRECIO FINAL */
    
    private Double calcularPrecioFinal(Televisor televisorRegistrado) {
        Double precioAsignado = 0.00;
        if (televisorRegistrado.getResolucion() > 40) {
            precioAsignado += televisorRegistrado.getPrecio() * 30 / 100;
        }
        if (televisorRegistrado.getSintonizadorTdt()) {
            precioAsignado += 500.00;
        }
        
        return precioAsignado;
    }
    
    /* ============================================================ */
}

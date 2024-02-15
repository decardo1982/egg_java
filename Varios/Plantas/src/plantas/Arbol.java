package plantas;

public class Arbol extends Planta {

    private String variedad;
    private String tipoDeTronco;
    private double radioTronco;
    private String color;
    private String tipoHojas;

    public Arbol() {
    }

    public Arbol(String variedad,
            String tipoDeTronco,
            double radioTronco,
            String color,
            String tipoHojas,
            String nombre,
            double altoTallo,
            boolean tieneHojas,
            String climaIdeal) {
        super(nombre, altoTallo, tieneHojas, climaIdeal);
        this.variedad = variedad;
        this.tipoDeTronco = tipoDeTronco;
        this.radioTronco = radioTronco;
        this.color = color;
        this.tipoHojas = tipoHojas;
    }

    public String getVariedad() {
        return variedad;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    public String getTipoDeTronco() {
        return tipoDeTronco;
    }

    public void setTipoDeTronco(String tipoDeTronco) {
        this.tipoDeTronco = tipoDeTronco;
    }

    public double getRadioTronco() {
        return radioTronco;
    }

    public void setRadioTronco(double radioTronco) {
        this.radioTronco = radioTronco;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipoHojas() {
        return tipoHojas;
    }

    public void setTipoHojas(String tipoHojas) {
        this.tipoHojas = tipoHojas;
    }

    @Override
    public void decirLoQueSoy() {

        System.out.println("Hola, soy un árbol");

    }

}

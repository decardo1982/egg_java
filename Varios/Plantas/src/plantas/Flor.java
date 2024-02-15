package plantas;

public class Flor extends Planta {

    private String colorPetalo;
    private double cantPromedioPetalos;
    private String colorPistilo;
    private String variedad;
    private String estacion;

    public Flor() {
    }

    public Flor(String colorPetalo, double cantPromedioPetalos, String colorPistilo, String variedadFlor, String estacionFlorecimiento, String nombre, double altoTallo, boolean tieneHojas, String climaIdeal) {
        super(nombre, altoTallo, tieneHojas, climaIdeal);
        this.colorPetalo = colorPetalo;
        this.cantPromedioPetalos = cantPromedioPetalos;
        this.colorPistilo = colorPistilo;
        this.variedad = variedadFlor;
        this.estacion = estacionFlorecimiento;
    }

    public String getColorPetalo() {
        return colorPetalo;
    }

    public void setColorPetalo(String colorPetalo) {
        this.colorPetalo = colorPetalo;
    }

    public double getCantPromedioPetalos() {
        return cantPromedioPetalos;
    }

    public void setCantPromedioPetalos(double cantPromedioPetalos) {
        this.cantPromedioPetalos = cantPromedioPetalos;
    }

    public String getColorPistilo() {
        return colorPistilo;
    }

    public void setColorPistilo(String colorPistilo) {
        this.colorPistilo = colorPistilo;
    }

    public String getVariedad() {
        return variedad;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    public String getEstacion() {
        return estacion;
    }

    public void setEstacion(String estacion) {
        this.estacion = estacion;
    }

    @Override
    public void decirLoQueSoy() {

        System.out.println("Hola, soy una flor");

    }

}

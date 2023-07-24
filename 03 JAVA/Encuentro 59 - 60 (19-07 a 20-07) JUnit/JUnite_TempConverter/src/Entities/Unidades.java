package Entities;

public class Unidades {
    
    private double celcius;
    
    private double kelvin;
    
    private double fahrenheit;

    public Unidades() {
    }

    public Unidades(double celcius, double kelvin, double fahrenheit) {
        this.celcius = celcius;
        this.kelvin = kelvin;
        this.fahrenheit = fahrenheit;
    }

    public double getCelcius() {
        return celcius;
    }

    public void setCelcius(double celcius) {
        this.celcius = celcius;
    }

    public double getKelvin() {
        return kelvin;
    }

    public void setKelvin(double kelvin) {
        this.kelvin = kelvin;
    }

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }
    
    
    
}

package Entidades;

public class Cuenta {
    
    private int numeroCuenta;
    
    private int numeroDNI;
    
    private int saldoActual;
    
    private double interes;

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, int numeroDNI, int saldoActual, double interes) {
        this.numeroCuenta = numeroCuenta;
        this.numeroDNI = numeroDNI;
        this.saldoActual = saldoActual;
        this.interes = interes;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getNumeroDNI() {
        return numeroDNI;
    }

    public void setNumeroDNI(int numeroDNI) {
        this.numeroDNI = numeroDNI;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numeroCuenta=" + numeroCuenta + ", numeroDNI=" + numeroDNI + ", saldoActual=" + saldoActual + ", interes=" + interes + '}';
    }
    
    
    
}

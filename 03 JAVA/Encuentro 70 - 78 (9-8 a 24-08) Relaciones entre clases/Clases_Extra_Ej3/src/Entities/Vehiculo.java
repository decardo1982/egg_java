package Entities;

import Enums.TipoVehiculo;

public class Vehiculo {

    private String marca;
    private String modelo;
    private Integer anio;
    private String motor;
    private String chasis;
    private String color;
    private TipoVehiculo tipo;
    private Poliza polizaSeguro;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, Integer anio, String motor, String chasis, String color, TipoVehiculo tipo, Poliza polizaSeguro) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.motor = motor;
        this.chasis = chasis;
        this.color = color;
        this.tipo = tipo;
        this.polizaSeguro = polizaSeguro;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public TipoVehiculo getTipo() {
        return tipo;
    }

    public void setTipo(TipoVehiculo tipo) {
        this.tipo = tipo;
    }

    public Poliza getPolizaSeguro() {
        return polizaSeguro;
    }

    public void setPolizaSeguro(Poliza polizaSeguro) {
        this.polizaSeguro = polizaSeguro;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + ", motor=" + motor + ", chasis=" + chasis + ", color=" + color + ", tipo=" + tipo + ", polizaSeguro=" + polizaSeguro + '}';
    }

}

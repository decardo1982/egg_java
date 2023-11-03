package Entities;

import java.util.Scanner;

public class EdificioDeOficinas extends Edificio {

    private Integer numOficinas;
    private Integer persPorOficina;
    private Integer pisos;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(Integer numOficinas, Integer persPorOficina, Integer pisos) {
        this.numOficinas = numOficinas;
        this.persPorOficina = persPorOficina;
        this.pisos = pisos;
    }

    public EdificioDeOficinas(Integer numOficinas, Integer persPorOficina, Integer pisos, Double ancho, Double alto, Double largo) {
        super(ancho, alto, largo);
        this.numOficinas = numOficinas;
        this.persPorOficina = persPorOficina;
        this.pisos = pisos;
    }

    EdificioDeOficinas office;
    Scanner read = new Scanner(System.in).useDelimiter("\n");

    @Override
    public void calcularSuperficie() {
        System.out.println("La superficie total es " + (largo * ancho * pisos));
    }

    @Override
    public void calcularVolumen() {
        System.out.println("El volumen total es " + (largo * ancho * pisos));
    }

    public void cantPersonas() {
        System.out.println("Ingrese la cantidad de personas por oficina:");
        persPorOficina = read.nextInt();
        System.out.println("Ingrese la cantidad de oficinas por piso:");
        numOficinas = read.nextInt();
        Integer personasTotal = persPorOficina * numOficinas * this.pisos;
        System.out.println("En el edificio pueden trabajar " + personasTotal + " personas.");
    }

    @Override
    public String toString() {
        return "EdificioDeOficinas{" + "numOficinas=" + numOficinas + ", persPorOficina=" + persPorOficina + ", pisos=" + pisos + ", office=" + office + ", read=" + read + '}';
    }

}

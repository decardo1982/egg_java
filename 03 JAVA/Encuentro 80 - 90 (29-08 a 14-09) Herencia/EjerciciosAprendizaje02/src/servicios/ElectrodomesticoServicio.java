package servicios;

import entidades.Electrodomestico;
import enumeradores.Color;
import enumeradores.ConsumoEnergetico;
import enumeradores.Peso;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;
import java.util.Scanner;

public class ElectrodomesticoServicio <T extends Electrodomestico> {
    
    protected Scanner input = new Scanner(System.in);
    
    /* ============================================================ */
    
    public T crearElectrodomestico(Class<T> claseRegistrada) {
        try {
            Constructor<T> constructor = claseRegistrada.getConstructor(Double.class, String.class, Character.class, Double.class);
            String color = asignarColor();
            Character consumoEnergetico = asignarConsumoEnergetico();
            Double peso = asignarPeso();
            Double precio = calcularPrecioFinal(consumoEnergetico, peso);
            return constructor.newInstance(precio, color, consumoEnergetico, peso);
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    /* ============================================================ */
    
    /* METODOS COLOR */
    
    protected String asignarColor() {
        System.out.println("' Asignar color '");
        for (Color color : Color.values()) {
            System.out.println("OPCION " + color.getOpcion() + ": " + color.getColor());
        }
        System.out.print("Ingresar opcion seleccionada: ");
        Integer opccionSeleccionada = input.nextInt();
        String colorAsignado = verificarColor(opccionSeleccionada);
        
        return colorAsignado;
    }

    protected String verificarColor(Integer opccionSeleccionada) {
        String colorAsignado = null;
        for (Color color : Color.values()) {
            if (opccionSeleccionada.equals(color.getOpcion())) {
                colorAsignado = color.getColor();
                break;
            }
        }
        
        return colorAsignado;
    }
    
    /* ============================================================ */
    
    /* METODOS CONSUMO */
    
    protected Character asignarConsumoEnergetico() {
        System.out.println("' Asignar consumo '");
        for (ConsumoEnergetico consumoEnergetico : ConsumoEnergetico.values()) {
            System.out.println("OPCION " + consumoEnergetico.getOpcion() + ": " + consumoEnergetico.getLetra());
        }
        System.out.print("Ingresar opcion seleccionada: ");
        Integer opccionSeleccionada = input.nextInt();
        Character consumoEnergeticoAsignado = verificarConsumoEnergetico(opccionSeleccionada);
        
        return consumoEnergeticoAsignado;
    }

    protected Character verificarConsumoEnergetico(Integer opccionSeleccionada) {
        Character consumoEnergeticoAsignado = null;
        for (ConsumoEnergetico consumoEnergetico : ConsumoEnergetico.values()) {
            if (opccionSeleccionada.equals(consumoEnergetico.getOpcion())) {
                consumoEnergeticoAsignado = consumoEnergetico.getLetra();
                break;
            }
        }
        
        return consumoEnergeticoAsignado;
    }
    
    /* ============================================================ */
    
    /* METODOS PESO */
    
    protected Double asignarPeso() {
        System.out.print("Ingresar peso: ");
        Double pesoAsignado = input.nextDouble();
        
        return pesoAsignado;
    }
    
    /* ============================================================ */
    
    /* METODOS PRECIO FINAL */
    
    protected Double calcularPrecioFinal(Character consumoEnergeticoRegistrado, Double pesoRegistrado) {
        Double precioAsignado = 1000.00;
        for (ConsumoEnergetico consumoEnergetico : ConsumoEnergetico.values()) {
            if (Objects.equals(consumoEnergeticoRegistrado, consumoEnergetico.getLetra())) {
                precioAsignado += consumoEnergetico.getPrecio();
                break;
            }
        }
        
        for (Peso peso : Peso.values()) {
            if (pesoRegistrado >= peso.getPesoBase() && pesoRegistrado <= peso.getPesoTope()) {
                precioAsignado += peso.getPrecio();
                break;
            }
        }
        
        return precioAsignado;
    }
    
    /* ============================================================ */
    
}

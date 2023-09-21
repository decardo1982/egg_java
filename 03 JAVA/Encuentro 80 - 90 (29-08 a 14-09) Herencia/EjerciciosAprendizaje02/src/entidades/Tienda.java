package entidades;

import java.util.ArrayList;

public class Tienda {
    
    private String localidad;
    private ArrayList <Electrodomestico> listaElectrodomesticos;

    public Tienda() {
    }

    public Tienda(String localidad) {
        setLocalidad(localidad);
        this.listaElectrodomesticos = new ArrayList<>();
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public ArrayList<Electrodomestico> getListaElectrodomesticos() {
        return listaElectrodomesticos;
    }

    public void setListaElectrodomesticos(ArrayList<Electrodomestico> listaElectrodomesticos) {
        this.listaElectrodomesticos = listaElectrodomesticos;
    }

    @Override
    public String toString() {
        return "Tienda{" + "localidad=" + localidad + ", listaElectrodomesticos=" + listaElectrodomesticos + '}';
    }
    
}

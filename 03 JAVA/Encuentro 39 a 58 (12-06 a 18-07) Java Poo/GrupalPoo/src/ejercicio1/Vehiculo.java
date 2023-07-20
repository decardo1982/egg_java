package ejercicio1;

public class Vehiculo {

    private String marca;
    private String modelo;
    private int anio;
    private String tipo;

    private int distancia;
    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, int anio, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.tipo = tipo;
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

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    public void moverse(int segundos){

        if (this.tipo.equals("automovil")){
            distancia = 3 * segundos;
        } else if (this.tipo.equals("motocicleta")){
            distancia = 2 * segundos;
        } else{
            distancia = 1 * segundos;
        }
    }

    public void frenar(){
        if ((this.tipo.equals("automovil")||(this.tipo.equals("motocicleta")))){
            distancia = distancia + 2;
        }

        System.out.println(this.tipo + ": recorrió " + distancia + " metros.");
    }
}

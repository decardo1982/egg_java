/*
Número de mástiles para veleros.
 */
package Entidades;

public class Velero extends Barco{
    private Integer mastiles;

    public Velero() {
    }

    public Velero(Integer mastiles, String matricula, Integer eslora, Integer anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.mastiles = mastiles;
    }

    public Integer getMastiles() {
        return mastiles;
    }

    public void setMastiles(Integer mastiles) {
        this.mastiles = mastiles;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Integer getEslora() {
        return eslora;
    }

    public void setEslora(Integer eslora) {
        this.eslora = eslora;
    }

    public Integer getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(Integer anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    @Override
    public String toString() {
        return "Velero{" + "mastiles=" + mastiles + '}';
    }
    
}

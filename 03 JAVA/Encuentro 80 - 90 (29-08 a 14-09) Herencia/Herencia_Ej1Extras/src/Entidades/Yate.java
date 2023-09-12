/*
Potencia en CV y número de camarotes para yates de lujo.
 */
package Entidades;

public class Yate extends Motor{
    private Integer camarotes;

    public Yate() {
    }

    public Yate(Integer camarotes, Integer potencia, String matricula, Integer eslora, Integer anioFabricacion) {
        super(potencia, matricula, eslora, anioFabricacion);
        this.camarotes = camarotes;
    }

    public Integer getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(Integer camarotes) {
        this.camarotes = camarotes;
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
        return "Yate{" + "camarotes=" + camarotes + '}';
    }
    
}

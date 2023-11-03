package Entities;

public class Velero extends Barco{
    
    protected Integer cantMastiles;

    public Velero() {
    }

    public Velero(Integer cantMastiles) {
        this.cantMastiles = cantMastiles;
    }

    public Velero(Integer cantMastiles, String matricula, Integer eslora, Integer anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.cantMastiles = cantMastiles;
    }
    
    @Override
    public Integer valorModulo(){
        Integer valorModulo = (eslora * 10) + cantMastiles;
        return valorModulo;
    }
    
}

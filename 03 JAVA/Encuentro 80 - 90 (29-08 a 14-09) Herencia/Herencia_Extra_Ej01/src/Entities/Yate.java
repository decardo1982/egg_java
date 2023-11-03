package Entities;

public class Yate extends aMotor{
    
    protected Integer cantCamarotes;

    public Yate() {
    }

    public Yate(Integer cantCamarotes) {
        this.cantCamarotes = cantCamarotes;
    }

    public Yate(Integer cantCamarotes, Integer potencia) {
        super(potencia);
        this.cantCamarotes = cantCamarotes;
    }

    public Yate(Integer cantCamarotes, Integer potencia, String matricula, Integer eslora, Integer anioFabricacion) {
        super(potencia, matricula, eslora, anioFabricacion);
        this.cantCamarotes = cantCamarotes;
    }
     @Override
    public Integer valorModulo(){
        Integer valorModulo = (eslora * 10) + potencia + cantCamarotes;
        return valorModulo;
    }
    
}

package Entities;

public class aMotor extends Barco{
    
    protected Integer potencia;

    public aMotor() {
    }

    public aMotor(Integer potencia) {
        this.potencia = potencia;
    }

    public aMotor(Integer potencia, String matricula, Integer eslora, Integer anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.potencia = potencia;
    }
     @Override
    public Integer valorModulo(){
        Integer valorModulo = (eslora * 10) + potencia;
        return valorModulo;
    }
    
}

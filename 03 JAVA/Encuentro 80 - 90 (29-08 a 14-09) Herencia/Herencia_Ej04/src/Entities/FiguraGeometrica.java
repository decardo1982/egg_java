package Entities;

public abstract class FiguraGeometrica {
    
    protected Double area;
    protected Double perimetro;
    
    public abstract void calcularArea();
    
    public abstract void calcularPerimetro();

    public FiguraGeometrica(Double area, Double perimetro) {
        this.area = area;
        this.perimetro = perimetro;
    }

    public FiguraGeometrica() {
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(Double perimetro) {
        this.perimetro = perimetro;
    }
    
    
    
}

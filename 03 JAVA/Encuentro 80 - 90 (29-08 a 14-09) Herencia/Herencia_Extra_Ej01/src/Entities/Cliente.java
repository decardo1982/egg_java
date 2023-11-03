package Entities;

public class Cliente {
    
    protected String nombre;
    protected Integer documento;

    public Cliente() {
    }

    public Cliente(String nombre, Integer documento) {
        this.nombre = nombre;
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDocumento() {
        return documento;
    }

    public void setDocumento(Integer documento) {
        this.documento = documento;
    }
    
    
    
}


package mascotapp.entidades;

import java.util.Date;
import java.util.List;

public class Usuario {
    
    public String nombre;
    public String apellido;
    public int dni;
    public Date nacimiento;
    public String pais;
    
//    private List<Mascota> mascota;

    public Usuario(){
        
    }

    public Usuario(String nombre, String apellido, int dni, Date nacimiento, String pais) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.nacimiento = nacimiento;
        this.pais = pais;
    }
    
    
}

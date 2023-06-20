package ej05_cuenta;

import Entidades.Cuenta;
import Servicio.CuentaServicio;

public class Ej05_Cuenta {


    public static void main(String[] args) {
        
        CuentaServicio cs = new CuentaServicio();
        Cuenta prueba1 = cs.crearCuenta();
        
        cs.ingresarSaldo(prueba1);
        
        cs.retirarSaldo(prueba1);
        
        cs.extraccionRapida(prueba1);
        
        cs.consultarSaldo(prueba1);
        
        cs.consultarDatos(prueba1);

    }
    
}

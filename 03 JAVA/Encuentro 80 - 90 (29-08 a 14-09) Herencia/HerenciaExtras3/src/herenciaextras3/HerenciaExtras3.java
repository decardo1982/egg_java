/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaextras3;

import Entidades.Profesor;

/**
 *
 * @author EXT84172
 */
public class HerenciaExtras3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Profesor profesor = new Profesor();
        profesor.crearProfesor();
        System.out.println(profesor);
        profesor.cambioDepartamento();
        System.out.println(profesor);
    }
    
}

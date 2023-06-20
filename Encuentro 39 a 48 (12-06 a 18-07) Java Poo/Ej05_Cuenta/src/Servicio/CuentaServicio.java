package Servicio;

import Entidades.Cuenta;
import java.util.Scanner;

public class CuentaServicio {

    Scanner read = new Scanner(System.in).useDelimiter("\n");

    public Cuenta crearCuenta() {

        Cuenta cuenta = new Cuenta();

        System.out.print("Ingrese el DNI del cliente: ");
        cuenta.setNumeroDNI(read.nextInt());
        System.out.print("Ingrese el número de cuenta: ");
        cuenta.setNumeroCuenta(read.nextInt());
        System.out.print("Ingrese el saldo de la cuenta: ");
        cuenta.setSaldoActual(read.nextInt());
        System.out.println("Ingrese el interés: ");
        cuenta.setInteres(read.nextDouble());

        return cuenta;
    }

    public double ingresarSaldo(Cuenta cuenta) {
        System.out.print("El saldo actual es $" + cuenta.getSaldoActual() + " , Ingrese el monto a sumar a la cuenta: ");
        double saldoASumar = read.nextDouble();
        int saldoActualizado = (int) (cuenta.getSaldoActual()+ saldoASumar);
        cuenta.setSaldoActual(saldoActualizado);
        System.out.println("El saldo actual ahora es $" + cuenta.getSaldoActual());
        return cuenta.getSaldoActual();
    }

    public double retirarSaldo(Cuenta cuenta) {
        System.out.print("El saldo actual es $" + cuenta.getSaldoActual() + " , Ingrese el monto a retirar de la cuenta: ");
        double saldoARestar = read.nextDouble();
        int saldoActualizado = (int) (cuenta.getSaldoActual()- saldoARestar);
        cuenta.setSaldoActual(saldoActualizado);
        System.out.println("El saldo actual ahora es $" + cuenta.getSaldoActual());
        return cuenta.getSaldoActual();
    }

    public double extraccionRapida(Cuenta cuenta) {
        System.out.println("El saldo actual es $" + cuenta.getSaldoActual() + " y se le permitirá extrar hasta un 20% del saldo de su cuenta.");
        System.out.print("Ingrese monto a retirar: ");
        int montoRapido = read.nextInt();

        if (montoRapido > (cuenta.getSaldoActual() * 0.2)) {
            System.out.println("El monto ingresado es mayor al 20% del saldo de la cuenta. Operación denegada.");
        } else {
            int saldoActualizado = (int) (cuenta.getSaldoActual() - montoRapido);
            cuenta.setSaldoActual(saldoActualizado);
            System.out.println("Se autorizó la operación. El saldo actual es: " + cuenta.getSaldoActual());
        }
        return cuenta.getSaldoActual();
    }

    public void consultarSaldo(Cuenta cuenta) {
        System.out.print("El saldo actual es $" + cuenta.getSaldoActual());
    }

    public String consultarDatos(Cuenta cuenta) {
        
        System.out.println("");
        System.out.println("Datos de la cuenta:" + cuenta.toString());
        return null;
    }
}

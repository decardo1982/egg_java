
package tutoria.nombreproyecto;
        import java.util.Scanner;

public class NombreProyecto {

    public static void main(String[] args) {
        

        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        boolean salir = false;

        while (!salir) {
            System.out.println("---- Calculadora ----");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Consultar resultado");
            System.out.println("0. Salir");
            System.out.print("Ingrese una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    double num1 = calculadora.ingresarNumero();
                    double num2 = calculadora.ingresarNumero();
                    calculadora.sumar(num1, num2);
                    System.out.println("El resultado de la suma es: " + calculadora.getResultado());
                    break;
                case 2:
                    num1 = calculadora.ingresarNumero();
                    num2 = calculadora.ingresarNumero();
                    calculadora.restar(num1, num2);
                    System.out.println("El resultado de la resta es: " + calculadora.getResultado());
                    break;
                case 3:
                    num1 = calculadora.ingresarNumero();
                    num2 = calculadora.ingresarNumero();
                    calculadora.multiplicar(num1, num2);
                    System.out.println("El resultado de la multiplicación es: " + calculadora.getResultado());
                    break;
                case 4:
                    num1 = calculadora.ingresarNumero();
                    num2 = calculadora.ingresarNumero();
                    calculadora.dividir(num1, num2);
                    System.out.println("El resultado de la división es: " + calculadora.getResultado());
                    break;
                case 5:
                    calculadora.consultarResultado();
                    break;
                case 0:
                    salir = true;
                    System.out.println("Saliendo de la calculadora...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese un número válido.");
                    break;
            }
        }
    }
}


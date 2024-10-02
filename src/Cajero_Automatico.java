import java.util.Scanner;

public class Cajero_Automatico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldo = 1000.0;

        boolean salir = false;

        while (!salir) {
            System.out.println("\nMenú principal:");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Retirar efectivo");
            System.out.println("3. Depositar efectivo");
            System.out.println("4. Salir");

            System.out.print("Ingrese su opción: ");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Su saldo actual es: $" + saldo);
                    break;
                case 2:
                    System.out.print("Ingrese el monto a retirar: $");
                    double montoRetiro = sc.nextDouble();

                    if (montoRetiro <= saldo && montoRetiro > 0) {
                        saldo -= montoRetiro;
                        System.out.println("Retiro realizado con éxito. Su nuevo saldo es: $" + saldo);
                    } else {
                        System.out.println("Error: El monto a retirar es inválido o supera su saldo disponible.");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese el monto a depositar: $");
                    double montoDeposito = sc.nextDouble();

                    if (montoDeposito > 0) {
                        saldo += montoDeposito;
                        System.out.println("Depósito realizado con éxito. Su nuevo saldo es: $" + saldo);
                    } else {
                        System.out.println("Error: El monto a depositar es inválido.");
                    }
                    break;
                case 4:
                    System.out.println("Saliendo del cajero automático...");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }

        System.out.println("¡Gracias por usar el cajero automático!");
    }
}

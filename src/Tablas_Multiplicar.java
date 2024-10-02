import java.util.Scanner;

public class Tablas_Multiplicar {
    
    public static void main(String[] args) {

    Scanner scanner= new Scanner(System.in);
    System.out.println("Introduce un número para ver su tabla de multiplicar: ");
    int number = scanner.nextInt();

    for (int i = 1; i <= 10; i++) {
        System.out.println(number + " x " + i + " = " + (number * i));
    }

    scanner.close();
    }
}

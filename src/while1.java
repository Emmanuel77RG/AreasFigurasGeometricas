public class while1 {
    public static void main(String[] args) {

        int[] numeros = { 45, 55, 65, 150, 120 };
        
        int i = 0;
        while (i < numeros.length) {
            if (numeros[i] > 100) {
                System.out.println("El primer número mayor a 100 está en el índice: " + i);
                break; // Termina el bucle al encontrar el primer número mayor a 100
            }
            i++;
        }
    }
}

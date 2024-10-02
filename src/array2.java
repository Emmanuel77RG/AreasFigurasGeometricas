public class array2 {
    public static void main(String[] args) {
        int[] numeros = { 10, 20, 30, 40, 50 };
        int objetivo = 30;
        boolean encontrado = false;

        // Buscar un elemento en el array
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == objetivo) {
                encontrado = true;
                System.out.println("Elemento " + objetivo + " encontrado en la posición " + i);
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Elemento " + objetivo + " no encontrado en el array.");
        }
    }
}

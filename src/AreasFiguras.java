import java.util.Scanner;

public class AreasFiguras {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        

        @SuppressWarnings("resource")
        Scanner entrada = new Scanner(System.in);

        //area cuadrado
        double lado;
        System.out.println("Área del Cuadrado");
        System.out.println("Digita el valor del lado");
        lado=entrada.nextDouble();
        double área = lado*lado;
        System.out.println("El área del Cuadrado es: "+área+"\n\n");

    //El área del Cuadrado es: 15

    
    //Área del Circulo

        //area circulo
        double radio;
            System.out.println("Área del Circulo");
            System.out.println("Digita el valor del radio");
            radio=entrada.nextDouble();
            área= Math.PI*(radio*radio);
            System.out.println("El área del Circulo es: "+área+"\n\n");
            
        //area triangulo
            double base, altura;
            System.out.println("Área del Triángulo");
            System.out.println("Digita el valor de la base");
            base=entrada.nextDouble();
            System.out.println("Digita el valor de la altura");
            altura=entrada.nextDouble();
            área= (base*altura)/2;
            System.out.println("El área del Triángulo es: "+área+"\n\n");


        //area rectangulo
        double baserec,alturarec;
            System.out.println("Área del Rectangulo");
            System.out.println("Digita el valor de la base");
            baserec=entrada.nextDouble();
            System.out.println("Digita el valor de la altura");
            alturarec=entrada.nextDouble();
            área= baserec*alturarec;
            System.out.println("El área del Rectangulo es: "+área+"\n\n");

        //area esfera
        double radesfera;
            System.out.println("Área de la Esfera");
            System.out.println("Digita el valor del radio");
            radesfera =entrada.nextDouble();
            área=(4*Math.PI*(radesfera*radesfera));
            System.out.println("El área de la Esfera es: "+área+"\n\n");

        //area cubo
        double LadoCubo;
            System.out.println("Área del Cubo");
            System.out.println("Digita el valor del lado");
            LadoCubo =entrada.nextDouble();
            área=(6*(LadoCubo*LadoCubo));
            System.out.println("El área del Cubo es: "+área+"\n\n");

    }
}

import java.util.Scanner;

public class AreasFigurasSWITCH {
    
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        
        double lado,area,radio; //<--------- declaración de varaiables
        boolean bandera =true;
        
        Scanner entrada = new Scanner(System.in);
        
        
        do {
        
            System.out.println("1.- área Cuadrado");
            System.out.println("2.- área Círculo");
            System.out.println("3.- área Triángulo");
            System.out.println("4.- área Rectángulo");
            System.out.println("5.- área Esfera");
            System.out.println("5.- área Cubo");
            System.out.println("7.- SALIR");
    
            System.out.println("Ingrese la opcion de la área a realizar");
            int  menu= entrada.nextInt();
    
            switch (menu) { //<---------- VERIFICACIÓN E INICIO DEL SWITCH
    
                case 1:
    
                    System.out.println("Ingresa el valor del lado del Cuadrado");
                    lado = entrada.nextInt();
                    area= lado*lado;
                    System.out.println("El área del Cudrado es: "+area+"\n\n");
                break;
            
                case 2:
    
                    System.out.println("Área del Circulo");
                    System.out.println("Digita el valor del radio");
                    radio=entrada.nextDouble();
                    area= Math.PI*(radio*radio);
                    System.out.println("El área del Circulo es: "+area+"\n\n");
                break;
    
                case 3:
                    double base, altura;
                    System.out.println("Área del Triángulo");
                    System.out.println("Digita el valor de la base");
                    base=entrada.nextDouble();
                    System.out.println("Digita el valor de la altura");
                    altura=entrada.nextDouble();
                    area= (base*altura)/2;
                    System.out.println("El área del Triángulo es: "+area+"\n\n");
                break;
    
                case 4:
                    double baserec,alturarec;
                    System.out.println("Área del Rectángulo");
                    System.out.println("Digita el valor de la base");
                    baserec=entrada.nextDouble();
                    System.out.println("Digita el valor de la altura");
                    alturarec=entrada.nextDouble();
                    area= baserec*alturarec;
                    System.out.println("El área del Rectangulo es: "+area+"\n\n");
                break;
    
                case 5:
                    double radesfera;
                    System.out.println("Área de la Esfera");
                    System.out.println("Digita el valor del radio");
                    radesfera =entrada.nextDouble();
                    area=(4*Math.PI*(radesfera*radesfera));
                    System.out.println("El área de la Esfera es: "+area+"\n\n");
                    break;
    
                case 6:
                    double LadoCubo;
                    System.out.println("Área del Cubo");
                    System.out.println("Digita el valor del lado");
                    LadoCubo =entrada.nextDouble();
                    area=(6*(LadoCubo*LadoCubo));
                    System.out.println("El área del Cubo es: "+area+"\n\n");
                break;
    
                case 7:
                bandera=false;
                break;
            } //<---------- FINAL DEL SWITCH
            } while (bandera != false);
    }

}

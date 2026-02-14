import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int opcion = -1;   
        bienvenida();
        do{
            System.out.println("Seleccione una operación:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Contar números pares en un rango");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el primer número: ");
                    double a1 = sc.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    double b1 = sc.nextDouble();
                    double resultadoSuma = sumar(a1, b1);
                    imprimirResultado("suma", resultadoSuma);
                    break;
                case 2:
                    System.out.print("Ingrese el primer número: ");
                    double a2 = sc.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    double b2 = sc.nextDouble();
                    double resultadoResta = restar(a2, b2);
                    imprimirResultado("resta", resultadoResta);
                    break;
                case 3:
                    System.out.print("Ingrese el primer número: ");
                    double a3 = sc.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    double b3 = sc.nextDouble();
                    double resultadoMultiplicacion = multiplicar(a3, b3);
                    imprimirResultado("multiplicación", resultadoMultiplicacion);
                    break;
                case 4:
                    System.out.print("Ingrese el primer número: ");
                    double a4 = sc.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    double b4 = sc.nextDouble();
                    double resultadoDivision = dividir(a4, b4);
                    imprimirResultado("división", resultadoDivision);
                    break;
                case 5:
                    System.out.print("Ingrese el número inicial del rango: ");
                    int inicio = sc.nextInt();
                    System.out.print("Ingrese el número final del rango: ");
                    int fin = sc.nextInt();
                    System.out.println("Números pares en el rango:");
                    contarPares(inicio, fin);
                    break;
                case 0:
                    System.out.println("¡Gracias por usar la calculadora! ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor");
                    break;
            }
        }while(opcion != 0);
        
    }

    static void bienvenida() {
        System.out.println("---¡Bienvenido a la Calculadora!---");
        System.out.println();
    }

    static void imprimirResultado(String operacion, double resultado) {
        System.out.printf("Resultado de %s: %.2f%n", operacion, resultado);
    }

    static double sumar(double a, double b) {
        double resultadoSuma = a + b;
        return resultadoSuma ;
    }
    static double restar(double a, double b) {
        double resultadoResta = a - b;
        return resultadoResta ;
    }

    static double multiplicar(double a, double b) {
        double resultadoMultiplicacion = a * b;
        return resultadoMultiplicacion ;
    }

    static double dividir(double a, double b) {
        if(b != 0){
             double resultadoDivision = a / b;
        return resultadoDivision ;
        } else {
            System.out.println("Error: División por cero no permitida.");
            return 0;
        }    
    }



    static void contarPares(int inicio, int fin){
        for( int i = inicio; i <= fin; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }


}

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
      //ejemplo2();  
      //ejemplo2_version2();
      //  ejemplo3();
      ejemplo3_menu();
    }

    public static void ejemplo1() {
        try {
             //1.
            String numeroLeido = "1224";
            int numero = Integer.parseInt(numeroLeido); //susceptible de error: no avisa en tiempo de compilación
            //2. 
            int resultado = 10 / 9; //susceptible de error: no avisa en tiempo de compilación
            //3.
            int[] numeros = {1,2,3};
            System.out.println(numeros[5]); //susceptible de error: no avisa en tiempo de compilación
            //4. 
            FileReader archivo = new FileReader("archivoInexistente.txt"); //susceptible de error: SI avisa en tiempo de compilación
        } catch (NumberFormatException e) {
            System.out.println("Error: No se puede convertir la cadena a número.");
        } 
        catch (ArithmeticException e) {
            System.out.println("Error: División por cero no permitida.");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Índice de array fuera de límites.");
        }
        catch (FileNotFoundException e) {
            System.out.println("Error: Archivo no encontrado.");
        }catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        }
       
    }

    public static void ejemplo2() {
        Scanner lector = new Scanner(System.in);
        int numerador =0 , denominador= 0, resultado = 0;
        try {
            System.out.println("Ingrese el numerador: ");
            numerador = lector.nextInt();
        } catch (Exception e) {
            System.out.println("Error: Entrada inválida para el numerador.");
        }
        lector.nextLine(); // Limpiar el buffer
        try {
            System.out.println("Ingrese el denominador: ");
            denominador = lector.nextInt();
        } catch (Exception e) {
            System.out.println("Error: Entrada inválida para el denominador.");
        }
        
        try {
             resultado = numerador / denominador;
             System.out.println("El resultado de la división es: " + resultado);
        } catch (Exception e) {
                System.out.println("Error: No se puede dividir por cero.");
        }
       
    }

    public static void ejemplo2_version2() {
        Scanner lector = new Scanner(System.in);
        int numerador =0 , denominador= 0, resultado = 0;
        boolean entradaValida = false;

       do {
                try {
                System.out.println("Ingrese el numerador: ");
                numerador = lector.nextInt();

                System.out.println("Ingrese el denominador: ");
                denominador = lector.nextInt();
              
                entradaValida = true;

                if(numerador > denominador) {
                    entradaValida = false;
                    throw new DivisionInvalidaException("El numerador no puede ser mayor que el denominador.");
                }

                resultado = numerador / denominador;
                System.out.println("El resultado de la división es: " + resultado);
            } catch (ArithmeticException e) {
                System.out.println("Error: No se puede dividir por cero.");
                entradaValida = false;
            } catch (DivisionInvalidaException e) {
                System.out.println("Error: " + e.getMessage());
                entradaValida = false;
            } catch (Exception e) {
                System.out.println("Error: Entrada inválida.");
            }
            lector.nextLine(); // Limpiar el buffer
        } while (!entradaValida);
        
        System.out.println("Operación finalizada.");
    }

    public static void ejemplo3(){
        FuncionCine funcion = new FuncionCine(10);
        funcion.reservarAsientos(4);
        funcion.reservarAsientos(7); //lanza la excepción
    }

    public static void ejemplo3_menu(){
        FuncionCine funcion = new FuncionCine(10);
        Scanner lector = new Scanner(System.in);
        boolean reservaExitosa = false;

        do {
            try {            
                System.out.println("Ingrese la cantidad de asientos a reservar: ");
                int cantidad = lector.nextInt();
                funcion.reservarAsientos(cantidad);
                reservaExitosa = true;
            } catch (AsistentosNoDisponiblesException e) {
                System.out.println("Error: " + e.getMessage());
                reservaExitosa = false;
            } catch (Exception e) {
                System.out.println("Error: Entrada inválida.");
                reservaExitosa = false;
            }
            lector.nextLine(); // Limpiar el buffer
        } while (!reservaExitosa);

        System.out.println("Reserva finalizada.");
    }
}

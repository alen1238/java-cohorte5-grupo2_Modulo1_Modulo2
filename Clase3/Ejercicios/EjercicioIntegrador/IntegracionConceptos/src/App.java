import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
    }

    public static void TallerIntegrador() {
        var sc = new Scanner(System.in);
        int option;
        do {
            System.out.println("--- Analizador de Números y Secuencias ---\n");
            System.out.println("1. Analizar un número");
            System.out.println("2. Generar secuencia de números");
            System.out.println("0. Salir\n");
            System.out.print("Seleccione una opción: ");
            option = sc.nextInt();
             switch(option){
            case 1:
            //instrucciones de analizar número
            System.out.print(" ingrese un número entero: ");
            int numero = sc.nextInt();
            if(numero > 0){
                System.out.printf("El número %d es positivo%n", numero);
            }
            else if(numero < 0){
                System.out.printf("El número %d es negativo%n", numero);
            }
            else{
                System.out.printf("El número %d es cero%n", numero);
            }

            String paridad = (numero % 2 == 0) ? "par" : "impar";
            System.out.printf("El número %d es %s%n", numero, paridad);

            if(numero < 100){
                System.out.printf("El número %d es menor que 100%n%n", numero);
            }
            else if(numero == 100){
                System.out.printf("El número %d es igual a 100%n%n", numero);
            }
            else{
                System.out.printf("El número %d es mayor que 100%n%n", numero);
            }
             break;
            case 2:
            //instrucciones de generar secuencia
            System.out.print("Ingrese el número inicial de la secuencia: ");
            int inicio = sc.nextInt();
            System.out.print("Ingrese el número final de la secuencia: ");
            int fin = sc.nextInt();
            sc.nextLine(); // Consumir el salto de línea pendiente
            System.out.print("¿Mostrar solo 'par' o 'impar' (p/i)?:  ");
            String tipo = sc.nextLine();
                if(tipo.equals("p")){
                    for(int i = inicio; i <= fin; i++){
                        if(i % 2 == 0){
                            System.out.print(i + " ");
                        }
                    }
                    System.out.println();
                }
                else if(tipo.equals("i")){
                    for(int i = inicio; i <= fin; i++){
                        if(i % 2 != 0){
                            System.out.print(i + " ");
                        }
                    }
                    System.out.println();
                }
                else{
                    for(int i = inicio; i <= fin; i++){
                        System.out.print(i + " ");
                    }
                }
               
                System.out.println();   
             break;
            case 0:
                System.out.println("Saliendo del programa. ¡Hasta luego!");
                break;
            }
        } while (option != 0);

       

        sc.close();
    }

    public static void EsquemaEjercicioPractica() {
        var sc = new Scanner(System.in);
        int option;
        
        do {
            System.out.println("--- Menú de Opciones ---\n");
            System.out.println("1. Calcular Área de una Figura");
            System.out.println("2. Calcular Edad Futura.");
            System.out.println("3. Salir.\n");
            System.out.print("Seleccione una opción: ");
            option = sc.nextInt();
             switch(option){
                
             }
        } while (option != 3);
    }
}

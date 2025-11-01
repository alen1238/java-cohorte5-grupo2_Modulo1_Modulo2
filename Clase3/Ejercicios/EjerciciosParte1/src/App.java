import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //SentenciaIf();
        //Ciclo_While();
        //Ciclo_for();
        //for_Break();
        //for_continue();
        //Ciclo_While2();
        ciclo_do_while();
    }

    public static void SentenciaIf() {
        int numero = 10;//declarada e inicializada la variable

        if (numero >= 0) {
            // Este código se ejecuta SOLO si 'numero' es mayor que 0
            System.out.println("El número es positivo.");
        }
        if (numero < 0) {
            System.out.println("El número es negativo.");
        }
        // Si numero fuera -5, la línea anterior no se ejecutaría, y el programa continuaría aquí.
    }

    public static void SentenciaIf_Else() {
        int numero = 7;

        if (numero % 2 == 0) { // Si el residuo de la división por 2 es 0, es par
            System.out.println("El número es par.");
        } else { // Si la condición del if es false...
            System.out.println("El número es impar.");
        }
    }

     public static void SentenciaIf_If_Else_Else() {
            int calificacion = 85;

            if (calificacion >= 90) {
                System.out.println("Excelente");
            } else if (calificacion >= 80) { // Se evalúa SOLO si la primera condición (calificacion >= 90) fue false
                System.out.println("Muy Bien");
            } else if (calificacion >= 70) { // Se evalúa SOLO si las condiciones anteriores fueron false
                System.out.println("Bien");
            } else { // Se ejecuta si ninguna de las condiciones anteriores fue true
                System.out.println("Necesita mejorar");
            }
    }

    public static void Sentencia_switch_case(){
        int diaSemana = 3; // 1=Lunes, 2=Martes, etc.
        String nombreDia;

        switch (diaSemana) { // La variable a evaluar
            case 1: // Si diaSemana es 1...
                nombreDia = "Lunes";
                break; // Importante: sale del switch después de ejecutar el código del case
            case 2: // Si diaSemana es 2...
                nombreDia = "Martes";
                break;
            case 3: // Si diaSemana es 3...
                nombreDia = "Miércoles";
                break;
            case 4:
                nombreDia = "Jueves";
                break;
            case 5:
                nombreDia = "Viernes";
                break;
            case 6: // Múltiples casos pueden compartir el mismo bloque de código
            case 7:
                nombreDia = "Fin de semana";
                break;
            default: // Opcional: se ejecuta si el valor de diaSemana no coincide con ningún 'case'
                nombreDia = "Día inválido";
                break; // Es buena práctica poner break incluso en el default
        }
        System.out.println("El día es: " + nombreDia); // Salida: El día es: Miércoles
            }


    public static void Ciclo_While() {
        
        int contador = 0; // Inicialización de una variable de control del bucle

        while (contador <= 5) { // Condición: el bucle se repite mientras 'contador' sea menor que 5
            System.out.println("Iteración: " + contador);
            contador++; // Actualización: incrementa 'contador' en 1. ¡Esto es CRUCIAL!
        }
        System.out.println("linea fuera del bucle.");
        // Salida:
        // Iteración: 0
        // Iteración: 1
        // Iteración: 2
        // Iteración: 3
        // Iteración: 4
        // Cuando contador llega a 5, la condición (5 < 5) es false, y el bucle termina.
    }

    public static void Ciclo_for() {
        // Sintaxis: for (inicialización; condición; actualización) { // código }
        //boolean esDiaLaboral = true;
        for (int i = 1; i <= 3; i++) { // i empieza en 1; el bucle continúa mientras i <= 10; i se incrementa en 1 después de cada iteración
            System.out.println("Contando: " + i);
        }
        // Salida:
        // Contando: 1
        // Contando: 3
        // ...
        // Contando: 10
     }


     public static void for_Break() {
            
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Encontrado el número 5. Saliendo del bucle.");
                break; // Sale del bucle for
            }
            System.out.println("Procesando: " + i);
        }
        System.out.println("Después del bucle.");
        // Salida:
        // Procesando: 1
        // Procesando: 2
        // Procesando: 3
        // Procesando: 4
        // Encontrado el número 5. Saliendo del bucle.
        // Después del bucle.
     }

     public static void for_continue() {
        for (int i = 1; i <= 10; i++) {
        if (i % 2 != 0) { // Si i es impar...
            System.out.println("Saltando número impar: " + i);
            continue; // Salta el resto del código en esta iteración (el println de abajo)
        }
        // Este código solo se ejecuta si i es par
        System.out.println("Procesando número par: " + i);
        }
    // Salida:
    // Saltando número impar: 1
    // Procesando número par: 2
    // Saltando número impar: 3
    // Procesando número par: 4
    // ... y así sucesivamente.
     }

     public static void Ciclo_While2(){
        //validar si un numero ingrsado es positivo
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un número positivo:");
        int numero = sc.nextInt();

        while (numero < 0) {
            System.out.println("El número es negativo. Ingrese un número positivo:");
            numero = sc.nextInt();
        }

        System.out.println("Gracias! Has ingresado el número positivo: " + numero);

     }

     public static void ciclo_do_while() {
        int numero;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Ingrese un número positivo: ");
            numero = scanner.nextInt();
        } while (numero <= 0); // La condición se evalúa después de la primera ejecución y en cada iteración subsiguiente

        System.out.println("Número ingresado: " + numero);
        scanner.close();
        // Este bucle siempre pedirá un número al menos una vez. Si el primer número es positivo, la condición es false y el bucle termina. Si no, seguirá pidiendo hasta que se ingrese uno positivo.
     }

     public static void operador_Ternario() {
        int edad = 20;
        String mensaje;

        // Usando if-else:
        if (edad >= 18) {
            mensaje = "Mayor de edad";
        } else {
            mensaje = "Menor de edad";
        }
        System.out.println(mensaje); // Salida: Mayor de edad

        // Usando el operador ternario (equivalente al if-else anterior):
        String mensajeTernario = (edad >= 18) ? "Mayor de edad" : "Menor de edad";
        System.out.println(mensajeTernario); // Salida: Mayor de edad

        // Otro ejemplo:
        int num = 10;
        String tipoNumero = (num % 2 == 0) ? "Par" : "Impar";
        System.out.println("El número es: " + tipoNumero); // Salida: El número es: Par
     }
    
     public static void operador_Ternario2(){
        int a = 5;
        int b = 10;

        // Usando if-else para encontrar el mayor
        int mayor;
        if (a > b) {
            mayor = a;
        } else {
            mayor = b;
        }
        System.out.println("El mayor usando if-else es: " + mayor);

        // Usando operador ternario para encontrar el mayor
        int mayorTernario = (a > b) ? a : b;
        System.out.println("El mayor usando operador ternario es: " + mayorTernario);
     }
    
    }

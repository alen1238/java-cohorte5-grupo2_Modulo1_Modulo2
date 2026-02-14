import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in); 
            // System.out.print("Ingrese su nombre: ");//comunicando 
            // String nombre = sc.nextLine(); //leer (escuchar) dato tipo cadena

            // System.out.println("Ingrese su edad: ");
            // int edad = sc.nextInt(); //leer (escuchar) dato tipo entero
            // sc.nextLine(); // Limpiar el buffer después de leer un entero

            // System.out.println("Escribe tus apellidos: ");
            // String apellido = sc.nextLine(); //leer (escuchar) dato tipo cadena

            // System.out.println("Hola " + nombre + " " + apellido + ", tienes " + edad + " años.");

            System.out.print("Ingrese su edad: ");
            int edadUsuario = scanner.nextInt(); // Lee un entero

            System.out.print("Ingrese su salario: ");
            double salarioUsuario = scanner.nextDouble(); // Lee un double

            // ¡Importante! Limpiar el buffer después de nextInt/nextDouble
            // porque nextLine() solo lee el salto de línea restante.
            scanner.nextLine(); // Consume el salto de línea pendiente

            System.out.print("Ingrese su nombre completo: ");
            String nombreUsuario = scanner.nextLine(); // Lee una línea completa de texto

            System.out.println("Hola " + nombreUsuario + ", tienes " + edadUsuario + " años y ganas " + salarioUsuario);

            scanner.close(); // Es buena práctica cerrar el Scanner cuando ya no lo necesites
    }
}

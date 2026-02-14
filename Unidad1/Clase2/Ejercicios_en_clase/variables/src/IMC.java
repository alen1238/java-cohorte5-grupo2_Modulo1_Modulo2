import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //lectora de datos
        System.out.print("Ingrese su peso en kilogramos: ");
        double peso = sc.nextDouble(); //lectura del peso
        System.out.print("Ingrese su altura en metros: ");
        double altura = sc.nextDouble(); //lectura de la altura

        //limpiar el buffer
        sc.nextLine();
        System.out.println("Escriba su nombre: ");
        String nombre = sc.nextLine(); //lectura del nombre

        double imc = peso / (altura * altura); //calculo del IMC
        System.out.printf("%s, su índice de masa corporal (IMC) es: %.2f%n", nombre, imc);

        System.out.println("¿IMC menor que 18.5? (bajo peso) " + (imc < 18.5));
        System.out.println("¿IMC entre 18.5 y 24.9? (peso normal) " + (imc >= 18.5 && imc <= 24.9));
        System.out.println("¿IMC entre 25 y 29.9? (sobrepeso) " + (imc >= 25));
    }
}

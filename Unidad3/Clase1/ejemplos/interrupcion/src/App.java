import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class App {
    public static void main(String[] args) {
       // ejemplo1();
       // ejemplo2();
       // System.out.println("Programa finalizado con recuperación de errores.");
        try {
            ejemplo3(800, 100);
        } catch (DivisionInvalidaException e) {
            System.out.println("Error al calcular el índice de ventas: " + e.getMessage());
        }
       
    }

    public static void ejemplo1(){
        
            try {
                int division = 10 / 0;
                System.out.println("El resultado es: " + division); //esta linea solo se ejecuta si la división  fue correcta.
            } catch (Exception e) {
               System.out.println("No se puede dividir por cero. Es un error lógico.");
            }
            //aqui es donde colocamos la linea susceptible de lanzar una excepción.
          
        
        

        System.out.println("Aqui continúa el programa...  ");
        System.out.println("Aqui hay 300 lineas de código más...");
    }

    public static void ejemplo2(){
       //leer un archivo
      
       // FileReader fr = new FileReader("archivoInexistente.txt");
      
        
    }

    public static void ejemplo3(int vendidos, int disponibles) throws DivisionInvalidaException {
        Calculadora calc = new Calculadora();
        double indice = calc.indiceVentas(vendidos, disponibles);
        System.out.println("El índice de ventas es: " + indice);
        
    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        /*
            Dada una lista de enteros, queremos:
            1. Quedarnos con los numeros pares
            2. Multiplicar cada número por 2
            3. Imprimir el resultado
        */
       System.out.println("Ejemplo clásico:");
        ejemploClasico();
        ejemploStreams();
       
        String nombre = "Juan";
        String apellido = "Perez";

        nombre.compareTo(apellido);
        
    }

    public static void ejemploClasico() {
         List<Integer> resultado = new ArrayList<>();

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        // 1. recorrer la lista de numeros
        //2. quedarnos con los numeros pares comparando una condición
        // 3. multiplicar cada número de la lista de pares por 2
        // 4. imprimir el resultado

        for(Integer numero : numeros) {
            if(numero % 2 == 0) {
                resultado.add(numero * 2);
            }
        }

        System.out.println(resultado);
    }
    
    public static void ejemploStreams(){
             List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);
             numeros.stream()
                    .filter(n -> n % 2 == 0)
                    .map(n -> n * 2)
                    .forEach(n -> System.out.println(n));
    }
}

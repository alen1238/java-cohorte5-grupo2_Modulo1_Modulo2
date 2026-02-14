import java.util.*;

public class EjemploMap {
    public static void main(String[] args) {
        Map<String, Double> estudiantes_notas = new TreeMap<>();


        estudiantes_notas.put("Juan", 8.5);
        estudiantes_notas.put("María", 9.0);    
        estudiantes_notas.put("Pedro", 7.5);
        estudiantes_notas.put("Ana", 9.5);
        System.out.println("Notas de los estudiantes:");
        for (Map.Entry<String, Double> entry : estudiantes_notas.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

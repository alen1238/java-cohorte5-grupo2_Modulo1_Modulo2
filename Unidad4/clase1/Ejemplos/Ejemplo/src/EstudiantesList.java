import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class EstudiantesList {
    public static void main(String[] args) {
        List<String> asistencia = new ArrayList<>();
        asistencia.add("Juan");
        asistencia.add("María");
        asistencia.add("Carlos");
        asistencia.add("Ana");
        asistencia.add("María");
        asistencia.add("Luis");
        asistencia.add("Sofía");
        asistencia.add("Carlos");

        System.out.println("Lista de asistencia:");

        for (String estudiante : asistencia) {
            System.out.println(estudiante);
         }


    }
}

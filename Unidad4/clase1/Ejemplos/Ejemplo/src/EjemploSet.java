import java.util.*;

public class EjemploSet {
    public static void main(String[] args) {
        Set<String> correos = new HashSet<>();

        correos.add("juan@correo.com");
        correos.add("maria@correo.com");
        correos.add("carlos@correo.com");
        correos.add("ana@correo.com");
        correos.add("luis@correo.com");
        correos.add("sofia@correo.com");
        correos.add("carlos@correo.com"); // Este correo ya existe, no se agregará
            correos.add("luis@correo.com");
            correos.add("luis@correo.com");
            correos.add("luis@correo.com");
            correos.add("luis@correo.com");

        System.out.println("Conjunto de correos:");
        for (String correo : correos) {
            System.out.println(correo);
        }
    }
}   

public class App {

    int miNUmero = 5;
    public static void main(String[] args) throws Exception {
        int miNUmero = 5;
        // System.out.println("Registrando datos de Carlos en el sistema...");
        // System.out.println("Registrando datos de Ana en el sistema...");
        // System.out.println("Registrando datos de Luis en el sistema...");
        // System.out.println("Registrando datos de Marta en el sistema...");
        registrarUsuario("Carlos");
        registrarUsuario("Ana");
        registrarUsuario("Luis");   
        registrarUsuario("Marta");
        sumar(5,6); // llamada a la función sumar: se le pasan los argumentos 4 y 5
    }

    static int sumar(int a, int b) {
        System.out.println("Sumando " + a + " + " + b);
        int i=0;
        for(; i<10; i++) {
            System.out.println(i);
        }
        int miNUmero = 5;
        System.out.println(i);
        return a + b;
    }

    static void registrarUsuario(String nombre) {
        System.out.println("Registrando datos de " + nombre + " en el sistema...");
        System.out.println();
    }

    static boolean esMayorDeEdad(int edad) {
        return edad >= 18;
    }

    
}

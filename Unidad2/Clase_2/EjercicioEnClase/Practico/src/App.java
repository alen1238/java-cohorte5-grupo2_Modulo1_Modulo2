import java.util.Scanner;

public class App {
     static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
       
        int opcion;
        do{
            menu();
            opcion = sc.nextInt();
            sc.nextLine();
            ejecutarOpcion(opcion);

        }while(opcion != 3);
        
    }

    public static void menu(){
        System.out.println("1. Crear Gerente");
        System.out.println("2. Crear Desarrollador");
        System.out.println("3. Salir");
        System.out.print("opcion: ");
    }

    public static void ejecutarOpcion(int opcion) {
        String nombre, id;
        double salarioBase, bono;
        String lenguaje;
        
        switch (opcion) {
            case 1:
                  System.out.print("Ingrese nombre: ");  
                  nombre = sc.nextLine();
                  System.out.print("Ingrese id: ");  
                  id = sc.nextLine();
                  System.out.print("Ingrese salario base: ");  
                  salarioBase = sc.nextDouble();
                  sc.nextLine();
                  System.out.print("Ingrese bono: ");  
                  bono = sc.nextDouble();
                  Gerente gerente = new Gerente(nombre, id, salarioBase, bono);
                  System.out.println("Se ha creado exitosamente el gerente:");
                  gerente.mostrarDetalles();
                break;

            case 2:
                  System.out.print("Ingrese nombre: ");  
                  nombre = sc.nextLine();
                  System.out.print("Ingrese id: ");  
                  id = sc.nextLine();
                  System.out.print("Ingrese salario base: ");  
                  salarioBase = sc.nextDouble();
                  sc.nextLine();
                  System.out.print("Lenguaje (Java | otro): ");
                  lenguaje = sc.nextLine();
                  Desarrollador dev = new Desarrollador(nombre, id, salarioBase, lenguaje);
                  System.out.println("Se ha creado el desarrollador exitosamente: ");
                  dev.mostrarDetalles();
                break;
        
            case 3:
                System.out.println("Saliendo del sistema...");
                break;
            default:
                break;
        }
    }


}

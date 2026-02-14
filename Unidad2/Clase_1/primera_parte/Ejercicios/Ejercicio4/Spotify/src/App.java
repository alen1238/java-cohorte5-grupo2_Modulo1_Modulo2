import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String nombre, artista;
        int duracion;
        Cancion c1, c2, c3;

        System.out.print("Ingrese el nombre de la canción: ");
        nombre = sc.nextLine();
         System.out.print("Ingrese el nombre del artista: ");
        artista = sc.nextLine();
         System.out.print("Ingrese duración: ");
        duracion = sc.nextInt();
        sc.nextLine(); //limpiamos el buffer
        c1 = new Cancion(nombre, artista, duracion); //instanciamos acá.
        
        System.out.print("Ingrese el nombre de la canción: ");
        nombre = sc.nextLine();
         System.out.print("Ingrese el nombre del artista: ");
        artista = sc.nextLine();
         System.out.print("Ingrese duración: ");
        duracion = sc.nextInt();
        sc.nextLine(); //limpiamos el buffer
        c2 = new Cancion(nombre, artista, duracion);


        System.out.print("Ingrese el nombre de la canción: ");
        nombre = sc.nextLine();
         System.out.print("Ingrese el nombre del artista: ");
        artista = sc.nextLine();
         System.out.print("Ingrese duración: ");
        duracion = sc.nextInt();
        c3 = new Cancion(nombre, artista, duracion);
       

        

        c1.reproducir();  c1.reproducir(); c1.reproducir(); c1.reproducir(); c1.reproducir();
        c2.reproducir(); c2.reproducir(); c2.reproducir();c2.reproducir(); c2.reproducir(); c2.reproducir(); c2.reproducir(); 
        c3.reproducir();

    
        if(c2.getRepro() > c1.getRepro() && c2.getRepro() > c3.getRepro()) {

            System.out.println("La cancion mas reproducida es: " + c2.toString());
        }
        else if(c3.getRepro() > c1.getRepro() && c3.getRepro() > c2.getRepro()){
              System.out.println("La cancion mas reproducida es " + c3.toString());
        }
        else{
             System.out.println("La cancion mas reproducida es " + c1.toString());
        }
    }

    public static Cancion CrearCancion(){
        Scanner sc = new Scanner(System.in);
        String nombre, artista;
        int duracion;
        Cancion cancion;

        System.out.print("Ingrese el nombre de la canción: ");
        nombre = sc.nextLine();
         System.out.print("Ingrese el nombre del artista: ");
        artista = sc.nextLine();
         System.out.print("Ingrese duración: ");
        duracion = sc.nextInt();
        sc.nextLine(); //limpiamos el buffer
        cancion = new Cancion(nombre, artista, duracion); //instanciamos acá.
        return cancion;
    }

    public static void mostrarMenu(){
         Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do{
            System.out.println("1. Ingresar cancion nueva");
            System.out.println("2. Mirar ranking de cancniones");
            System.out.println("3. Salir");
            opcion = sc.nextInt();
            //aqui hacemos un switch evaluando la opcion y llamando al método específico.
        }while(opcion =! 3 );
    }
}

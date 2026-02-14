public class Conversiones {
    public static void main(String[] args) {
        Ejercicio1();
       // Situacion1();
        //Situacion2();
        //Situacion3();
    }

    public static void Ejercicio1() {
        int cantidad = 3;
        int total = 10;
        double promedio = (double) total / cantidad;
        System.out.println("El promedio es: " + promedio);
    }

     public static void Situacion1() {
        // Conversion de tipo implicita (de un dato pequeño hacia uno grande)
        byte numeropequeno = 10;
        int numerogrande = numeropequeno;
        System.out.println("El numero grande es: " + numerogrande);

        byte a = 5;
        byte b = 10;
        int c = a + b;

        short d = 7;
        short e = 3;
        int f = d + e;
     }

     public static void Situacion2(){
        //conversion explicita: cnuando es de un tipo de dato grande hacia uno pequeño
        double decimal = 9.78;
        int entero = (int) decimal; // Conversion explicita (de un dato grande hacia
        System.out.println("El numero entero es: " + entero);
     }

      public static void Situacion3(){
        //Conversion implicita con una expresion
        int numero = 5;
        double resultado = numero + 4.5; // El 5 se convierte implicitamente
      }

}

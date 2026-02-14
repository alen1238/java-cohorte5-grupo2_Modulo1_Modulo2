public class Expresiones {
    public static void main(String[] args) {
       operadoresLogicosYDeComparacion();
    }

    public static void operadoresAritmeticos(){
         //operadores aritméticos: +, -, *, /, %
        int a = 10;
        int b = 3;
        int suma = a + b - 23; // Suma

        //division entera
        int divisionEntera = a / b; // División entera
        System.out.println("Resultado de la división entera: " + divisionEntera);

        //división con decimales
        double c = 10.0;
        double d = 3.0;
        double resultado = c / d; // División con decimales
        System.out.println("Resultado de la división con decimales: " + resultado);


        int resultadoModulo = a % b; // Módulo
        System.out.println("Resultado del módulo: " + resultadoModulo);

        //operadores incrementales: ++, --
        int e = 5;
        e++; // Incremento
        System.out.println("Valor después del incremento: " + e);
        e--; // Decremento
        System.out.println("Valor después del decremento: " + e);
        
        
        e = 20;
        int f = e++ + 10; // aqui se usa el valor de e antes de aumentar
        System.out.println("valor de f: " + f); 
        System.out.println("valor de e: " + e);
        
        e = 20;
        int g = ++e + 10; //aqui e aumenta antes de la suma
        System.out.println("valor de g: " + g);

        e = 10;
        //e = e * 2;
        e *= 2; 

        // e = e + 5;
        e += 5;

        e %= 3; // e = e % 3;
    }

    public static void operadoresLogicosYDeComparacion(){
        //operadores de comparación: ==, !=, >, <, >=, <=
        int a = 10;
        int b = 20;
        System.out.println("a es igual a b: " +  (a == b)); //false
        System.out.println("a es diferente de b: " + (a != b)); //true
        System.out.println("a es mayor que b: " + (a > b)); //
        System.out.println("a es menor que b: " + (a < b)); //true
        System.out.println("a es mayor o igual que b: " + (a >= b)); //false
        System.out.println("a es menor o igual que b: " + (a <= b)); //true

        //operadores lógicos: &&, ||, !: nos permiten combinar expresiones de comparqación
        boolean expr1 = (a < b); //true
        boolean expr2 = (a == b); //false
        System.out.println("expr1 Y expr2: " + (expr1 || expr2)); //false
        System.out.println("expr1 O expr2: " + (expr1 && expr2)); //true
        System.out.println("NO expr1: " + (!expr1)); //false
    }

    

}

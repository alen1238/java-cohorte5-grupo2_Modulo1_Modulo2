public class App {
    public static void main(String[] args) throws Exception {
        // int a; //declaracion
        // a = 10; //inicializacion
        int a = 10534535; //declaracion e inicializacion

        byte b = 20;
        short s = -33;

        long l = 123_456_789L;
        float f = 3.1434332F;
        System.out.println(f);

        double d = 2.9999999999d;

        boolean bool = true;
        char c = 'A';

        //escribir como unicode un caracter chino
        char c2 = '\u4F60'; //el caractr chino 你
        System.out.println(c2);

        //Strings
        String str = "Hola\t que\n tal";
        str = "\"Hola que tal\"";
        System.out.println(str);

        //string multilineas
        String str2 = """
                efefwfreer
                regerge     egeg  egerrg
                greggegege
                """;
        System.out.println(str2);

    }
}

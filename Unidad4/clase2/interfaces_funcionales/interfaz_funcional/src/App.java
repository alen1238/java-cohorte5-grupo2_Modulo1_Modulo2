public class App {
    public static void main(String[] args) throws Exception {
        // Usando una clase que implementa la interfaz funcional
        MiClase miClase = new MiClase();
        MiOtraClase miOtraClase = new MiOtraClase();



        //(miOtraClase);
       // ejecutarAccion(miClase);

        // Usando una expresión lambda
        ejecutarAccion(() -> {
            System.out.println("Ejecuando acción");
            System.out.println("validando datos desde una expresión lambda");
        });

        ejecutarAccion(() -> System.out.println("Validando datos desde MongoDB"));
        metodoVersatil(5, 6, (a,b)-> System.out.println("Sumando: " + (a+b)));
        metodoVersatil(20, 5, (a,b) -> System.out.println("dividiendo: " + (a/b)));
    }

    public static void ejecutarAccion(IFuncionalInterfaz accion) {
        accion.accion();
    }

    public static void metodoVersatil(int a, int b, IInterfazOperacion operacion) {
        operacion.ejecutarOperacion(a,b);

    }
}

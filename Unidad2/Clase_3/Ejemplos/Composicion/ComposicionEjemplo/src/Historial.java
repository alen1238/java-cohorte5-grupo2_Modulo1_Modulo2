public class Historial {
    private String[] registros;
    private int capacidad;
    private int contador;

    public Historial(int capacidad) {
        this.capacidad = capacidad;
        this.registros = new String[capacidad];
        this.contador = 0;
    }

    public void agregarRegistro(String registro) {
        if (contador < capacidad) {
            registros[contador] = registro;
            contador++;
        } else {
            System.out.println("Historial lleno. No se puede agregar más registros.");
        }
    }

    public void obtenerRegistros() {
        for (int i = 0; i < contador; i++) {
            System.out.println(registros[i]);
        }
    }
}

public class Usuario {
    private String nombre;
    private Historial historial;
    
    public Usuario(String nombre, int capacidadHistorial) {
        this.nombre = nombre;
        this.historial = new Historial(capacidadHistorial);
    }

    public void agregarActividad(String actividad) {
        historial.agregarRegistro(actividad);
    }

    public void mostrarHistorial() {
        System.out.println("Historial de " + nombre + ":");
        historial.obtenerRegistros();
    }
}

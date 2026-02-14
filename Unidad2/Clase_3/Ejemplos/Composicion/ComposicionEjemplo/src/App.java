public class App {
    public static void main(String[] args) throws Exception {
        Usuario usuario = new Usuario("Juan", 5);
        
        Historial historial = new Historial(5);
        historial.agregarRegistro("Inicio de sesión");
        historial.agregarRegistro("Visualizó el perfil");
        historial.agregarRegistro("Actualizó la configuración");
        historial.agregarRegistro("Cerró sesión");
        usuario.mostrarHistorial();

        
    }
}

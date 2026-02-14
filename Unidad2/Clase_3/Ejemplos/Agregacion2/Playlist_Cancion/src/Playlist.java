public class Playlist {

    private String nombre;
    private Cancion[] canciones;
    private int apuntadorCanciones;

    public Playlist(String nombre, int capacidad) {
        this.nombre = nombre;
        this.canciones = new Cancion[capacidad];
        this.apuntadorCanciones = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean agregarCancion(Cancion cancion) {
        if (apuntadorCanciones < canciones.length) {
            canciones[apuntadorCanciones] = cancion;
            apuntadorCanciones++;
            return true;
        }
        return false;
    }

}

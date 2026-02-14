package modelado;

public class Playlist {
    private String nombre;
    private Cancion[] canciones;
    
    //atributos auxiliares del arreglo:
    private int contadorCanciones;
    private int maxCanciones; //reprsenta la longitud del arrelgo canciones.

    public Playlist(String nombre, int maxCanciones) {
        this.nombre = nombre;
        this.maxCanciones = maxCanciones;
        this.canciones = new Cancion[maxCanciones];
        this.contadorCanciones = 0;
    }

    public void agregarCancion(Cancion nuevaCancion) {
        if (contadorCanciones < maxCanciones) {
            canciones[contadorCanciones] = nuevaCancion;
            contadorCanciones++;
        } else {
            System.out.println("No se pueden agregar más canciones. La playlist está llena.");
        }
    }

    public void listarCanciones() {
        System.out.println("Playlist: " + nombre);
        for (int i = 0; i < contadorCanciones; i++) {
            System.out.println((i + 1) + ". " + canciones[i].getTitulo() + " - " + canciones[i].getArtista());
        }
    }

    public void reproducirCancion(int indice) {
        if (indice >= 0 && indice < contadorCanciones) {
            Cancion cancion = canciones[indice];
            System.out.println("Reproduciendo: " + cancion.getTitulo() + " - " + cancion.getArtista());
        } else {
            System.out.println("Índice de canción inválido.");
        }
    }

    public boolean estaLLena() {
        return contadorCanciones >= maxCanciones;
    }

    public String getNombre() {
        return nombre;
    }
}

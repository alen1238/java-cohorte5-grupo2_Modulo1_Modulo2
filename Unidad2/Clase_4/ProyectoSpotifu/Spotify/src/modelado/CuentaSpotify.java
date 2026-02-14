package modelado;

public class CuentaSpotify {
    private String usuario;
    private String password;
    private Playlist[] playlists;
    private BibliotecaMusical biblioteca;
    private boolean sesionIniciada;

    //atributos auxiliares
    private int capacidadBiblioteca;
    private int capacidadPlaylists; // Máximo número de playlists permitidas
    private int contadorPlaylists;

    public CuentaSpotify(String usuario, String password, int capacidadBiblioteca, int capacidadPlaylists) {
        this.usuario = usuario;
        this.password = password;
        this.capacidadBiblioteca = capacidadBiblioteca;
        this.capacidadPlaylists = capacidadPlaylists;
        this.biblioteca = new BibliotecaMusical(capacidadBiblioteca);
        this.playlists = new Playlist[capacidadPlaylists];
        this.sesionIniciada = false;
    }

    public void iniciarSesion(String usuario, String password) {
        if (this.usuario.equals(usuario) && this.password.equals(password)) {
            this.sesionIniciada = true;
            System.out.println("Sesión iniciada correctamente.");
        } else {
            System.out.println("Credenciales incorrectas.");
        }
    }

    public void agregarPlaylist(Playlist nuevaPlaylist) {
        if (sesionIniciada && contadorPlaylists < capacidadPlaylists) {
            playlists[contadorPlaylists] = nuevaPlaylist;
            contadorPlaylists++;
            System.out.println("Playlist agregada correctamente.");
        } else {
            System.out.println("No se puede agregar la playlist. Verifique si la sesión está iniciada o si ha alcanzado el límite de playlists.");
        }
    }

    public void agregarCancionAPlaylist(String playlist, Cancion c){
        //1. buscar la playlist en el arreglo de playlists
        //2. si la encuentra, invocar el método agregarCancion de la playlist encontrada
        for (int i = 0; i < contadorPlaylists; i++) {
            if (playlists[i].getNombre().equalsIgnoreCase(playlist)) {
                playlists[i].agregarCancion(c);
                System.out.println("Canción agregada a la playlist correctamente.");
                return;
            }
        }
    }

    public void reproducir(String playlist, int indexCancion){
        //1. buscamos la playlist en el arreglo de playlists
        //2. si la encuentra, invocar el método reproducirCancion de la playlist
        for (int i = 0; i < contadorPlaylists; i++) {
            if (playlists[i].getNombre().equalsIgnoreCase(playlist)) {
                playlists[i].reproducirCancion(indexCancion);
                return;
            }
        }
    }

    public void cerrarSesion() {
        this.sesionIniciada = false;
        System.out.println("Sesión cerrada.");
    }


    //metodos para trabajar con la biblioteca musical: 
    //ejemplo: agregarCancionABiblioteca, eliminarCancionDeBiblioteca, etc.
}

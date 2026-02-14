import modelado.BibliotecaMusical;
import modelado.Cancion;
import modelado.CuentaSpotify;

public class App {
    public static void main(String[] args) throws Exception {
        CuentaSpotify cuenta1 = crearCuenta("user1", "pass1", 100, 10);
        //crear canciones de prueba
        Cancion cancion1 = new Cancion("Song A", "Artist A", 210);
        Cancion cancion2 = new Cancion("Song B", "Artist B", 180);  

        //crear playlist de prueba
        Playlist playlist1 = new Playlist("My Favorites", 50);
        playlist1.agregarCancion(cancion1);
        playlist1.agregarCancion(cancion2);


    }

    public static void MenuPrincipal(){

    }

    public static void MenuCuenta(CuentaSpotify cuenta){    
    }

    public static void MenuBiblioteca(CuentaSpotify cuenta){    
    }

    public static CuentaSpotify crearCuenta(String usuario, String password, int capacidadBiblioteca, int capacidadPlaylists){
        CuentaSpotify cuenta = new CuentaSpotify(usuario, password, capacidadBiblioteca, capacidadPlaylists);
        return cuenta;
    }

    
}

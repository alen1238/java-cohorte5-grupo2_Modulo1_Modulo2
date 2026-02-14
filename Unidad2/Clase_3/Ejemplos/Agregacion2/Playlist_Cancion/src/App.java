public class App {
    public static void main(String[] args) throws Exception {
        Playlist playlist = new Playlist("Mis Favoritas", 5);

        Cancion cancion1 = new Cancion("Imagine", "John Lennon");
        Cancion cancion2 = new Cancion("Bohemian Rhapsody", "Queen");
        Cancion cancion3 = new Cancion("Hotel California", "Eagles");

        playlist.agregarCancion(cancion1);
        playlist.agregarCancion(cancion2);
        playlist.agregarCancion(cancion3);

        Playlist playlist2 = new Playlist("Rock Clásico", 10);
        playlist2.agregarCancion(cancion1);

        System.out.println("Playlist: " + playlist.getNombre());

        //ejemplo 2: Carro-Llanta

       // Carro carro = new Carro("Toyota", "Corolla", 2020);
        Llanta llanta1 = new Llanta("Michelin", "Primacy", 16);
        Llanta llanta2 = new Llanta("Bridgestone", "Turanza", 16);
       
       
        // carro.agregarLlanta(llanta1, 0);
        // carro.agregarLlanta(llanta2, 1);
        Carro carro2 = new Carro("Honda", "Civic", 2021);
        carro2.agregarLlanta(llanta1, 0);
    }
}

package modelado;

public class Cancion extends Multimedia implements Reproducible {

    //artista: atributo propio, los demás son heredados
    private String artista;

    public Cancion(String titulo, int duracion, String artista) {
        super(titulo, duracion);
        this.artista = artista;
    }

    public Cancion() {
        super();
        this.artista = "Desconocido";
    }

    public String getArtista() {
        return this.artista;
    }


    @Override
    public String getInfo() {
        return "Cancion: " + this.getTitulo() + ", Duracion: " + getDuracion() + " segundos, Artista: " + this.artista;
    }

    @Override
    public void Reproducir() {
        System.out.println("Reproduciendo la canción: " + this.getTitulo() + " del artista: " + this.artista);
    }

    @Override
    public void detener() {
        System.out.println("Deteniendo la canción: " + this.getTitulo());
    }

    @Override
    public String toString() {
        return getInfo();
    }


}

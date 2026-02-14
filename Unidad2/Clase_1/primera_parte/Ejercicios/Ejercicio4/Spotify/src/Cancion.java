public class Cancion {
    //atributos
    private String titulo;
    private String artista;
    private int duracion;
    private int reproducciones;


    //constructores
    public Cancion(String titulo, String artista, int duracion){
        this.titulo = titulo;
        this.artista = artista;
        this.duracion = duracion;
        this.reproducciones = 0;
    }

    //getters
    public String getTitulo(){
        return this.titulo;
    }

    public String getArtista(){
        return this.artista;
    }

    public int getDuracion(){
        return this.duracion;
    }

    public int getRepro(){
        return this.reproducciones;
    }

    public void reproducir(){
        this.reproducciones++;
    }

    public String toString(){
        return "\nTitulo: " + this.titulo +
        "\nArtista: " + this.artista + 
        "\nDuración: " + this.duracion +
        "\nReproducciones " + this.reproducciones;
    }

}

public class Album {
    //Atributos: variables globales
    String urlImg;
    String nombre;
    String artista;

    //métodos (Acciones que puede realizar el objeto)

    //Constructores 

    public Album(){ //constructor por defecto
    }

    public Album(String nombre){
        this.nombre = "Álbum sin nombre";
    }

    public Album(String urlImg, String nombre, String artista){
        this.urlImg = urlImg;
        this.nombre = nombre;
        this.artista = artista;
    }


}

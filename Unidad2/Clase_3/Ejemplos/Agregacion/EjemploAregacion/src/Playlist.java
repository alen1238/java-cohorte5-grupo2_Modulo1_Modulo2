public class Playlist {
    private String nombre;
    private Video[] videos; //la longjtud está determinado por el array que se recibe por parámetro
    private int posicion = 0;

    public Playlist(String nombre,  Video[] videos) {
        this.nombre = nombre;
        this.videos = videos;
    }

    public boolean agregarVideo(Video video) {
        if (posicion >= 0 && posicion < videos.length) {
            videos[posicion] = video;
            posicion++;
            return true;
        }
        else {
            return false;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void mostrarVideos() {
        for (Video video : videos) {
            if (video != null) {
                System.out.println(" - " + video.getTitle() + " (" + video.getDuration() + " seconds)");
            }
        }
    }

    public void eliminarUltimoVideo() {
        if (posicion > 0) {
            posicion--;
            videos[posicion] = null;
        }
    }

}

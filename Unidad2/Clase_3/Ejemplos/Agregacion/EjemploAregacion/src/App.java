public class App {
    public static void main(String[] args) throws Exception {
        Video video1 = new Video("Video 1", 300);
        Video video2 = new Video("Video 2", 450);
        Video video3 = new Video("Video 3", 200);

        Video[] videosArray = new Video[3];
        Playlist playlist = new Playlist("My Playlist", videosArray);

        playlist.agregarVideo(video1);
        playlist.agregarVideo(video2);
        playlist.agregarVideo(video3);

        System.out.println("Playlist: " + playlist.getNombre());
        playlist.mostrarVideos();

        playlist.eliminarUltimoVideo();
        System.out.println("Despues de eliminar el último video:");
        playlist.mostrarVideos();

        System.out.println("Imprimiendo datos del video eliminado:");
        System.out.println(" - " + video3.getTitle() + " (" + video3.getDuration() + " seconds)");
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Video video1 = new Video("Tutorial Java", 600);
        Video video2 = new Video("Curso Python", 800);

        Comentario comentario1 = new Comentario("Alice", "Muy buen video!");
        Comentario comentario2 = new Comentario("Bob", "Excelente explicación.");
        Comentario comentario3 = new Comentario("Charlie", "Me ayudó mucho, gracias!");

        video1.agregarComentario(comentario1);
        video1.agregarComentario(comentario2);
        video2.agregarComentario(comentario3);
        System.out.println("Comentarios para el video: " + video1.getTitulo());
        video1.getComentarios();
    }
}

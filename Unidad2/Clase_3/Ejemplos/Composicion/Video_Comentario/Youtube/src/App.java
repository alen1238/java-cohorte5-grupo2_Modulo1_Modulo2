public class App {
    public static void main(String[] args) throws Exception {
        //Video video = new Video("Mi primer video", "Juan Perez", 5);

        // Comentario comentario1 = new Comentario("Ana", "¡Excelente video!");
        // Comentario comentario2 = new Comentario("Luis", "Muy informativo, gracias.");
        // Comentario comentario3 = new Comentario("Maria", "Me encantó la parte sobre Java.");
        
        //comentario1.imprimirComentario();
        // video.agregarComentario(comentario1);
        // video.agregarComentario(comentario2);
        // video.agregarComentario(comentario3);


        //Video video = new Video("Mi primer video", "Juan Perez", 5);
        video.agregarComentario("Ana", "¡Excelente video!");
        video.agregarComentario("Luis", "Muy informativo, gracias.");
        video.agregarComentario("Maria", "Me encantó la parte sobre Java.");

        video.imprimirComentarios();

        comentario1.imprimirComentario();
    }
}

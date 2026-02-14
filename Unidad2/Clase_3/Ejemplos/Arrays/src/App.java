public class App {
    public static void main(String[] args) throws Exception {
        
        // int[] numeros; //declaración del arreglo
        // numeros = new int[10]; //instanciación del arreglo
        // //cantidad de elementos a almacenar: longitud (length)
        // System.out.println("Longitud del arreglo: " + numeros.length);

        // Comentario[] comentarios = new Comentario[5];
        //ejemploLectura();
        //ejemploEscritura();
         //Comentario[] comentarios = new Comentario[3];
        Comentario c1 = new Comentario("Ana", "¡Muy buen artículo!");
        Comentario c2 = new Comentario("Luis", "No estoy de acuerdo con el autor.");
        Comentario c3 = new Comentario("María", "Excelente explicación.");

        Video video = new Video("http://imagen.com/video1.jpg", "Mi primer video", 10);
        video.agregarComentario(c1);
        video.agregarComentario(c2);
        video.agregarComentario(c3);

        Comentario c4 = new Comentario("Pedro", "¡Me encantó este video!");
        video.agregarComentario(c4);

        Comentario c5 = new Comentario("Lucía", "Muy informativo, gracias por compartir.");
        video.agregarComentario(c5);
        Comentario c6 = new Comentario("Carlos", "No me gustó mucho el contenido.");
        video.agregarComentario(c6);
        Comentario c7 = new Comentario("Sofía", "¡Increíble trabajo!");
        video.agregarComentario(c7);
        Comentario c8 = new Comentario("Miguel", "Podrías profundizar más en el tema.");
        video.agregarComentario(c8);
        Comentario c9 = new Comentario("Elena", "¡Gracias por la información!");
        video.agregarComentario(c9);
        Comentario c10 = new Comentario("Javier", "Espero ver más videos como este.");
        video.agregarComentario(c10);

        video.getComentarios();

    }

    public static void ejemploEscritura() {
        // Comentarios coleccionados
        Comentario[] comentarios = new Comentario[3];
        comentarios[0] = new Comentario("Ana", "¡Muy buen artículo!");
        comentarios[1] = new Comentario("Luis", "No estoy de acuerdo con el autor.");
        comentarios[2] = new Comentario("María", "Excelente explicación.");

        System.out.println(comentarios.length + " comentarios");
        // Mostrar los comentarios
        for (int i = 0; i < comentarios.length; i++) {
            System.out.println(comentarios[i].getAutor());
            System.out.println(comentarios[i].getTexto());
            System.out.println("--------------------");
        }
    }


}

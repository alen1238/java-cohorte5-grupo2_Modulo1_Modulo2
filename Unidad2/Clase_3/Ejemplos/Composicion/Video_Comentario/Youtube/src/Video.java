public class Video {
    //Atributos
    private String titulo;
    private String autor;
    private Comentario[] comentarios;
    private int apuntador;
    private int cantidadMaximaComentarios;

    public Video(String titulo, String autor, int cantidadMaximaComentarios) {
        this.titulo = titulo;
        this.autor = autor;
        this.comentarios = new Comentario[cantidadMaximaComentarios];
    }

    public void agregarComentario(String autor, String texto) {
        Comentario comentario = new Comentario(autor, texto); //aqui nace internamente el objeto comentario.
        
        if (apuntador < comentarios.length) {
            comentarios[apuntador] = comentario;
            apuntador++;
        } else {
            System.out.println("No se pueden agregar más comentarios.");
        }
    }

    public void imprimirComentarios() {
        System.out.println("Comentarios del video: " + titulo);
        for (int i = 0; i < comentarios.length; i++) {
            comentarios[i].imprimirComentario();
        }
    }

}

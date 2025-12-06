public class Video {
    private String titulo;
    private int duracion; // duracion en segundos
    private Comentario[] comentarios;
    private int contadorComentarios = 0;

    public Video(String titulo, int duracion) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.comentarios = new Comentario[100]; // capacidad fija de 100 comentarios
    }

    public String getTitulo() {
        return titulo;
    }
    public int getDuracion() {
        return duracion;
    }
    public void getComentarios() {
        for (Comentario comentario : comentarios) {
            if (comentario != null) {
                System.out.println(comentario.getAutor() + ": " + comentario.getTexto());
            }
        }
    }

    public void agregarComentario(Comentario comentario) {
        for (int i = 0; i < comentarios.length; i++) {
            if (comentarios[i] == null) {
                comentarios[i] = comentario;
                contadorComentarios++;
                break;
            }
        }
    }
}

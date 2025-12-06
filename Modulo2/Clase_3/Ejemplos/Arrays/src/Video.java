public class Video {
    private String urlImagen;
    private String titulo;
    private Comentario[] comentarios;
    private int contadorComentarios;

    public Video(String urlImagen, String titulo, int maxComentarios) {
        this.urlImagen = urlImagen;
        this.titulo = titulo;
        this.comentarios = new Comentario[maxComentarios];
        this.contadorComentarios = 0;
    }

    //getter y setters
    public String getUrlImagen() {
        return urlImagen;
    }   
    public String getTitulo() {
        return titulo;
    }
    public void getComentarios() {
        System.out.println(comentarios.length + " comentarios");
        for(int i=0; i<contadorComentarios; i++) {
            System.out.println(comentarios[i].getAutor());
            System.out.println(comentarios[i].getTexto());
            System.out.println("--------------------");
        }
    }

    public void agregarComentario(Comentario comentario) {
        if (contadorComentarios < comentarios.length) {
            comentarios[contadorComentarios] = comentario;
            contadorComentarios++;
        } else {
            System.out.println("No se pueden agregar más comentarios.");
        }
    }

    
}

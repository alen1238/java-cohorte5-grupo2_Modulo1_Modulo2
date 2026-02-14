package modelado;

public abstract class Multimedia {
    private String titulo;
    private int duracion; // Duracion en segundos

    public Multimedia(String titulo, int duracion) {
        this.titulo = titulo;
        this.duracion = duracion;
    }

    public Multimedia() {
        this.titulo = "Desconocido";
        this.duracion = 0;
    }

    public Multimedia(String titulo) {
        this.titulo = titulo;
        this.duracion = 0;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    //Este método es abstracto y debe ser implementado por las subclases
    public abstract String getInfo();
    
    
}

public class Autor {
    private String nombreAutor;
    private String generoMusical;

    public Autor(String nombreAutor, String generoMusical) {
        this.nombreAutor = nombreAutor;
        this.generoMusical = generoMusical;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public String getGeneroMusical() {
        return generoMusical;
    }
}   

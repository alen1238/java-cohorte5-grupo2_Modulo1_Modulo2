package modelado;

public class BibliotecaMusical {
    private Cancion[] canciones;

    //atributos auxiliares
    private int contadorCatalogo;
    private int capacidadMaxima;

    public BibliotecaMusical(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        this.canciones = new Cancion[capacidadMaxima];
        this.contadorCatalogo = 0;
    }

    public void agregarCancion(Cancion nuevaCancion) {
        if (contadorCatalogo < capacidadMaxima) {
            canciones[contadorCatalogo] = nuevaCancion;
            contadorCatalogo++;
        } else {
            System.out.println("No se puede agregar más canciones, capacidad máxima alcanzada.");
        }
    }

    public Cancion buscarCancionPorTitulo(String titulo) {
        for (int i = 0; i < contadorCatalogo; i++) {
            if (canciones[i].getTitulo().equalsIgnoreCase(titulo)) {
                return canciones[i];
            }
        }
        return null; // Canción no encontrada
    }

    public void listarCatalogo() {
        for (int i = 0; i < contadorCatalogo; i++) {
            System.out.println(canciones[i].getInfo());
        }
    }

    

}

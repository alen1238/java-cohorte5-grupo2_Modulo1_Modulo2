public class CuentaSpotify {

    private String nombreUsuario;
    private String tipoCuenta; // "Gratis" o "Premium"
    private int numeroListasReproduccion;
    private Autor[] autoresSeguidos;

    public CuentaSpotify(String nombreUsuario, String tipoCuenta) {
        this.nombreUsuario = nombreUsuario;
        this.tipoCuenta = tipoCuenta;
        this.numeroListasReproduccion = 0;
        this.autoresSeguidos = new Autor[100];
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public int getNumeroListasReproduccion() {
        return numeroListasReproduccion;
    }

    public void crearListaReproduccion() {
        numeroListasReproduccion++;
    }

    public void cambiarTipoCuenta(String nuevoTipo) {
        if (nuevoTipo.equals("Gratis") || nuevoTipo.equals("Premium")) {
            this.tipoCuenta = nuevoTipo;
        } else {
            System.out.println("Tipo de cuenta no válido.");
        }
    }

    public void seguirAutor(Autor autor, int posicion) {
        if (posicion >= 0 && posicion < autoresSeguidos.length) {
            autoresSeguidos[posicion] = autor;
        } else {
            System.out.println("Posición no válida para seguir autor.");
    }

    public void seguirAutor(String nombreAutor){    
        //logica que me permita obtener un autor de la  base de datos pasando su nombre....
        //luego de obtenerlo lo agregamos a la lista de autores seguidos.
    }

    

    
  }


    public Autor obtenerAutorSeguido(String nombre){
        //creo la logica para buscar el autor por nombre
        for (Autor autor : autoresSeguidos) {
            if (autor != null && autor.getNombreAutor().equals(nombre)) {
                return autor;
            }
        }
        return null;
    }

}

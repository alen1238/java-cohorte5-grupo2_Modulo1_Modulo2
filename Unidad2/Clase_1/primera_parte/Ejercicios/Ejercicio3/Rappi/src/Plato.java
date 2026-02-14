public class Plato {
    //atributos
    private String nombre;
    private double precio;
    

    //constructor
    public Plato(String nombre){
        this.nombre = nombre;
        this.precio = 0.0;
    }

    public Plato(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precioNuevo) {
        this.precio = precioNuevo;
    }

    public void setNombre(String nombreNuevo) {
        this.nombre = nombreNuevo;
    }
}

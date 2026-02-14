public class Producto {
    //atributos
    private String nombre;
    private double precio;

    //constructor
    public Producto(){

    }

    public Producto(String nombre) {
        this.nombre = nombre;
        this.precio = 0.0;
    }

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    //getters
    public String getNombre(){
        return this.nombre;
    }

    public double getPrecio(){
        return this.precio;
    }

    //setters
    public void setNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }

    public void setPrecio(double nuevoPrecio){
        this.precio = nuevoPrecio;
    }
}

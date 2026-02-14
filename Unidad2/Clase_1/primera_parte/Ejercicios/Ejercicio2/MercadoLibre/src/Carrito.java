public class Carrito {
    //atributos
    private double total;
    private int cantidadProductos;

    //constructor
    public Carrito(){
        this.total = 0.0;
        this.cantidadProductos = 0;
    }

    public Carrito(Producto producto){
        this.total = producto.getPrecio();
        this.cantidadProductos = 1;
    }

    //getter
    public double getTotal(){
        return this.total;
    }

    public int getCantidadProductos(){
        return this.cantidadProductos;
    }

    //método para agregar producto
    public void agregarProducto(Producto producto){
        this.cantidadProductos ++;
        this.total += producto.getPrecio();
    }

}

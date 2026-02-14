public class App {
    public static void main(String[] args) throws Exception {
        Producto producto1 = new Producto("Laptop", 1500.0);
        Producto producto2 = new Producto("Mouse", 25.0);
        Producto producto3 = new Producto("Teclado", 45.0);

        Carrito carrito = new Carrito();
        carrito.agregarProducto(producto1);
        carrito.agregarProducto(producto2);
        carrito.agregarProducto(producto3);

        System.out.println("Total del carrito: " + carrito.getTotal());
        System.out.println("Cantidad de productos en el carrito: " + carrito.getCantidadProductos());
    }
}

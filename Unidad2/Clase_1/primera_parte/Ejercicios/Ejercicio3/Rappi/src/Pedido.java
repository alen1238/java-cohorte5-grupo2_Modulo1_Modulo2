public class Pedido {
    //atributos
    private String restaurante;
    // private Plato plato;
    private double total;
    private boolean entregado;
    private int totalPlatos;


    //constructor
    public Pedido(String restaurante){
        this.restaurante = restaurante;
        this.entregado = false;
        this.total = 0.0;
        this.totalPlatos = 0;
    }

    public String getRestaurante() {
        return restaurante;
    }

    public double getTotal(){
        return total;
    }

    public int getTotalPlatos(){
        return totalPlatos;
    }

    public boolean isEntregado() {
        return this.entregado;
    }

    public void entregarPedido(){
        this.entregado = true;
    }

    public void agregarPlato(Plato plato){
        this.total += plato.getPrecio();
        this.totalPlatos += 1;
    }

}

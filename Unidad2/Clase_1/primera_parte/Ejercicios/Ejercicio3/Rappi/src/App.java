public class App {
    public static void main(String[] args) throws Exception {
        Plato plato1 = new Plato("Pasta", 12.5);
        Plato plato2 = new Plato("Ensalada", 8.0);
        Plato plato3 = new Plato("Pizza", 15.0);
        Plato plato4 = new Plato("Sopa", 7.0);
        Plato platoCortesia = new  Plato("Postre de Cortesía");


        Pedido pedido1 = new Pedido("Restaurante Buen Sabor");
        pedido1.agregarPlato(plato1);
        pedido1.agregarPlato(plato2);
        pedido1.agregarPlato(platoCortesia);
        pedido1.entregarPedido();
        System.out.println("Total del pedido 1: $" + pedido1.getTotal());
        System.out.println("Platos en el pedido 1: " + pedido1.getTotalPlatos());
        if(pedido1.isEntregado()){
            System.out.println("El pedido 1 ha sido entregado.");
        } else {
            System.out.println("El pedido 1 está en proceso.");
        }

       
    }
}

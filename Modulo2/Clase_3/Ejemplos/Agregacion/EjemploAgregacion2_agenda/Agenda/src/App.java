public class App {
    public static void main(String[] args) throws Exception {
        Cliente[] clientes = new Cliente[3];
        //Aqui estoy obligado a crear primero los clientes, porque hay relación de agregación.
        Agenda agenda = new Agenda(3, clientes);

        //los clientes existen independientemente de la agenda
        Cliente cliente1 = new Cliente("001", "Juan Perez", "Calle Falsa 123", "555-1234");
        Cliente cliente2 = new Cliente("002", "Maria Gomez", "Avenida Siempre Viva 742", "555-5678");
        Cliente cliente3 = new Cliente("003", "Luis Rodriguez", "Boulevard Central 456", "555-8765");

        agenda.agregarCliente(cliente1);
        agenda.agregarCliente(cliente2);
        agenda.agregarCliente(cliente3);

        agenda.imprimirClientes();
    
    }
}

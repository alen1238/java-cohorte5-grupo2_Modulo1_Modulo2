public class Cliente {
    private String numCliente;
    private String nombre;
    private String direccion;
    private String telefono;

    public Cliente(String numCliente, String nombre, String direccion, String telefono) {
        this.numCliente = numCliente;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNumCliente() {
        return numCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    

}

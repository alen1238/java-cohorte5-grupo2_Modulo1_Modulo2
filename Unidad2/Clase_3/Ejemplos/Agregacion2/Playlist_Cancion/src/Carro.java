public class Carro {

    private String marca;
    private String modelo;
    private int año;
    private Llanta[] llantas;

    public Carro(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.llantas = new Llanta[4];
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void agregarLlanta(Llanta llanta, int posicion) {
        if (posicion >= 0 && posicion < llantas.length) {
            llantas[posicion] = llanta;
        } else {
            System.out.println("Posición inválida para la llanta.");
        }
    }
}

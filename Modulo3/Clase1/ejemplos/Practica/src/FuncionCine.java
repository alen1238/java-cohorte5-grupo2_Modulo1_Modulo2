public class FuncionCine {
    private int asientosDisponibles;

    public FuncionCine(int asientosDisponibles) {
        this.asientosDisponibles = asientosDisponibles;
    }

    public void reservarAsientos(int cantidad){
        if(cantidad > asientosDisponibles){
            throw new AsistentosNoDisponiblesException("No hay suficientes asientos disponibles.");
        }
        asientosDisponibles -= cantidad; // asientosDisponibles = asientosDisponibles - cantidad
        System.out.println("Se han reservado " + cantidad + " asientos. Asientos restantes: " + asientosDisponibles);
    }
}   

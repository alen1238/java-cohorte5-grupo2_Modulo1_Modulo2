public class Gerente extends Empleado implements Trabajable{

    private double bonoActual;

    public Gerente(String nombre, String id, double Salario, double bono){
        super(nombre, id, Salario);
        this.bonoActual = bono;
    }

    public double getBonoActual(){
        return this.bonoActual;
    }


    @Override
    public double calcularSalario() {
       return this.getSalario() + this.bonoActual;
    }

    @Override
    public void mostrarDetalles(){
        super.mostrarDetalles();
        System.out.println("Bono actual: " + bonoActual);
        System.out.println("Salario neto: " + this.calcularSalario());
    }

    @Override
    public void trabajar() {
       System.out.println("El gerente es una entidad de trabajo administrativo");
    }

}

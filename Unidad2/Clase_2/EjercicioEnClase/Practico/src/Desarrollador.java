public class Desarrollador extends Empleado implements Trabajable{

    private String lenguajePrincipal;

    public Desarrollador(String nombre, String id, double salarioBase, String lenguajePrincipal){
        super(nombre, id, salarioBase);
        this.lenguajePrincipal = lenguajePrincipal;
    }

    public String getLenguaje(){
        return this.lenguajePrincipal;
    }

    @Override
    public double calcularSalario() {
        double bono;
        if(this.lenguajePrincipal.equals("Java")){
            bono = this.getSalario()*0.1;
        }else{
            bono = this.getSalario()*0.09;
        }

        return this.getSalario() + bono;
    }


    @Override
    public void mostrarDetalles(){
        super.mostrarDetalles();
        System.out.println("lenguaje: " + this.lenguajePrincipal);
        System.out.println("Salario neto: " + this.calcularSalario());
    }

    @Override
    public void trabajar() {
       System.out.println("El desarrollador es una entidad operativa");
    }
}

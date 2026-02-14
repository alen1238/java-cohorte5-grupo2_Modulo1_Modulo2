public abstract class Empleado {
    private String nombre;
    private String id;
    private double salarioBase;


    public Empleado(String nombre, String id, double salarioBase){
        this.nombre = nombre;
        this.id = id;
        this.salarioBase = salarioBase;
    }

    public String getNombre(){
        return this.nombre;
    }

     public String getId(){
        return this.id;
    }

    public double getSalario(){
        return this.salarioBase;
    }


    public abstract double calcularSalario();

    public void mostrarDetalles(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("id: " + this.id);
        System.out.println("Salario Base: " + this.salarioBase);
    }
}

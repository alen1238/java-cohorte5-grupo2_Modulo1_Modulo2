package com.devsenior;

public class Gerente extends Empleado {
    
    private String departamento;

    public Gerente(String nombre, int edad, double salario, String departamento) {
        super(nombre, edad, salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nombre='" + getNombre() + '\'' +
                ", edad=" + getEdad() +
                ", salario=" + getSalario() +
                ", departamento='" + departamento + '\'' +
                '}';
    }

}

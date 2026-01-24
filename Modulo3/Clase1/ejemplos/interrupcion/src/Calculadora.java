public class Calculadora {
    
    //4 operaciones básicas: sumar, restar, multiplicar, dividir
    public int sumar(int a, int b) {
        return a + b;
    }

    public int restar(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }
    
    public int dividir(int numerador, int denominador) {
        return numerador / denominador;
    }

    //quiero realizar una división que me permita calcular un indice de ventas (productos vendidos / productos disponibles)
    public double indiceVentas(int productosVendidos, int productosDisponibles) throws DivisionInvalidaException {
        if(productosVendidos > productosDisponibles) {
            throw new DivisionInvalidaException("No se puede calcular el índice de ventas");
        }
        return (double) productosVendidos / productosDisponibles;
    }



}

package operaciones;
//Vamos a crear varios metodos de sumar para ver como se hace la sobrecargade métodos en java
public class Operaciones {
    public static int sumar(int a, int b){
        System.out.println("suma enteros(int a, int b)");
        return a + b;
    }
    public static double sumar(double a, double b){
        System.out.println("suma de doble(double a, double b)");
        return a + b;
    }
}

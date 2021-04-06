package operaciones;

public class Aritmetica {

    //Atributos de la clase
    int a;
    int b;

    //sin parametros, sirve para reserva memoria
    public Aritmetica()
    {
    }
    //sobrecargados

    public Aritmetica(int a, int b) {
        this.a = a;
        this.b = b;
    }



    //Metodos de la clase
    public void suma(){
        int resultado = a+ b;
        System.out.println("resultado = " + resultado);
    }
    public int sumaConRetorno(){
        return this.a + this.b;
    }
    //Metodo pasando argumentos

    public  int sumarConArgumentos(int argumento1, int argumento2){
        this.a = argumento1;
        this.b = argumento2;
        return sumaConRetorno(); // aprovecando las funciones que ya habiamos hecho
    }


}

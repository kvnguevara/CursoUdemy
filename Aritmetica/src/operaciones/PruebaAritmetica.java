package operaciones;

public class PruebaAritmetica {
    public static void main(String[] args){

        //Variables locales del método
        var a = 16;
        var b = 30;

        //Creo la instancia de la clase
        Aritmetica aritmetica1 = new Aritmetica();
        Aritmetica aritmetica2 = new Aritmetica(8,66);
        aritmetica1.a = 5;
        aritmetica1.b = 10;

        //Mostro el resultado de la suma
        aritmetica1.suma();
        var resultado = aritmetica1.sumaConRetorno();
        System.out.println("resultado = " + resultado);
        System.out.println("La suma con Retorno es: "+aritmetica1.sumarConArgumentos(a ,b));

        //Con el constructor sobrecargado

        System.out.println("Resultado de suma con Constructor Sobrecargado:"+aritmetica2.sumaConRetorno());
    }
}

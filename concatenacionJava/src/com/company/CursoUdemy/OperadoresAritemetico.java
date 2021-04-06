
/*
* Operadores Aritmeticos en Java
* SUMA +
* RESTA -
* MULTIPLICACION *
* DIVISION / */

public class OperadoresAritemetico
{

    public static void main(String[] args){

        //SUMA
        int a =3, b =2;
        var total  = a+ b;
        System.out.println("total de suma= " + total);
        //RESTA

        total = a - b;
        System.out.println("total de la resta= " + total);

        //Multiplicacion
        total = b * a;
        System.out.println("total de la Multiplicacion = " + total);

        //Division
        var total1 = 3D / b;
        System.out.println("total de la division= " + total1);

        //resto
        total = a % b;
        System.out.println("total resto= " + total);

        //PRIMO para saber si un número es para, es cuando el resto de dividir el numero entro 2, su resto es 0

        if (a % 2 ==0)
            System.out.println("Es primero A");
        else System.out.println("No es para A");
        if (b % 2 ==0)
            System.out.println("B es primo");
        else System.out.println("B no es primo");


    }
}

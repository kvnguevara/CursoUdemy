import java.util.Scanner;

public class OperadoresIgualdayRelacionales {
    public static void main(String[] args){
        int a = 3, b = 2;

        if(a == b)
            System.out.println("son iguales");
        else System.out.println("No son iguales");

        if(a != b)
            System.out.println("No son iguales");
        else System.out.println("Son iguales");

        //Si queremos comparar el contenido de cadenas tenemos que utlizar el equals
        String cadena= "Hola";
        String cadena2 = "Adios";
        boolean result = cadena.equals(cadena2);

        System.out.println("result = " + result);

        //OPERADORES RELACIONALES
        var g = a > b;
        System.out.println("g = " + g);

        g = a >=b;
        System.out.println("g = " + g);

        // si un numero es par
        if (a %2 ==0)
            System.out.println("Es para");
        else System.out.println("No es par");

        //Progama donde sabes si una persona es mayor o menor de edad
        int mayor = 18, edad;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca la edad ");
        edad = sc.nextInt();

        if(edad >= mayor){
            System.out.println("Es mayor de Edad");
        }else{
            System.out.println("No es mayor de Edad");
        }


    }
}

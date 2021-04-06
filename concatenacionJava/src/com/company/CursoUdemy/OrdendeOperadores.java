/**
 * En está clase vamos a operar con los signos u operadores, donde se prioriza el orden
 * de ejecución de los operadores
 * */

public class OrdendeOperadores {
    public static void main(String[] args){
        var x = 5;
        var y = 10;
        var z = ++x + y--;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);

        var resultado = 4 + 5 * 6 /3; // 1.multiplicacion 2.division 3.suma (5*6)/3 +4 =14
        System.out.println("El resultado es:"+resultado);//14

        resultado = (4 + 5) * 6 /3; //9 * 2=18
        System.out.println("resultado = " + resultado); //18

    }
}

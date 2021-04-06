import java.util.Scanner;

public class CasteoEnJava {

    public static void main(String[] args){
        // para poder pasar de caracter a numero, necesitamos el cast,

        var edad = Integer.parseInt("22");

        System.out.println("edad = " + edad);

        var valorPi = Double.parseDouble("3.1416");

        System.out.println("valorPi = " + valorPi);
        var sc = new Scanner(System.in);

        //Conversiones de Datos

        System.out.println("Introduzca la Edad:");
        edad = Integer.parseInt(sc.nextLine());

        System.out.println("sc = " + edad);

        //Pasamos la edad a texto
        var edadTexto = String.valueOf(edad);
        System.out.println("edadTexto = " + edadTexto);

        var charCaracter = "hola".charAt(0);

        System.out.println("charCaracter = " + charCaracter);
    }
}

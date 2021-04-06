import java.util.Scanner;

//Solicitar al usuario dos valores, y determinar cual número es el mayor
public class NumeroMayor {

    public static void main(String[] args){
        int numero1, numero2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Proporcione el primer numero:");
        numero1 = Integer.parseInt(sc.nextLine());

        System.out.println("Proporcione el segundo numero:");
        numero2 = Integer.parseInt(sc.nextLine());

        var mayor = (numero1 > numero2) ? numero1 :numero2;
        System.out.println("El numero mayor  es = " + mayor);
    }
}

import java.util.Scanner;

public class tipoBoolean {

    public static void main(String[] args){
        /*Ahora vamos a tocar el tema de boolean, son los considerados banderas
        * solo retorna verdadero o falso*/


        int edad ;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca su edad ");
        edad = sc.nextInt();


        if ( edad>= 18)
            System.out.println("Es maryor de Edad");
        else System.out.println("No es mayor de Edad");
    }
}

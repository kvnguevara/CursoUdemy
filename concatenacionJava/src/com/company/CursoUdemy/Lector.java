import java.util.Scanner;

/**
 * En esta clase vamos a interecturar con la consola para solicitar la informacion al usuario
 * así las clases serán más interesantes*/
public class Lector {

    public static void main(String args []){

        //vamos a solicitar la información al usuario
        var titulo ="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Proporciona el Titulo:");
        titulo = sc.nextLine();

        System.out.println("Proporciona el Autor:");
        var autor = sc.nextLine();
        System.out.println(titulo+" fue escrito por "+autor );


    }
}

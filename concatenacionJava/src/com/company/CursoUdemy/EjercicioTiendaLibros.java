import java.util.Scanner;

public class EjercicioTiendaLibros {
    /*
    * Se solicita capturar la siguiente información de una tienda de libros:

    nombre (String)

    id (int)

    precio (double)

    envioGratuito (boolean)*/

    public static void main(String[] args){
        String nombre;
        int id;
        double precio;
        boolean envio;
        Scanner sc = new Scanner(System.in);

        //Solicito la informacion del usuario
        System.out.println("Introduzca el nombre:");
        nombre = sc.nextLine();
        System.out.println("Introduzca el ID ;");
        id = sc.nextInt();
        System.out.println("Introduzca el Precio:");
        precio = sc.nextDouble();
        envio = false;
        if(precio > 100)
        {
            envio = true;
            System.out.println(nombre);
            System.out.println(id);
            System.out.println(precio);
            System.out.println("Envio Gratuito:"+envio);
        }else{

            System.out.println(nombre);
            System.out.println(id);
            System.out.println(precio);
            System.out.println("Envio Gratuito:"+envio);
        }

    }
}

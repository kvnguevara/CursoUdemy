package operaciones;

import java.util.Scanner;

public class PruebaCaja {

    public static void main(String[] args){

        //ObjetoCaja
        Caja caja = new Caja(3,2,6);
        Caja caja1 = new Caja();
        caja.volumen();


        //Pidiendo nosotros los datos
        var ancho = 0;
        var alto = 0;
        var profundo = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el Ancho:");
        ancho = Integer.parseInt(sc.nextLine());
        System.out.println("Introduzca el Alto:");
        alto = Integer.parseInt(sc.nextLine());
        System.out.println("Introduzca lo profundo: ");
        profundo = Integer.parseInt(sc.nextLine());

        //Asignacion de datos
        caja1.ancho = ancho;
        caja1.alto = alto;
        caja1.profundo = profundo;

        //Muestro el volumen con los nuevos datos
        caja1.volumen();
    }
}

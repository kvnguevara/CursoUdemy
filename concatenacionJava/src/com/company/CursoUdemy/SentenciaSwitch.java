import java.util.Scanner;

public class SentenciaSwitch {

    public static void main(String[] args){
        int numero ;
        var numeroTexto ="Desconocido";
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el numero ");
        numero = Integer.parseInt(sc.nextLine());

        switch (numero){
            case 1: numeroTexto= "Numero uno"; break;
            case 2: numeroTexto = "numero dos"; break;
            case 3: numeroTexto = "Numero tres"; break;
            case 4: numeroTexto = "Numero cuatro"; break;
            default: numeroTexto = "Numero Desconocido";
        }
        System.out.println("numeroTexto = " + numeroTexto);

        //Ejercicio de la estación
        var mes = 1;
        System.out.println("Introduzca la estacion:");
        mes = Integer.parseInt(sc.nextLine());
        var estacion = "Estacion Desconocida";

        switch(mes){
            case 1: case 2: case 12:
                estacion = "Invierno"; break;
            case 3: case 4: case 5: estacion = "Primavera"; break;
            case 6: case 7: case 8: estacion = "Verano"; break;
            case 9: case 10: case 11: estacion = "Otonio"; break;
            default: estacion = "No encontrada";
        }
        System.out.println("estacion = " + estacion);
    }


}

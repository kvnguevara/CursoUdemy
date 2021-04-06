import java.util.Scanner;

/**
 * Vamos a ver las sentencias de control en Java*/

public class SentenciasdeControl {

    public static void main(String[] args){
        var condition = true;
        if(condition){
            System.out.println("Condicion Verdadrera");
        }else{
            System.out.println("Condicion Falsa");
        }

        var numero = 3;
        var numeroTexto ="Numero Desconocido";
        if ( numero ==1){
            numeroTexto = "Numero 1";
        }else if (numero == 2){
            numeroTexto = "Numero 2";
        }else if (numero == 3){
            numeroTexto = "Numero 3";
        }else if(numero == 4){
            numeroTexto = "Numero 4";

        }else {
            numeroTexto = "Numero no encontrado";
        }
        System.out.println("numeroTexto = " + numeroTexto);

        //otro ejemplo de las estaciones
        var mes =1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el mes (numero):");
        mes = Integer.parseInt(sc.nextLine());
        var estacion = "Estacion desconido";
        if( mes == 1 || mes == 2 || mes== 12){
            estacion = "Invierno";
        }else if(mes== 3 || mes == 4|| mes == 5){
            estacion = "Primavera";
        }else if(mes == 6 || mes == 7 || mes == 8){
            estacion = "Verano";
        }else if(mes == 9 || mes ==10 || mes == 11){
            estacion = "Otonio";
        }
        System.out.println("estacion = " + estacion);

    }
}

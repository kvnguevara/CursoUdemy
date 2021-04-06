import java.util.Scanner;

/**
 * El objetivo del ejercicio es crear un sistema de calificaciones, como sigue:
 *
 * El usuario proporcionará un valor entre 0 y 10.
 *
 * Si está entre 9 y 10: imprimir una A
 *
 * Si está entre 8 y menor a 9: imprimir una B
 *
 * Si está entre 7 y menor a 8: imprimir una C
 *
 * Si está entre 6 y menor a 7: imprimir una D
 *
 * Si está entre 0 y menor a 6: imprimir una F
 *
 * cualquier otro valor debe imprimir: Valor desconocido
 *
 * Por ejemplo:
 *
 *     Proporciona un valor entre 0 y 10:
 *     A*/

public class EjercicioSwitch {

    public static void main(String[] args){
        int valor;
        var letraValor = "Valor Desconocido";
        Scanner sc = new Scanner(System.in);

        // Solicito la informacion al usuario
        System.out.println("Proporcione un valor entre 0 y 10:");
        valor = Integer.parseInt(sc.nextLine());

        if(valor >= 0 && valor <6 ){
            letraValor = "F";
        }else if (valor >= 6 && valor < 7){
            letraValor = " D";
        }else if (valor >= 7 && valor < 8){
            letraValor = "C";
        }else if (valor >= 8 && valor < 9){
            letraValor = "B";
        }else if (valor ==9  && valor == 10){
            letraValor = "A";
        }
        System.out.println(letraValor);

    }
}

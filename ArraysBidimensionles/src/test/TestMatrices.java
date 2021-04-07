package test;

import java.util.Scanner;

public class TestMatrices {
    public static void main(String[] args) {
        //Creacion de la matriz
        int edades [][] = new int[3][2];

        Scanner sc = new Scanner(System.in);
        //para rellenarlo tenemos que hacerlo con dos for, una por fila y otro de columna
        for (int fila = 0; fila  < edades.length; fila ++){
            for (int col =0; col < edades[fila].length; col++){ //para saber la longuitud de la columna

                //Pedimos que rellene la matriz
                edades[fila][col] = fila *25;

            }
        }

        // Para mostrar la Matriz
        for (int fila = 0; fila  < edades.length; fila ++){
            for (int col =0; col < edades[fila].length; col++){ //para saber la longuitud de la columna
                //Mostramos lo que tiene la martiz
                System.out.println("Edad :["+fila+"]["+col+"] ="+edades[fila][col] );
            }
        }


        //Creación y relleno de la matriz a la hora de crearlo
        String [][]frutas = {{"Naranja","Limon"},{"Fresa","Mora"}};

        //Mostramos la matriz de frtuas
        /*for (int fila = 0; fila  < frutas.length; fila ++){
            for (int col =0; col < frutas[fila].length; col++){ //para saber la longuitud de la columna
                //Mostramos lo que tiene la martiz
                System.out.print("{"+frutas[fila][col]+"}" );
            }
            System.out.println();
        }*/

        
        //AHora con el for each
        /*for (String[] f: frutas) {
            for (String x:f) {
                System.out.println("{"+x+"}");
            }
        }*/
        imprimir(frutas);


    }

    //Metodo para imprimir cualquier Objecto en Java
    public static void imprimir(Object obj[][]){
        //AHora con el for each
        for (Object[] f: obj) {
            for (Object x:f) {
                System.out.println("{"+x+"}");
            }
        }
    }
}

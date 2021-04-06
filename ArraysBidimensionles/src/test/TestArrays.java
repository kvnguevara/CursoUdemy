package test;

public class TestArrays {
    public static void main(String[] args) {
        int edades[] = new int[3];
        System.out.println(edades);
        //vamos a rellenar los indices del array.
        //edades[0] = 10; // tenemos que ir uno a uno para rellenar
       // System.out.println(edades[0]);

        //Para rellenarlos utilizamos el bucle for
        for (int i = 0; i < edades.length; i++){
            edades[i] = i +1;
        }

        // para mostrar el Array
        for (int j = 0; j < edades.length; j++){
            System.out.println("La posicion edades["+ j +"] = "+edades[j] );
        }
    }
}

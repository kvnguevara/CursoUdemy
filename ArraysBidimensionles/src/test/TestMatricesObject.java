package test;

import domain.Persona;

import java.util.Scanner;

public class TestMatricesObject {
    public static void main(String[] args) {
        //Creacion de las matrices de objetos
        Persona personas[][]  = new Persona[2][3];
        Scanner sc = new Scanner(System.in);
        String nombre;

        for(int  i = 0 ; i < personas.length; i++){

            for(int j = 0; j < personas[i].length; j++){
                personas[i][j]= new Persona();
                System.out.println("Introduza nombre :["+ i +"]["+ j +"]");
                personas[i][j].setNombre(sc.nextLine());

            }
        }

        for (Persona[] n: personas) {
            for (Persona p :n) {
                System.out.println(p.toString());
            }
        }
    }
}

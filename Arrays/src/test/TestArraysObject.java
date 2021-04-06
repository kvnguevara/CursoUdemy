package test;

import domain.Persona;

public class TestArraysObject {
    public static void main(String[] args) {
        //definimos el array de objetos
        Persona personas[] = new Persona[2];
        personas[0] = new Persona("Kevin Guevara");
        System.out.println(personas[0]);

        //Para hacerlo de forma automatica y de forma más rápidaç
        //lo hacemos con for
        for (int i =0; i < personas.length; i++){
            personas[i] = new Persona("Kevin "+(i+1));
        }

        //Vamos a mostrar los datos del arrayObject
        /*
        for (int j =0; j < personas.length; j++){
            System.out.println(personas[j].toString());
        } */
        for (Persona p:  personas) {
            System.out.println(p.toString());
        }
    }
}

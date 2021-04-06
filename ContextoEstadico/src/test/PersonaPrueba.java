package test;

import dominio.Persona;

public class PersonaPrueba {

    public static void main(String[] args) {
         Persona persona1 = new Persona("Kevin");
         Persona persona2 = new Persona("Luisa");

        //System.out.println(persona1); // como hemos creado el metodo toString, vemos que ya no imprime la memoria
        //System.out.println(persona2);
        imprimir(persona1);
        imprimir(persona2);




    }
    public static void imprimir(Persona p){
        System.out.println(p);
    }
}

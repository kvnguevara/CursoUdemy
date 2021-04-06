package test;
import dominio.Persona;

import java.util.Scanner;

public class PersonaPrueba {
    public static void main(String[] args) {
        //Creacion del Objeto con el constructor sobrecargado
        Persona persona1 = new Persona("Juan",5000,false);
        Persona persona2 = new Persona();
        String nombre;
        double sueldo;
        boolean eliminado;
        Scanner sc = new Scanner(System.in);

        //Para asignar informacion o mostrar informacion de la persona, tenemos que utlizar los
        // metodos gett o sett
        System.out.println("Persona nombre:"+persona1.getNombre());
        //Modificamos el nombre
        persona1.setNombre( "Juan Carlos");
        System.out.println("Nombre cambiado de la persona:"+persona1.getNombre());
        System.out.println("Persona sueldo:"+persona1.getSueldo());
        System.out.println("Persona Eliminada:"+persona1.isEliminado());

        //Otra forma

        System.out.println("Introduzca el nombre:");
        nombre = sc.nextLine();
        System.out.println("Introduzca el Sueldo:");
        sueldo = sc.nextDouble();
        System.out.println("Esta elimindado:");
        eliminado = false;
        //Asignamos los valor a la nueva persona

        persona2.setNombre(nombre);
        persona2.setSueldo(sueldo);
        persona2.setEliminado(eliminado);

        System.out.println(persona2.toString());

    }
}

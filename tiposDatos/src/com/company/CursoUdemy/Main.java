package com.company.CursoUdemy;

public class Main {

    public static void main(String[] args) {
        //Definicion de Variables

        int miVariableEntera = 10;
        String miVariableCadena = "Saludos";
        var _CadenaEntera = 10;
        var $miCadenaString = "hola";


        System.out.println(miVariableEntera);

        //ahora vamos a modificar el valor de la variable
        miVariableEntera = 5;
        System.out.println(miVariableEntera);


        System.out.println(miVariableCadena);

        //ahora decimos adios
        miVariableCadena = "Adios";
        System.out.println(miVariableCadena);

        //utilizamos la var como si fuera entero
        var miVariableEntera2 = 33;
        System.out.println("miVariableEntera2 = " + miVariableEntera2);

        //Ahora vamos a utilizar el var como si fuera String
        var miVariableCadena2 = "Nueva Cadena, con Var";
        System.out.println("miVariableCadena2 = " + miVariableCadena2);

    }
}

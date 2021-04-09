package com.gm.mundopc;

import java.util.Arrays;

public class Orden {
    private int idOrdenes;
    private Computadora computadora[];
    private int contadorComputadora;
    private static int contadorOrdenes;
    private static final int MAX_COMPUTADORAS = 10;

    //inicializo el array y el contador
    public Orden() {
        this.idOrdenes = ++Orden.contadorOrdenes;
        this.computadora = new Computadora[Orden.MAX_COMPUTADORAS];
    }
    public void agreagarComputador(Computadora c){
        if (contadorComputadora < Orden.MAX_COMPUTADORAS){
            this.computadora[contadorComputadora++] = c;

        } else {
            System.out.println("Ha superado el numero de Computadoras:"+Orden.MAX_COMPUTADORAS);
        }

    }

    public void mostrarOrden(){
        System.out.println("IdOrden:"+this.idOrdenes);
        for (int i = 0; i < contadorComputadora;i++){
            System.out.println(this.computadora[i].toString());
        }
    }
}

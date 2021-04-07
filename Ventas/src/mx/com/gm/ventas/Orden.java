package mx.com.gm.ventas;

import java.util.Scanner;

public class Orden {
    private int idOrden;
    private Producto productos[];
    private static int contadorOrdenes;
    private static int MAX_PRODUCTOS = 10;
    private int contadorProductos; //para saber cuantos productos llevamos añadidos al array


    //Constructores

    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        this.productos= new Producto[Orden.MAX_PRODUCTOS];
    }

    //Metodos
    public void  agregarProdcuto(Producto p){
        Scanner sc = new Scanner(System.in);
        if(this.contadorProductos < Orden.MAX_PRODUCTOS){
            this.productos[this.contadorProductos++] = p;

        }else {
            System.out.println("A superado el numero maximo de productos "+Orden.MAX_PRODUCTOS);
        }


    }
    /**
     *Metodo que retorna el total de la orden */
    public double calcularTotal(){
        double total =0;
        for (int i =0; i < this.contadorProductos ; i ++){
            total += this.productos[i].getPrecio();

        }
        return total;
    }

    /**
     **/

    public void mostrarOrdern(){
        System.out.println("Id Orden: "+this.idOrden);
        System.out.println("Total de la orden: "+this.calcularTotal());
        for(int i = 0; i < this.contadorProductos; i++){
            System.out.println(this.productos[i]);

        }

    }

}

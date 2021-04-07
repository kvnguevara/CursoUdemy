package mx.com.gm.ventastest;

import mx.com.gm.ventas.*;

public class TestVenta {
    public static void main(String[] args) {

        Producto p = new Producto("Camisa", 50.00);
        Producto p1 = new Producto("Pantalon", 100.00);
        Producto p2 = new Producto("Jean", 72.20);
        Producto p3 = new Producto("Short", 85.20);
        Producto p4 = new Producto("Zapatillas", 152.70);

        //Creamos la orden y vamos agregar producto a la orden
        Orden or = new Orden();
        or.mostrarOrdern();
        or.agregarProdcuto(p);
        or.agregarProdcuto(p1);
        or.agregarProdcuto(p2);
        or.mostrarOrdern();
        

    }
}

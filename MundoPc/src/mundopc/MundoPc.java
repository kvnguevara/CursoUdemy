package mundopc;

import com.gm.mundopc.*;

public class MundoPc {
    public static void main(String[] args) {
        /* String nombre;
        String marca;
        double tamano;*/
        //Crear la clase raton, teclado,orden, computadora
        Raton r = new Raton("Cable","Mars Gamming");
        Teclado t = new Teclado("Bluetooh","Mars Gamming");
        Monitor m = new Monitor("Samsung",25.0);
        //
        Raton r1 = new Raton("Cable","Mars Gamming");
        Teclado t1 = new Teclado("Bluetooh","Mars Gamming");
        Monitor m1 = new Monitor("Samsung",25.0);
        //Computadora(String nombre, Monitor monitor, Raton raton, Teclado teclado)
        Computadora c = new Computadora("Xiaomi",m,r,t);
        Computadora c1 = new Computadora("Lenovo",m1,r1,t1);
        Computadora c2 = new Computadora("Mac",m,r,t);
        Computadora c3 = new Computadora("Google g1",m,r,t);
        Computadora c4 = new Computadora("Dell aleinware",m,r,t);

        Orden or = new Orden();

        or.agreagarComputador(c);
        or.agreagarComputador(c1);
        or.agreagarComputador(c2);
        or.agreagarComputador(c3);
        or.agreagarComputador(c4);

        //Muestro la orden
        or.mostrarOrden();






    }
}

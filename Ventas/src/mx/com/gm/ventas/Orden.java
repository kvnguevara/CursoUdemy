package mx.com.gm.ventas;

public class Orden {
    private int idOrden;
    private Producto productos[];
    private static int contadorOrdenes;

    public static int MAX_PRODUCTOS = 10;

    //Constructores

    public Orden() {
        ++contadorOrdenes;
        Producto productos[] = new Producto[MAX_PRODUCTOS];
    }
    //Metodos
    public void  agregarProdcuto(Producto p){
        if(p.getIdProducto() < MAX_PRODUCTOS){

        }else {
            System.out.println("A superado el numero maximo de productos");
        }


    }
    /**
     * @param producto para calcular toda la suma de la orden*/
    public double calcularTotal(Producto producto[]){
        double total =0;
        for (int i =0; i < productos.length ; i ++){
            total += productos[i].getPrecio();

        }
        return total;
    }

    /**
     * @param p para Mostrar la orden*/

    public void mostrarOrdern(Producto p[]){
        for(Producto x: p){
            System.out.println(x.toString());

        }

    }

}

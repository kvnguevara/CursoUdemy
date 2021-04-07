package mx.com.gm.ventas;

public class Producto {
    /*id
    * nombre
    * precio
    * metodos gettt y set
    * mostrar*/
    private int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProducto;

    private Producto() {

        this.idProducto = ++Producto.contadorProducto;
    }

    public Producto(String nombre, double precio) {
        this(); //Llamada del constructor interno
        this.nombre = nombre;
        this.precio = precio;
    }
    // Metodos get and setter

    /**
     * Gets nombre.
     *
     * @return Value of nombre.
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Sets new nombre.
     *
     * @param nombre New value of nombre.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Gets precio.
     *
     * @return Value of precio.
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Gets idProducto.
     *
     * @return Value of idProducto.
     */
    public int getIdProducto() {
        return idProducto;
    }

    /**
     * Sets new precio.
     *
     * @param precio New value of precio.
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Producto{");
        sb.append("idProducto=").append(idProducto);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", precio=").append(precio);
        sb.append('}');
        return sb.toString();
    }
}

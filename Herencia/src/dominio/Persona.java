package dominio;

public class Persona {
    //Atributos
    protected String nombre;
    protected char genero;
    protected int edad;
    protected String direccion;

    //Constructor vacio
    public Persona() {

    }

    public Persona(String nombre){
        this.nombre = nombre;
    }

    //Constructor sobrecargado

    public Persona(String nombre, char genero, int edad, String direccion) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
    }

    //Metodos gett and setter


    /**
     * Sets new direccion.
     *
     * @param direccion New value of direccion.
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Sets new edad.
     *
     * @param edad New value of edad.
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Sets new genero.
     *
     * @param genero New value of genero.
     */
    public void setGenero(char genero) {
        this.genero = genero;
    }

    /**
     * Gets genero.
     *
     * @return Value of genero.
     */
    public char getGenero() {
        return genero;
    }

    /**
     * Gets nombre.
     *
     * @return Value of nombre.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Gets edad.
     *
     * @return Value of edad.
     */
    public int getEdad() {
        return edad;
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
     * Gets direccion.
     *
     * @return Value of direccion.
     */
    public String getDireccion() {
        return direccion;
    }

    //Metodo del estado del Objeto


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Persona{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", genero=").append(genero);
        sb.append(", edad=").append(edad);
        sb.append(", direccion='").append(direccion).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

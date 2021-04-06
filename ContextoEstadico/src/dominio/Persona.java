package dominio;

public class Persona {

    private String nombre;
    private int idPersona;
    private static int contadorPersona; // este será el contador cada vez que se cree un objeto nuevo

    public Persona(String nombre ) {
        this.nombre = nombre;
        //Incrementamos el contador de Persona, para ello tenemos que poner la clase y el contador
        Persona.contadorPersona++;
        //Asignamos el id que ya ha sido incrementado previamente
        this.idPersona = Persona.contadorPersona;

    }
    //Metodos gett and setter

    /**
     * Sets new idPersona.
     *
     * @param idPersona New value of idPersona.
     */
    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
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
     * Sets new nombre.
     *
     * @param nombre New value of nombre.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Gets idPersona.
     *
     * @return Value of idPersona.
     */
    public int getIdPersona() {
        return idPersona;
    }
    /**
     * Sets new contadorPersona.
     *
     * @param contadorPersona New value of contadorPersona.
     */
    public static void setContadorPersona(int contadorPersona) {
        contadorPersona = contadorPersona;
    }

    /**
     * Gets contadorPersona.
     *
     * @return Value of contadorPersona.
     */
    public static int getContadorPersona() {
        return contadorPersona;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", idPersona=" + idPersona +
                '}';
    }
}

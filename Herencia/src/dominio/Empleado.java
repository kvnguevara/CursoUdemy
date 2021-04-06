package dominio;

public class Empleado  extends Persona{
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;

    //Constructor
    public Empleado(){
        //super(); se hace una llamada a super, de forma interna
        this.idEmpleado = ++Empleado.contadorEmpleado;
    }


    public Empleado(String nombre, double sueldo) {

        super(nombre);
        this.idEmpleado = ++Empleado.contadorEmpleado;
        this.sueldo = sueldo;
    }

    public Empleado(String nombre, char genero, int edad, String direccion, double sueldo) {
        super(nombre, genero, edad, direccion);
        this.idEmpleado = ++Empleado.contadorEmpleado;
        this.sueldo = sueldo;
    }

    //Metodos gett and setter.

    /**
     * Sets new sueldo.
     *
     * @param sueldo New value of sueldo.
     */
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    /**
     * Gets idEmpleado.
     *
     * @return Value of idEmpleado.
     */
    public int getIdEmpleado() {
        return this.idEmpleado;
    }

    /**
     * Gets sueldo.
     *
     * @return Value of sueldo.
     */
    public double getSueldo() {
        return this.sueldo;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Empleado{");
        sb.append("idEmpleado=").append(this.idEmpleado);
        sb.append(", sueldo=").append(this.sueldo);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}

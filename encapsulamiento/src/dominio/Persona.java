package dominio;

public class Persona {

    private String nombre;
    private double sueldo;
    private boolean eliminado;


    //Constructores
    public Persona(String nombre, double sueldo, boolean eliminado) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.eliminado = eliminado;
    }

    public Persona() {
    }

    //Metodos get and setter

    //Metodo get, para recuperar o retornar la informacion de los atributos

    public String getNombre() {
        return nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public boolean isEliminado() {
        return eliminado;
    }

    //Metodos setter, nos sirve para dar valor a los atributos

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }

    public String toString() { return  "Persona [ Nombre: "+this.nombre+""
        +" Sueldo:" +this.sueldo+""
        +" Eliminado: "+this.eliminado+"]";}
}

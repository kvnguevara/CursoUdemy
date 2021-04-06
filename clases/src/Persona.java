public class Persona {

    //Atributos
    public String nombre;
    public String apellidos;

    public Persona() {
    }

    public Persona(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }
    //Metodoos de la clase
    public void desplegarInformacion() {
        System.out.println("nombre = " + nombre);
        System.out.println("apellidos = " + apellidos);
    }
}

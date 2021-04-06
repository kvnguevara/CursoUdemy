package domian;

public class Persona {
    private String nombre;
    public static final  int MI_CONSTANTE = 150;
    public  void imprimir(){
        System.out.println("Metodo de imprimir");

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

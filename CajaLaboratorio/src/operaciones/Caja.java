package operaciones;
/*Se solicita crear una clase llamada Caja con las siguientes características:
• Debe tener 3 atributos de tipo entero (ancho, alto y profundo)
• Debe tener 2 constructores, uno vacío y uno con 3 argumentos, uno
por cada atributo de la clase.
• Debe tener el método que calcule el volumen de la caja según la
formula de la lámina anterior.
• Crear una clase de prueba para crear un objeto de tipo caja que tenga
como valores: ancho=3, alto= 2, profundo = 6 y que mande a imprimir
el volumen de la caja según los valores proporcionados
anteriormente
volumen= ancho*alto*profundo*/

public class Caja {
    //Atributos de la clase
    int ancho;
    int alto;
    int profundo;

    //Creacion de los constructores
    //Constructo por defecto
    public Caja() {
    }

    //Constructor Sobrecargado
    public Caja(int ancho, int alto, int profundo) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }

    //Metodos de la clase
    public void volumen(){
        System.out.println("El volumen es: "+volumenRetorno());
    }
    public int volumenRetorno(){
        return alto*ancho*profundo;
    }
}

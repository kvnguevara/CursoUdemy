
public class Main {

    public static void main(String[] args) {
	// Definicion de variables
        var usuario = "Kevin";
        var titulo = "Informatico";

        var union = titulo + " "+ usuario;
        System.out.println("union = " + union);

        //Concatenacion con numeros
        var i = 3;
        var j = 4;

        System.out.println(i + j); // realiza la suma
        System.out.println(i + j + usuario); // realiza suma y luego concatena
        System.out.println(usuario + i + j); // concatena valores y no realiza la suma
        System.out.println(usuario + (i+j) ); // concatena valores + la suma
    }
}

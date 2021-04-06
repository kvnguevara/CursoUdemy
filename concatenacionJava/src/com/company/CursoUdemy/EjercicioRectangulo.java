import java.util.Scanner;

/*
* En el siguiente ejercicio se solicita calcular el área y el perímetro de un Rectángulo, para ello deberemos crear las siguientes variables:

    alto (int)

    ancho (int)

El usuario debe proporcionar los valores de largo y ancho, y después se debe imprimir el resultado en el siguiente formato(no usar acentos y respetar los espacios, mayúsculas, minúsculas y saltos de línea):

    Proporciona el alto:
    Proporciona el ancho:
    Area: <area>
    Perimetro: <perimetro>

Las fórmulas para calcular el área y el perímetro de un Rectángulo son:

Área: alto * ancho

Perímetro: (alto + ancho) * 2

Puedes utilizar el IDE de tu preferencia para codificar la solución y después pegar tu solución en esta herramienta.*/
public class EjercicioRectangulo {

    public static void main(String[] args){
        int alto, ancho;
        Scanner sc = new Scanner(System.in);

        System.out.println("Proporciona el alto:");
        alto = sc.nextInt();
        System.out.println("Proporciona el ancho:");
        ancho = sc.nextInt();
        var area = alto * ancho;

        System.out.println("Area: "+area);
        System.out.println("Perimetro: "+(area * 2));
    }
}

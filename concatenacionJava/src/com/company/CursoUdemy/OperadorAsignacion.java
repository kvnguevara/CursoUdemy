public class OperadorAsignacion {

    public static void main(String[] args){
        int a =3, b = 2;
        int c = a + 5 -b;
        System.out.println("El valor de c es :"+ c);

        // incrementar una unidad o mas valores a una variables

        a += 1; // a = a + 1;
        System.out.println("El va lor de a:"+a);

        a += 3; // a = a +3;
        System.out.println("EL valor de a incrementado 3 undidades"+a);

        // tambien se pueder decrementar(restar)

        a -= 1; // a = a -1;
        System.out.println("El valor de a decrementando 1 unidad;"+a);
        a -= 2; //a = a- 2;

        System.out.println("El valor de a decrementado en 2:"+a);

        // Multiplicacion
        a *= 2;
        System.out.println("El valor de a x 2 ="+a);

        //Division
        a /=2;
        System.out.println("El valor de a / 2="+a);

        //Resto
        a %=2;
        System.out.println("El resto de a % 2= "+a);
    }
}

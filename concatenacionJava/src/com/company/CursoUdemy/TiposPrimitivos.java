/**
 * En está clase vamos a utlizar los enteros en java
 * byte, short, int, long*/

public class TiposPrimitivos {

    public static void main(String[] args){
        //valor minimo y maximo de un byte
        byte numeroByte= 10;
        System.out.println("El valor minimo de byte es:"+ Byte.MIN_VALUE );
        System.out.println("El valor maximo es:"+ Byte.MAX_VALUE);
        System.out.println(numeroByte);

        short numeroShort= 10;
        System.out.println("El valor minimo de byte es:"+ Short.MIN_VALUE );
        System.out.println("El valor maximo es:"+ Short.MAX_VALUE);
        System.out.println(numeroShort);

        int numeroInt= 15550;
        System.out.println("El valor minimo de byte es:"+ Integer.MIN_VALUE );
        System.out.println("El valor maximo es:"+ Integer.MAX_VALUE);
        System.out.println(numeroInt);


        long numeroLong = 155555;
        System.out.println("El valor minimo de byte es:"+ Long.MIN_VALUE );
        System.out.println("El valor maximo es:"+ Long.MAX_VALUE);
        System.out.println(numeroLong);

        /*
        * Son los que más tiene capacidad
        * son utilizados para los exponentes*/

        System.out.println("Tipo Primitivo, como Flotante");
        float numeroFloat = 3.48888F;

        System.out.println(numeroFloat);
        System.out.println("El valor minimo de byte es:"+ Float.MIN_VALUE );
        System.out.println("El valor maximo es:"+ Float.MAX_VALUE);
        System.out.println(numeroFloat);

        System.out.println("Numeros Double");

        double numeroDouble = (double)54588.5555;
        System.out.println("El valor minimo de byte es:"+ Double.MIN_VALUE );
        System.out.println("El valor maximo es:"+ Double.MAX_VALUE);
        System.out.println(numeroDouble);




    }
}

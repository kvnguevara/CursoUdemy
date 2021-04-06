public class OperadoresUnarios {
    public static void main(String[] args){
        int a = 3;
        int b = -a;

        System.out.println("Valor de b = "+ b);

        //Boolean
        boolean c = true;
        boolean d = !c;
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        //Incremento
        int e = 3;
        int f = ++e; // primero incrementa el valor y luego asigna
        System.out.println("e = " + e);
        System.out.println("f = " + f);

        //2. post incremento, ++
        int g  = 5;
        int h = g++;

        // primero se utliza el valor de la variable, y luego se incrementa
        System.out.println("g = " + g);
        System.out.println("h = " + h);

        //tambien podemos hacer con el incremento, pero con el decremento
        int i = 2;
        int j = --i; //valor 1
        System.out.println("i = " + i); //valor 1
        System.out.println("j = " + j); // valor 1

        // post decremento
        int k = 4;
        int l = k--;
        System.out.println("k = " + k);
        System.out.println("l = " + l);
    }
}

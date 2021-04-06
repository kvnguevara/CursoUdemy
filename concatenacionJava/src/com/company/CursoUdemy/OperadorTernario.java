public class OperadorTernario {
    public static void main(String[] args){
        var resulta = (1>2) ? "verdadero":"Falso";
        System.out.println("resulta = " + resulta);


        var numero = 8;
        resulta = (numero %2 ==0)? "Es par ":"No es Par";

        System.out.println("resulta = " + resulta);
    }
}

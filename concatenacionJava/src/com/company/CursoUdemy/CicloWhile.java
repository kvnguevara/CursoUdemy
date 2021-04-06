public class CicloWhile {

    public static void main(String[] args){

        var contador = 0;

        while (contador < 3){
            System.out.println("Contador:" + contador);
            contador++;
        }
        contador = 0;

        do {
            System.out.println("Contador de Do-While: "+ contador);
            contador++;
        }while(contador < 0);

        for(int i= 0; i < 3; i++){
            System.out.println("i = " + i);
        }
    }
}

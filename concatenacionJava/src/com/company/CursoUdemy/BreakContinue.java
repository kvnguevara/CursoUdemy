public class BreakContinue {

    public static void main(String[] args){


        for(int i= 0; i < 3; i++){
            if(i % 2 == 0){
                System.out.println("i = " + i);
            }break;
        }

        for(int j= 0; j < 3; j++){
            if(j % 2 !=0){
                continue; // ir a la siguiente interaccion
            }System.out.println("j = " + j);
        }
    }
}

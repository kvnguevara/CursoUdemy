public class OperadoresLogicos {

    public static void main(String[] args){
        var a = 8;
        var valorMinimo = 0;
        var valorMaximo = 10;

        var resultado = a>=0 && a <= 10;
        //Operadore and, ambos tienen que ser verdaderos.

        //System.out.println("resultado = " + resultado);
        if (resultado ){
            System.out.println("Dentro del Rango");
        }else {
            System.out.println("Esta fuera del Rango");
        }

        //OR
        var vacaciones = true;
        var diaDescanso = false;
        if(vacaciones || diaDescanso){
            System.out.println("Padre puede asistir al partido ");
        }else{
            System.out.println("No puede asistir al partido");
        }
    }
}

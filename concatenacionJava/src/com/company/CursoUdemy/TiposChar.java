public class TiposChar {

    public static void main(String[] args){
        // solo almacena un caracter,que se rigen por el UNICODE
        char caracterChar = 'a';
        System.out.println("caracterChar = " + caracterChar);

        char varChar ='\u0021';
        System.out.println("varChar = " + varChar);

        char varCharDecimal = 33;
        System.out.println("varCharDecimal = " + varCharDecimal);

        // ahora vamos a utilizar la variable VAR
        System.out.println("Ahora lo haremos con Var" );

        // solo almacena un caracter,que se rigen por el UNICODE
        var varcaracterChar = 'a';
        System.out.println("caracterChar = " + varCharDecimal);

        var  varCharvar ='\u0021';
        System.out.println("varChar = " + varCharvar);

        var  varCharDecimalvar = 33;
        System.out.println("varCharDecimal = " + varCharDecimalvar);

        int variable = 'a';
        System.out.println("variable = " + variable);

    }
}

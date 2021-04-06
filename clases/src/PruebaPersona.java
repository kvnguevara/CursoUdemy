public class PruebaPersona {

    public static void main(String[] args){

        Persona persona = new Persona();

        persona.nombre = "Kevin";
        persona.apellidos = "Guevara";
        persona.desplegarInformacion();

        Persona persona1 = new Persona();

        //Mostramos el espacio reservado de RAM
        System.out.println("Persona 1:"+persona);
        System.out.println("Persona 2:"+persona1);

        persona1.nombre ="Lara";
        persona1.apellidos = "Fernandez";

        //Mostramos la informacion
        persona1.desplegarInformacion();


    }
}

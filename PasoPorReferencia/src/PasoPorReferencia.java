
public class PasoPorReferencia {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.nombre = "Kevin";
        persona.apellidos ="guevara";
        persona.desplegarInformacion();
        cambiardeValor(persona);
        System.out.println("Informacion cambiada de la persona");
        persona.desplegarInformacion();
        System.out.println("Cambio de Valores de todo el Objeto");
        persona = cambiarValor(persona);
        persona.desplegarInformacion();

    }
    public static void cambiardeValor(Persona persona){
        persona.nombre = "Luis";
        persona.apellidos = "Gonzalez";

    }
    public static Persona cambiarValor (Persona persona){
        persona.nombre ="Jose luis";
        persona.apellidos = "Herrera";
        return persona;

    }
}

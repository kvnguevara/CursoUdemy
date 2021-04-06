package test;

import domian.Persona;

public class TestFinally {
    public static void main(String[] args) {
        final int miVariable = 10;
        final Persona persona = new Persona();
        System.out.println(miVariable);
        System.out.println(Persona.MI_CONSTANTE);
        System.out.println(persona.getNombre());
        persona.setNombre("Kevin");
        System.out.println(persona.getNombre());

    }
}

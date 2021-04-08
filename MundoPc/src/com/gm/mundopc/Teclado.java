package com.gm.mundopc;

public class Teclado extends DispositivoEntrada{
    private int idTeclado;
    private static int contadorTeclado;

    public Teclado(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idTeclado = ++Teclado.contadorTeclado;
    }
    //Metodo to String


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Teclado{");
        sb.append('}');
        sb.append(super.toString());
        return sb.toString();
    }
}

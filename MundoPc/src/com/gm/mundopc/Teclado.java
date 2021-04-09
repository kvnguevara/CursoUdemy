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
        final StringBuffer sb = new StringBuffer("{");
        sb.append(", ID-Teclado,").append(this.idTeclado);
        sb.append(super.toString());
        return sb.toString();
    }
}

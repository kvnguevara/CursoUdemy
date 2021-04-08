package com.gm.mundopc;

public class Raton extends  DispositivoEntrada{
    private int idRaton;
    private static int contadorRaton;

    public Raton() {

    }

    public Raton(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idRaton = ++Raton.contadorRaton;

    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Raton{");
        sb.append("idRaton=").append(idRaton);
        sb.append('}');
        sb.append(super.toString());
        return sb.toString();
    }
}

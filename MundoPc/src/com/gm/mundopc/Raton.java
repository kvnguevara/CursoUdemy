package com.gm.mundopc;

public class Raton extends  DispositivoEntrada{
    private int idRaton;
    private static int contadorRaton;

    public Raton(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idRaton = ++Raton.contadorRaton;

    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("{");
        sb.append("iDRaton=").append(idRaton);
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}

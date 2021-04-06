package dominio;

import java.util.Date;

public class Cliente extends Persona{

    private int idCliente;
    private static int contadorCliente;
    private boolean vip;
    private Date fechaRegistro;

    //Contructor Sobrecargado


    public Cliente(String nombre, char genero, int edad, String direccion,
                   boolean vip, Date fechaRegistro) {
        super(nombre, genero, edad, direccion);
        this.idCliente = ++Cliente.contadorCliente;
        this.vip = vip;
        this.fechaRegistro = fechaRegistro;
    }

    //Metodos getter and setter

    public int getIdCliente() {
        return this.idCliente;
    }

    public boolean isVip() {
        return this.vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public Date getFechaRegistro() {
        return this.fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    //Metodo del estado del Objeto


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cliente{");
        sb.append("idCliente=").append(idCliente);
        sb.append(", vip=").append(vip);
        sb.append(", fechaRegistro=").append(fechaRegistro);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", genero=").append(genero);
        sb.append(", edad=").append(edad);
        sb.append(", direccion='").append(direccion).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

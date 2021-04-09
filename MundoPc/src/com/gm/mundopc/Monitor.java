package com.gm.mundopc;

public class Monitor {
    private int idMonitor;
    private String marca;
    private double tamano;
    private static int contadroMonitores;

    //Contructores
    public Monitor() {
        this.idMonitor = ++Monitor.contadroMonitores;
    }

    public Monitor(String marca, double tamano) {
        this();
        this.marca = marca;
        this.tamano = tamano;
    }
    //Metodos
    public int getIdMonitor() {
        return idMonitor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamano() {
        return tamano;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }

    public static int getContadroMonitores() {
        return contadroMonitores;
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Monitor{");
        sb.append("idMonitor=").append(idMonitor);
        sb.append(", marca='").append(marca).append('\'');
        sb.append(", tamano=").append(tamano);
        sb.append('}');
        return sb.toString();
    }
}

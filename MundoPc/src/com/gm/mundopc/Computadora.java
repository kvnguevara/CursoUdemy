package com.gm.mundopc;

public class Computadora {
    private int idComputadora;
    private String nombre;
    private Monitor monitor;
    private Raton raton;
    private Teclado teclado;
    private static int contadorComputadora;

    //Contructores
    private Computadora() {
        this.idComputadora = ++Computadora.contadorComputadora;
    }

    public Computadora(String nombre, Monitor monitor, Raton raton, Teclado teclado) {
        this();
        this.nombre = nombre;
        this.monitor = monitor;
        this.raton = raton;
        this.teclado = teclado;
    }


    //Metodos


    public int getIdComputadora() {
        return idComputadora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Raton getRaton() {
        return raton;
    }

    public void setRaton(Raton raton) {
        this.raton = raton;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public static int getContadorComputadora() {
        return contadorComputadora;
    }


    //Metodo to String

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Computadora{");
        sb.append("idComputadora=").append(idComputadora);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(",").append(monitor.toString());
        sb.append(",").append(raton.toString());
        sb.append(",").append(teclado.toString());
        sb.append('}');
        return sb.toString();
    }
}

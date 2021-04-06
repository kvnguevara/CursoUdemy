package test;

import dominio.Cliente;
import dominio.Empleado;

import java.text.SimpleDateFormat;
import java.util.Date;

public class testEmpleado {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Kevin",25000);
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
        Date fecha = new Date();
        //Pruebas
        System.out.println(sdf.format(fecha));
        System.out.println(empleado);

        //Prueba Clientes
        Cliente cliente = new Cliente("Kevin Guevara",'m',33,"Calle Ledesma",true,fecha);
        Cliente cliente2 = new Cliente("Alejandro Martinez",'m',26,"Plaza Mayor",false,fecha);
        System.out.println(cliente.toString());
        System.out.println(cliente2.toString());

    }
}

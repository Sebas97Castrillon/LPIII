package src.package2;

import src.builder.Empleado;

public class Main {

    public static void main(String[] args) {
        Empleado empleado = Empleado.builder().nombre("Osar").build();
        System.out.println(empleado);
    }
}

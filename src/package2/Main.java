package src.package2;

import src.builder.Empleado;
import src.prototype.Estudiante;

public class Main {

    public static void main(String[] args) {
        /*Empleado empleado = Empleado.builder().nombre("Osar").build();
        System.out.println(empleado);*/

        Estudiante estudiante = new Estudiante("sebas",123L, (short) 12);

    }
}

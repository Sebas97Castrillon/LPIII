package src.strategy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);
    private static int salir = 1000;

    public static void main(String[] args) {
        Map<Integer, Accion> strategy = new AccionHandler().getStrategy();
        int opcion;
        do {
            System.out.println("Ingrese una opción");
            opcion = sc.nextInt();
            sc.nextLine();
            Accion accion = strategy.get(opcion);

            if (opcion == salir) {
                continue;
            }
            if (accion == null) {
                System.out.println("Estado opción no existe");
            } else {
                accion.aplicar();
            }
        } while (opcion != salir);
        System.out.println("Salida exitosa");
    }
}

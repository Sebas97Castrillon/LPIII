package src.package2;

import src.factory.CreadorDePizza;
import src.factory.CreadorPizzaHawaiana;
import src.factory.CreadorPizzaSalami;
import src.factory.Pizza;
import src.prototype.Estudiante;

public class Main {

    public static void main(String[] args) {
        /*Empleado empleado = Empleado.builder().nombre("Osar").build();
        System.out.println(empleado);

        Estudiante estudiante = new Estudiante("sebas",123L, (short) 12);
        Estudiante estudiante2 = (Estudiante) estudiante.clone();

        System.out.println(estudiante == estudiante2);
        System.out.println("Estudiante 1: "+ estudiante);
        System.out.println("Estudiante 2: "+ estudiante2);*/

        CreadorDePizza creadorDePizza = new CreadorPizzaSalami();
        Pizza pizza = creadorPizza(creadorDePizza);

        System.out.println(pizza.getTipoMasa()+ " " + pizza.getTipoQueso()+ " " + pizza.getTipoToppings());

    }

    public static Pizza creadorPizza(CreadorDePizza creadorPizza){
        return creadorPizza.crear();
    }
}

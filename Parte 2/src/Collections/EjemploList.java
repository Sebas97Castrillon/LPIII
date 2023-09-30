package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class EjemploList {

    public static void main(String[] args) {
        List<String> strings = new LinkedList<>();
        strings.add("Hola");
        strings.add("Chao");
        System.out.println(strings);
        strings.add(0,"Mundo");
        System.out.println(strings);
        strings.remove("Mundo");
        System.out.println(strings);
        strings.addAll(List.of("Saludo", "Despedida"));
        System.out.println("For each");
        strings.forEach(string -> System.out.println(string));
    }
}

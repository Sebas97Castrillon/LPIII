package Collections;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class EjemploMap {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(4, "AccionEliminar");
        map.put(3, "AccionMostrar");
        System.out.println(map);
        map.put(20, "AccionCualquiera1");
        map.put(11, "AccionCualquiera2");
        map.put(11, "AccionCualquiera5");
        System.out.println(map);
        System.out.println(map.get(3));
        map.forEach((key, value) -> System.out.println("Key: " + key + " -> Value: " + value));
    }
}

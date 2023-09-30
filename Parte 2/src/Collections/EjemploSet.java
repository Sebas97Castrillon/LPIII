package Collections;

import javax.swing.*;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class EjemploSet {
    public static void main(String[] args) {
        Set<Integer> integers = new TreeSet<>();
        integers.add(1);
        integers.add(2);
        integers.add(5);
        System.out.println(integers);
        integers.add(2);
        System.out.println(integers);
        integers.addAll(Set.of(2, 1, 5, 0, 6, 8));
        System.out.println(integers);
        integers.add(455);
        System.out.println(integers);
    }
}

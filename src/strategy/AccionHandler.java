package src.strategy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AccionHandler {

    private static final List<Accion> listaDeAcciones = List.of(new AccionCrear(), new AccionLeer(), new AccionActualizar(), new AccionBorrar(), new AccionBuscar());

    public static Map<Integer, Accion> getStrategy() {
        Map<Integer, Accion> strategy = new HashMap<>();
        for (Accion accion : listaDeAcciones) {
            strategy.put(accion.getOpcion(), accion);
        }
        return strategy;
    }
}

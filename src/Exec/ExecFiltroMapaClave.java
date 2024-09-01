package Exec;

import Library.Request;

import java.util.HashMap;
import java.util.Map;

public class ExecFiltroMapaClave {
    public static void main(String[] args) {
        Map<String, Integer> mapa = new HashMap<>();
        mapa.put("apple", 10);
        mapa.put("Banana", 20);
        mapa.put("carrot", 30);
        mapa.put("Date", 40);
        mapa.put("eggplant", 50);
        Map<String, Integer> mapaFiltrado = filtrarMapaPorClave(mapa, mapa.keySet().iterator(), new HashMap<>());

        Request.showMessage("Mapa con claves que comienzan con letra minúscula:");
        for (Map.Entry<String, Integer> entry : mapaFiltrado.entrySet()) {
            Request.showMessage(entry.getKey() + " => " + entry.getValue());
        }
    }

    public static Map<String, Integer> filtrarMapaPorClave(Map<String, Integer> mapa, java.util.Iterator<String> iterador, Map<String, Integer> resultado) {
        if (!iterador.hasNext()) {
            return resultado;
        }

        String claveActual = iterador.next();
        if (!claveActual.isEmpty() && Character.isLowerCase(claveActual.charAt(0))) {
            resultado.put(claveActual, mapa.get(claveActual));
        }

        return filtrarMapaPorClave(mapa, iterador, resultado);
    }
}

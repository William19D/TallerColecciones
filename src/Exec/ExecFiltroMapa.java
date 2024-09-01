package Exec;

import Library.Request;

import java.util.HashMap;
import java.util.Map;

public class ExecFiltroMapa {
    public static void main(String[] args) {
        Map<Integer, String> mapaOriginal = new HashMap<>();
        mapaOriginal.put(1, "Uno");
        mapaOriginal.put(2, "Dos");
        mapaOriginal.put(3, "Tres");
        mapaOriginal.put(4, "Cuatro");
        mapaOriginal.put(5, "Cinco");

        Map<Integer, String> mapaFiltrado = filtrarClavesPares(mapaOriginal);

        Request.showMessage("Mapa filtrado con claves pares:");
        for (Map.Entry<Integer, String> entrada : mapaFiltrado.entrySet()) {
            Request.showMessage(entrada.getKey() + " -> " + entrada.getValue());
        }
    }

    public static Map<Integer, String> filtrarClavesPares(Map<Integer, String> mapa) {
        return filtrarClavesParesRecursivo(mapa, mapa.keySet().toArray(new Integer[0]), 0);
    }

    private static Map<Integer, String> filtrarClavesParesRecursivo(
            Map<Integer, String> mapa, Integer[] claves, int index) {

        if (index >= claves.length) {
            return new HashMap<>();
        }

        Map<Integer, String> mapaFiltrado = filtrarClavesParesRecursivo(mapa, claves, index + 1);

        Integer claveActual = claves[index];
        if (claveActual % 2 == 0) {
            mapaFiltrado.put(claveActual, mapa.get(claveActual));
        }

        return mapaFiltrado;
    }
}

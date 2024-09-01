package Objects;

import java.util.List;

public class FiltroCadena {
    public static List<String> filtrarCadenasConMayuscula(List<String> cadenas, int indice, List<String> resultado) {
        if (indice >= cadenas.size()) {
            return resultado;
        }

        String cadenaActual = cadenas.get(indice);
        if (!cadenaActual.isEmpty() && Character.isUpperCase(cadenaActual.charAt(0))) {
            resultado.add(cadenaActual);
        }

        return filtrarCadenasConMayuscula(cadenas, indice + 1, resultado);
    }
}

package Exec;

import Library.Request;

import java.util.ArrayList;
import java.util.List;

import static Objects.FiltroCadena.filtrarCadenasConMayuscula;

public class ExecFiltrarCadenas {
    public static void main(String[] args) {
        List<String> cadenas = List.of("Hola", "mundo", "Java", "es", "Genial", "programar");

        List<String> cadenasConMayuscula = filtrarCadenasConMayuscula(cadenas, 0, new ArrayList<>());

        System.out.println("Cadenas que comienzan con letra mayúscula:");
        for (String cadena : cadenasConMayuscula) {
            Request.showMessage(cadena);
        }
    }
}

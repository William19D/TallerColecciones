package Exec;

import Library.Request;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExecIteradores {
    public static void main(String[] args) {
        Set<String> conjunto = new HashSet<>();

        conjunto.add("Manzana");
        conjunto.add("Banana");
        conjunto.add("Cereza");
        conjunto.add("Banana");

        Iterator<String> iterador = conjunto.iterator();

        Request.showMessage("Contenido del conjunto:");
        while (iterador.hasNext()) {
            Request.showMessage(iterador.next());
        }
    }
}


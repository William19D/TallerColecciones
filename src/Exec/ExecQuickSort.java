package Exec;

import Library.Request;
import Objects.Producto;

import java.util.ArrayList;
import java.util.List;

public class ExecQuickSort {
    public static void main(String[] args) {
        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto("P001", "Producto 1", 5.0));
        productos.add(new Producto("P002", "Producto 2", 15.0));
        productos.add(new Producto("P003", "Producto 3", 8.0));
        productos.add(new Producto("P004", "Producto 4", 12.0));
        productos.add(new Producto("P005", "Producto 5", 3.0));

        quickSort(productos, 0, productos.size() - 1);

        Request.showMessage("Lista ordenada de productos:");
        for (Producto producto : productos) {
            Request.showMessage(producto.toString());
        }
    }

    public static void quickSort(List<Producto> lista, int bajo, int alto) {
        if (bajo < alto) {
            int pivoteIndex = particionar(lista, bajo, alto);
            quickSort(lista, bajo, pivoteIndex - 1);
            quickSort(lista, pivoteIndex + 1, alto);
        }
    }

    private static int particionar(List<Producto> lista, int bajo, int alto) {
        Producto pivote = lista.get(alto);
        int i = bajo - 1;

        for (int j = bajo; j < alto; j++) {
            if (lista.get(j).compareTo(pivote) <= 0) {
                i++;
                intercambiar(lista, i, j);
            }
        }

        intercambiar(lista, i + 1, alto);
        return i + 1;
    }

    private static void intercambiar(List<Producto> lista, int i, int j) {
        Producto temp = lista.get(i);
        lista.set(i, lista.get(j));
        lista.set(j, temp);
    }
}

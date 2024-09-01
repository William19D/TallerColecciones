package Exec;

import Library.Request;
import Objects.Producto;

import java.util.LinkedList;
import java.util.Queue;

public class ExecFiltroCola {
    public static void main(String[] args) {
        Queue<Producto> colaOriginal = new LinkedList<>();
        colaOriginal.add(new Producto("P001", "Leche", 5.0));
        colaOriginal.add(new Producto("P002", "Huevo", 15.0));
        colaOriginal.add(new Producto("P003", "Alpinito", 8.0));
        colaOriginal.add(new Producto("P004", "Gatorade", 12.0));
        colaOriginal.add(new Producto("P005", "Nucita", 3.0));

        Queue<Producto> colaFiltrada = filtrarCola(colaOriginal);

        Request.showMessage("Cola filtrada con precios menores que 10:");
        while (!colaFiltrada.isEmpty()) {
            Request.showMessage(colaFiltrada.poll().toString());
        }
    }
    public static Queue<Producto> filtrarCola(Queue<Producto> cola) {
        Queue<Producto> colaFiltrada = new LinkedList<>();
        filtrarColaRecursivo(cola, colaFiltrada);
        return colaFiltrada;
    }
    private static void filtrarColaRecursivo(Queue<Producto> colaOriginal, Queue<Producto> colaFiltrada) {
        if (colaOriginal.isEmpty()) {
            return;
        }
        Producto producto = colaOriginal.poll();
        if (producto.getPrecio() < 10) {
            colaFiltrada.add(producto);
        }
        filtrarColaRecursivo(colaOriginal, colaFiltrada);
        colaOriginal.add(producto);
    }
}

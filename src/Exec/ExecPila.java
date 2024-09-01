package Exec;

import Library.Request;
import Objects.Pila;

public class ExecPila {
    public  static void main(String[] args) {
        Pila<Integer> pilaDeEnteros = new Pila<>();

        pilaDeEnteros.push(10);
        pilaDeEnteros.push(20);
        pilaDeEnteros.push(30);

        Pila<String> pilaCadenas = new Pila<>();

        pilaCadenas.push("Hola");
        pilaCadenas.push("Adios");

        StringBuilder mensajeEnteros = new StringBuilder("Contenido de pilaDeEnteros:\n");
        while (!pilaDeEnteros.isEmpty()) {
            mensajeEnteros.append(pilaDeEnteros.pop()).append("\n");
        }
        Request.showMessage(mensajeEnteros.toString());

        StringBuilder mensajeCadenas = new StringBuilder("Contenido de pilaDeCadenas:\n");
        while (!pilaCadenas.isEmpty()) {
            mensajeCadenas.append(pilaCadenas.pop()).append("\n");
        }
        Request.showMessage(mensajeCadenas.toString());
    }
}

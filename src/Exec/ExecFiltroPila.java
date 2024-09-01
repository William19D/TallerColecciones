package Exec;

import Library.Request;
import Objects.Elemento;

import java.util.Stack;

public class ExecFiltroPila {
    public static void main(String[] args) {
        Stack<Elemento> pilaOriginal = new Stack<>();
        pilaOriginal.push(new Elemento(3));
        pilaOriginal.push(new Elemento(8));
        pilaOriginal.push(new Elemento(1));
        pilaOriginal.push(new Elemento(6));
        pilaOriginal.push(new Elemento(10));

        Stack<Elemento> pilaFiltrada = filtrarPila(pilaOriginal);

        Request.showMessage("Pila filtrada con valores mayores que 5:");
        while (!pilaFiltrada.isEmpty()) {
            Request.showMessage(pilaFiltrada.pop().toString());
        }
    }

    public static Stack<Elemento> filtrarPila(Stack<Elemento> pila) {
        Stack<Elemento> pilaFiltrada = new Stack<>();
        filtrarPilaRecursivo(pila, pilaFiltrada);
        return pilaFiltrada;
    }

    private static void filtrarPilaRecursivo(Stack<Elemento> pilaOriginal, Stack<Elemento> pilaFiltrada) {
        if (pilaOriginal.isEmpty()) {
            return;
        }

        Elemento elemento = pilaOriginal.pop();

        if (elemento.getValor() > 5) {
            pilaFiltrada.push(elemento);
        }

        filtrarPilaRecursivo(pilaOriginal, pilaFiltrada);

        pilaOriginal.push(elemento);
    }
}

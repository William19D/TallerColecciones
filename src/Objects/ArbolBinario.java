package Objects;

import java.util.ArrayList;
import java.util.List;

public class ArbolBinario {
    Nodo raiz;

    public ArbolBinario() {
        this.raiz = null;
    }

    public void insertar(int valor) {
        raiz = insertarRec(raiz, valor);
    }

    private Nodo insertarRec(Nodo raiz, int valor) {
        if (raiz == null) {
            raiz = new Nodo(valor);
            return raiz;
        }

        if (valor < raiz.valor) {
            raiz.izquierdo = insertarRec(raiz.izquierdo, valor);
        } else if (valor > raiz.valor) {
            raiz.derecho = insertarRec(raiz.derecho, valor);
        }

        return raiz;
    }

    public List<Integer> obtenerEnOrden() {
        List<Integer> resultado = new ArrayList<>();
        obtenerEnOrdenRec(raiz, resultado);
        return resultado;
    }

    private void obtenerEnOrdenRec(Nodo nodo, List<Integer> resultado) {
        if (nodo != null) {
            obtenerEnOrdenRec(nodo.izquierdo, resultado);
            resultado.add(nodo.valor);
            obtenerEnOrdenRec(nodo.derecho, resultado);
        }
    }
}

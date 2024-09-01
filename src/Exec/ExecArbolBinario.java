package Exec;

import Objects.ArbolBinario;

import java.util.List;

public class ExecArbolBinario {
    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();

        arbol.insertar(50);
        arbol.insertar(30);
        arbol.insertar(70);
        arbol.insertar(20);
        arbol.insertar(40);
        arbol.insertar(60);
        arbol.insertar(80);

        List<Integer> elementosOrdenados = arbol.obtenerEnOrden();

        System.out.println("Elementos del árbol en orden ascendente:");
        for (Integer valor : elementosOrdenados) {
            System.out.println(valor);
        }
    }
}

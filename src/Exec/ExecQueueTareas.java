package Exec;

import Library.Request;
import Objects.Tarea;

import java.util.PriorityQueue;

public class ExecQueueTareas {
    public static void main(String[] args) {
        PriorityQueue<Tarea> colaTareas = new PriorityQueue<>();

        colaTareas.add(new Tarea("Hacer la tarea de matemáticas", 2));
        colaTareas.add(new Tarea("Limpiar la casa", 1));
        colaTareas.add(new Tarea("Comprar víveres", 3));

        Request.showMessage("Tareas ordenadas por prioridad:");
        while (!colaTareas.isEmpty()) {
            Tarea tarea = colaTareas.poll();
            Request.showMessage(tarea.getDescripcion());
        }
    }
}

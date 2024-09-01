package Objects;

public class Tarea implements Comparable<Tarea> {
    private String descripcion;
    private int prioridad;

    // Constructor
    public Tarea(String descripcion, int prioridad) {
        this.descripcion = descripcion;
        this.prioridad = prioridad;
    }

    // Métodos getter
    public String getDescripcion() {
        return descripcion;
    }

    public int getPrioridad() {
        return prioridad;
    }

    // Implementar el método compareTo para la comparación de prioridades
    @Override
    public int compareTo(Tarea otraTarea) {
        // Las tareas con menor número de prioridad son más importantes
        return Integer.compare(this.prioridad, otraTarea.prioridad);
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "descripcion='" + descripcion + '\'' +
                ", prioridad=" + prioridad +
                '}';
    }
}


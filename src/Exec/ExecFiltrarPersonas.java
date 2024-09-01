package Exec;

import Objects.Persona;

import java.util.ArrayList;
import java.util.List;

public class ExecFiltrarPersonas {
    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Juan", 17, "Masculino", 175));
        personas.add(new Persona("Ana", 22, "Femenino", 160));
        personas.add(new Persona("Luis", 19, "Masculino", 180));
        personas.add(new Persona("Marta", 15, "Femenino", 155));

        List<Persona> mayoresDeEdad = filtrarMayoresDeEdad(personas);
        System.out.println("Personas mayores de edad:");
        for (Persona persona : mayoresDeEdad) {
            System.out.println(persona);
        }
    }
    public static List<Persona> filtrarMayoresDeEdad(List<Persona> lista) {
        return filtrarMayoresDeEdadRecursivo(lista, 0);
    }
    private static List<Persona> filtrarMayoresDeEdadRecursivo(List<Persona> lista, int index) {
        if (index >= lista.size()) {
            return new ArrayList<>();
        }
        List<Persona> filtradoRestante = filtrarMayoresDeEdadRecursivo(lista, index + 1);
        Persona personaActual = lista.get(index);
        if (personaActual.getEdad() >= 18) {
            filtradoRestante.add(personaActual);
        }
        return filtradoRestante;
    }
}

package Exec;

import Library.Request;
import Objects.Persona;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ExecPersona {

    public static void main(String[] args) {

        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Daniel",20,"M",180));
        personas.add(new Persona("Lucho",21,"M",172));
        personas.add(new Persona("David",23,"M",152));
        personas.add(new Persona("Laura",19,"F",165));

        for (Persona persona : personas) {
            Request.showMessage(persona.toString());
        }

        Collections.sort(personas);
        Request.showMessage("Ordenado por edad:");

        for (Persona persona : personas) {
            Request.showMessage(persona.toString());
        }


    }
}

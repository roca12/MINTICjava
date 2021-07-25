package DTO;

import java.util.ArrayList;
import java.util.Scanner;

public class TEST {

    public static void main(String[] args) {
        ArrayList<Persona> lista = new ArrayList<>();
        Scanner lector = new Scanner(System.in);
        System.out.println("inserte nombres ");
        String nombres = lector.nextLine();
        System.out.println("inserte apellidos");
        String apellidos = lector.nextLine();
        lista.add(new Persona(nombres, apellidos));

        for (Persona p : lista) {
            System.out.println(p.nombre + " " + p.apellido);
        }

    }

    static class Persona {

        String nombre, apellido;

        public Persona(String nombre, String apellido) {
            this.nombre = nombre;
            this.apellido = apellido;
        }

    }

}

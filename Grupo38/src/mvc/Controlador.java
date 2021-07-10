package mvc;

import java.util.ArrayList;

public class Controlador {

    //estructura statica (Vector) 
    int[] vector = new int[10];
    //estructura dinamica (lista)
    ArrayList<Persona> lista = new ArrayList<>();

    void crearPersona(String nombre, String comida_favorita, int edad, int documento) {
        lista.add(new Persona(nombre, comida_favorita, edad, documento));
    }

    ArrayList mostrarPersonas() {
        return lista;
    }

}

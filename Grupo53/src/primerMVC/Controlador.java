package primerMVC;

import java.util.ArrayList;

public class Controlador {

    ArrayList<Persona> lista = new ArrayList<>();

    void crearPersona(String nombre, String sexo, int edad, String comida_favorita) {
        lista.add(new Persona(nombre, sexo, edad, comida_favorita));
    }
    
    ArrayList obtenerLista(){
        return lista;
    }

}

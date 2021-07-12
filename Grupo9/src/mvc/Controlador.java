package mvc;

import java.util.ArrayList;

public class Controlador {

    //vector de panes
    Pan[] vectorpanes = new Pan[3];

    //Lista de leches
    ArrayList<Leche> listaleches = new ArrayList<>();

    //Lista de huevos
    ArrayList<Huevos> listahuevos = new ArrayList<>();

    public Controlador() {
        //ya tengo inventariado en mi tienda 
        vectorpanes[0] = new Pan(200, "Hojaldrado");
        vectorpanes[1] = new Pan(2000, "Pan galleta");
        vectorpanes[2] = new Pan(300, "Frances");
    }

    Pan[] mostrarTodosPanes() {
        //devuelvo toda vector de panes
        return vectorpanes;
    }

    int obtenerPrecio(String pan_a_buscar) {
        // por ahora no tenemos el precio
        int precio_de_este_pan = 0;
        // traigo todos los panes para buscar el que quiero
        Pan[] resultados = mostrarTodosPanes();
        // para cada pan comparo si es el que estoy buscando
        for (Pan el_pan_actual_revisado : resultados) {
            //si lo encontré, guardo su precio en la variable local
            if (el_pan_actual_revisado.tipo_de_pan.equals(pan_a_buscar)) {
                precio_de_este_pan = el_pan_actual_revisado.precio;
            }
        }
        // retorno a la vista el precio
        return precio_de_este_pan;
    }
}

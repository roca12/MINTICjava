package mvc;

import java.util.ArrayList;

public class Controlador {

    //Lista de panes
    ArrayList<Pan> listapanes = new ArrayList<>();


    public Controlador() {
        //ya tengo inventariado en mi tienda 
        listapanes.add(new Pan(200, "Hojaldrado"));
        listapanes.add(new Pan(2000, "Pan galleta"));
        listapanes.add(new Pan(300, "Frances"));
        listapanes.add(new Pan(300, "Rollito"));
        listapanes.add(new Pan(1000, "Bagette"));

    }

    String obtenerListaPanes() {
        String respuesta = "*** lista de panes de la tienda 9***\n";
        for (Pan el_pan_actual : listapanes) {
            respuesta += el_pan_actual.tipo_de_pan + " " + el_pan_actual.precio+"\n";
        }
        return respuesta;
    }

}

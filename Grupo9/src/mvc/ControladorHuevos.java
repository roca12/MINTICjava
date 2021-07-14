package mvc;

import java.awt.Color;
import java.util.ArrayList;

public class ControladorHuevos {

    // lista que almacena todos los tipos de huevos que tengo en la tienda
    ArrayList<Huevos> listahuevos = new ArrayList<>();

    public ControladorHuevos() {
        listahuevos.add(new Huevos("AAA", Color.ORANGE, 100, 30));
        listahuevos.add(new Huevos("AA", Color.WHITE, 200, 15));
        listahuevos.add(new Huevos("AAA", Color.GREEN, 300, 20));
        listahuevos.add(new Huevos("Codorniz", Color.BLACK, 150, 45));
        listahuevos.add(new Huevos("Velociraptor", new Color(130, 11, 3), 50000, 3));
        listahuevos.add(new Huevos("Avestruz", new Color(Integer.parseInt("FF689D", 16)), 800, 10));

    }

    String obtenerListaHuevos() {
        String respuesta = "** Lista de huevos de la tienda 9 ** \n";
        for (Huevos huevo_actual : listahuevos) {
            respuesta += huevo_actual.tamanio
                    + " "
                    + huevo_actual.color_del_huevo.toString().replace("java.awt.Color", "RGB")
                    + " "
                    + huevo_actual.precio
                    + " "
                    + huevo_actual.cantidad
                    + "\n";
        }
        return respuesta;
    }
}

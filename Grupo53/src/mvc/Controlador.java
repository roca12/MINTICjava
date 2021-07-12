package mvc;

import java.util.ArrayList;

public class Controlador {

    //lista de panes
    ArrayList<Pan> lista_de_panes = new ArrayList<>();

    //lista de huevos
    ArrayList<Huevo> lista_de_huevos = new ArrayList<>();

    //array unidimensional
    Pan[] vector = new Pan[10];

    public Controlador() {
        lista_de_panes.add(new Pan("Rollo", 2000, "artesanal"));
        lista_de_panes.add(new Pan("Hojaldrado", 300, "artesanal"));
        lista_de_panes.add(new Pan("Baggette", 1000, "artesanal"));
        lista_de_panes.add(new Pan("Croisant", 700, "artesanal"));
        lista_de_panes.add(new Pan("Tajado Bimbo", 5000, "industrial"));

        lista_de_huevos.add(new Huevo("AAA", "Cafe", 300, 120));
        lista_de_huevos.add(new Huevo("AA", "Blanco", 250, 90));
        lista_de_huevos.add(new Huevo("Codorniz", "Manchadito", 600, 40));

    }

    String imprimirListaPanes() {
        String respuesta = "**Lista de panes de la tienda**\n";
        for (Pan pan_en_lista : lista_de_panes) {
            respuesta += pan_en_lista.tipo_de_pan
                    + " "
                    + pan_en_lista.metodo_de_fabricacion
                    + " " + (pan_en_lista.precio + (pan_en_lista.precio * Impuesto.inflacion))
                    + "\n";
        }

        return respuesta;
    }

    String costoPorDocena() {
        String respuesta = "";
        for (Huevo huevo_en_lista : lista_de_huevos) {
            int costo_docena = (huevo_en_lista.precio * 12);
            respuesta += "El precio de la docena de "
                    + huevo_en_lista.tamanio
                    + " "
                    + huevo_en_lista.color
                    + " es de :"
                    + costo_docena + "\n";
        }

        return respuesta;

    }

}

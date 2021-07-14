package tienda;

import java.awt.Color;
import java.util.ArrayList;

public class Controlador {

    //vector static
    Huevo[] vector_de_huevos = new Huevo[5];

    //lista dinamica 
    ArrayList<Pan> lista_de_panes = new ArrayList<>();

    public Controlador() {
        lista_de_panes.add(new Pan("Criossant", 
                "industrial", 300));
        lista_de_panes.add(new Pan("Bagette", 
                "artesanal", 2000));
        lista_de_panes.add(new Pan("De la abuela", 
                "artesanal", 300));
        lista_de_panes.add(new Pan("de queso",
                "artesanal", 1000));
        lista_de_panes.add(new Pan("Pan de hamburguesa bimbo", 
                "industrial", 
                7000));
        
        vector_de_huevos[0]= new Huevo("AAA", Color.orange, 300, 120);
        vector_de_huevos[0]= new Huevo("AA", Color.WHITE, 300, 120);
        vector_de_huevos[0]= new Huevo("Codorniz", Color.gray, 700, 60);
        vector_de_huevos[0]= new Huevo("Aveztruz", Color.yellow, 5000, 60);
        vector_de_huevos[0]= new Huevo("Ganzo dorado", Color.YELLOW, 9999999, 1);
        
    }

    String obtenerListaPanes() {
        String respuesta = "***Lista de panes de la tienda 38***\n";
        for (Pan el_pan_actual : lista_de_panes) {
            respuesta
                    += el_pan_actual.tipo_de_pan
                    + " "
                    + el_pan_actual.forma_de_fabricacion
                    + " "
                    + el_pan_actual.precio
                    + "\n";
        }

        return respuesta;
    }

}

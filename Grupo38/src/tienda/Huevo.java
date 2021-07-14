
package tienda;

import java.awt.Color;

public class Huevo {
    String tamanio;
    Color color_del_huevo;
    int precio;
    int cantidad_restante;

    public Huevo(String tamanio, Color color_del_huevo, int precio, int cantidad_restante) {
        this.tamanio = tamanio;
        this.color_del_huevo = color_del_huevo;
        this.precio = precio;
        this.cantidad_restante = cantidad_restante;
    }
}

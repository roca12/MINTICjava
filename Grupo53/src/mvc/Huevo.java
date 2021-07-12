
package mvc;


public class Huevo {
    
    String tamanio;
    String color;
    int precio;
    int cantidad;
    float impuesto=Impuesto.IVA;

    public Huevo(String tamanio, String color, int precio, int cantidad) {
        this.tamanio = tamanio;
        this.color = color;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    
   
}

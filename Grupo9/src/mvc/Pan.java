
package mvc;


public class Pan {
    //atributos del pan
    int precio;
    String tipo_de_pan;
   
    //constructor
    public Pan(int precio, String tipo_de_pan) {
        this.precio = precio;
        this.tipo_de_pan = tipo_de_pan;
    }
    
    //funcion interna que devuelve el precio de la instancia escojida
    String devolverPrecio(){
        return  "El precio de el pan es de "+precio;
    }
    
}

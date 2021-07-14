
package tienda;


public class Pan {
    
    String tipo_de_pan;
    String forma_de_fabricacion;
    int precio;
    static float IVA=0.19f;
    
    public Pan(String tipo_de_pan, 
            String forma_de_fabricacion, 
            int precio) {
        this.tipo_de_pan = tipo_de_pan;
        this.forma_de_fabricacion = forma_de_fabricacion;
        this.precio = precio;
    }

    public Pan() {
    }
    
    
    
}

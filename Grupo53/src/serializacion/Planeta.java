
package serializacion;

import java.io.Serializable;


public class Planeta implements Serializable{
    
    private String nombre;

    public Planeta() {
    }

    public Planeta(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}

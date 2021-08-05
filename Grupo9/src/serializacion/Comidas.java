
package serializacion;

import java.io.Serializable;


public class Comidas implements Serializable{
    
    private String nombre;
    private String nombre_persona;

    public Comidas() {
    }

    public Comidas(String nombre, String nombre_persona) {
        this.nombre = nombre;
        this.nombre_persona = nombre_persona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre_persona() {
        return nombre_persona;
    }

    public void setNombre_persona(String nombre_persona) {
        this.nombre_persona = nombre_persona;
    }
    
}

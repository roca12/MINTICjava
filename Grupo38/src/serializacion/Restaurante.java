
package serializacion;

import java.io.Serializable;


public class Restaurante implements Serializable{
    private String nombre;
    private int estrellas;

    public Restaurante() {
    }

    public Restaurante(String nombre, int estrellas) {
        this.nombre = nombre;
        this.estrellas = estrellas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(int estrellas) {
        this.estrellas = estrellas;
    }
    
    
    
}

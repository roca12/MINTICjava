
package DTO;


/**
 * Clase que representa un pais del planeta tierra
 * @author Diego Rodriguez (roca12)
 * @since 1.12
 */
public class PaisesVO {
    /**
     * Atributo que representa el nombre del pais en esta instancia
     */
    private String nombre;
    
    /**
     * Metodo constructor que permite realizar una instancia sin inicializar los atributos
     */
    public PaisesVO() {
    }
    
    /**
     * Metodo constructor que permite realizar una instancia inicializando los atributos
     * @param nombre String con el nombre que tendra esta instancia de pais
     */
    public PaisesVO(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Obtiene el valor almacenado dentro del atributo nombre
     * @return String con el valor almacenado
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Permite modificar el valor almacenado dentro del atributo nombre
     * @param nombre el nuevo nombre que sobreescribirá el anterior
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}

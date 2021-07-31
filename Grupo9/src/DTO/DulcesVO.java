package DTO;

/**
 * Clase que representa un dulce de la vida real
 * @author Diego Rodriguez (roca12)
 */
public class DulcesVO {
    
    /**
     * Atributo que represnta el nombre de la instancia de un dulce
     * @since 1.12
     */
    private String nombre;
    
    /**
     * Constructor de instancia sin inicialización de atributos
     */
    public DulcesVO() {
    }
    
    /**
     * Constructor de instancia que permite inicializar al momento de la creación el valor del atributo nombre
     * @param nombre nombre asociado al dulce en esta instancia
     */
    public DulcesVO(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Obtiene el valor almacenado en el atributo nombre
     * @return String conteniendo el valor almacenado en nombre
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Permite modificar el valor almacenado del atributo nombre, dentro de esta instancia
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

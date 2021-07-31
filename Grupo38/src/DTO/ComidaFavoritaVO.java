package DTO;


/**
 * Clase Value Object que representa la comida comida favorita de algun estudiante del grupo 38
 * @author Diego Rodriguez (roca12)
 * @version 1.0
 * @since 1.12
 */
public class ComidaFavoritaVO {

    //value object
    
    /**
     * Este atributo de clase String, representa los ingredientes de la actual instancia de ComidaFavorita
     * @since 1.12
     */
    private String ingredientes;
    
    /**
     * Este atributo de clase String, representa la forma en que se prepara esta comida favorita (actual instancia)
     * @since 1.12
     */
    private String preparación;
    
    /**
     * Este atributo de tipo double, representa el costo monetario de la actual instancia de comida favorita
     * @since 1.12
     */
    private double costo;
    
    
    /**
     * Metodo constructor que permite crear una nueva instancia sin inicializar los atributos con valores desde su creación
     */
    public ComidaFavoritaVO() {
    }
    
    /**
     * Metodo constructor que permite crear una nueva instancia inicializando los atributos
     * @param ingredientes Representa los ingredientes de la actual instancia de ComidaFavorita
     * @param preparación representa la forma en que se prepara esta comida favorita (actual instancia)
     * @param costo representa el costo monetario de la actual instancia de comida favorita
     */
    public ComidaFavoritaVO(String ingredientes, String preparación, double costo) {
        this.ingredientes = ingredientes;
        this.preparación = preparación;
        this.costo = costo;
    }
     /**
      * Obtiene el valor del atributo ingrediente de esta instancia
      * @return String con el contenido del atributo ingredientes
      */
    public String getIngredientes() {
        return ingredientes;
    }
    /**
     * Metodo accesor que permite modificar el valor del atributo ingredientes
     * @param ingredientes valor que sobreescribirá el contenido de la variable
     */

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }
    
     /**
      * Obtiene el valor del atributo preparacion de esta instancia
      * @return String con el contenido del atributo preparacion 
      */
    public String getPreparación() {
        return preparación;
    }
    
    /**
     * Metodo accesor que permite modificar el valor del atributo preparación
     * @param preparación valor que sobreescribirá el contenido de la variable
     */
    public void setPreparación(String preparación) {
        this.preparación = preparación;
    }
    
     /**
      * Obtiene el valor del atributo costo de esta instancia
      * @return double con el contenido del atributo costo
      */
    public double getCosto() {
        return costo;
    }
    /**
     * Metodo accesor que permite modificar el valor del atributo costo
     * @param costo  valor que sobreescribirá el contenido de la variable
     */
    public void setCosto(double costo) {
        this.costo = costo;
    }  

}

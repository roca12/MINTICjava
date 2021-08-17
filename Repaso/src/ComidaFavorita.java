
public class ComidaFavorita {
   private String nombre_plato;
   private  String nombre_persona;

    public String getNombre_plato() {
        return nombre_plato;
    }

    public void setNombre_plato(String nombre_plato) {
        this.nombre_plato = nombre_plato;
    }

    public String getNombre_persona() {
        return nombre_persona;
    }

    public void setNombre_persona(String nombre_persona) {
        this.nombre_persona = nombre_persona;
    }

    public ComidaFavorita() {
    }

    public ComidaFavorita(String nombre_plato, String nombre_persona) {
        this.nombre_plato = nombre_plato;
        this.nombre_persona = nombre_persona;
    }
    
    
     
}

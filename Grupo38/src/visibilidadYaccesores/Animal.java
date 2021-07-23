package visibilidadYaccesores;

public class Animal {

    private String especie;

    public String ambiente;

    protected String alimentacion;

    private int peligrosidad;

    public Animal() {
    }

    public Animal(String especie, String ambiente, String alimentacion, int peligrosidad) {
        this.especie = especie;
        this.ambiente = ambiente;
        this.alimentacion = alimentacion;
        this.peligrosidad = peligrosidad;
    }
    
    

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
    
    
    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    public int getPeligrosidad() {
        return peligrosidad;
    }

    public void setPeligrosidad(int peligrosidad) {
        this.peligrosidad = peligrosidad;
    }
    
    
}

package DTO;

public class ComidaFavoritaVO {

    //value object
    private String ingredientes;
    private String preparación;
    private double costo;

    public ComidaFavoritaVO() {
    }

    public ComidaFavoritaVO(String ingredientes, String preparación, double costo) {
        this.ingredientes = ingredientes;
        this.preparación = preparación;
        this.costo = costo;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getPreparación() {
        return preparación;
    }

    public void setPreparación(String preparación) {
        this.preparación = preparación;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
    
    
    
    

}

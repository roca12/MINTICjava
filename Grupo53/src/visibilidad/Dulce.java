
package visibilidad;


public class Dulce {
    private String nombre;
    protected String marca;
    private double precio;
    private int nivel_de_dulzura;

    public Dulce() {
    }

    public Dulce(String nombre, String marca, double precio, int nivel_de_dulzura) {
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.nivel_de_dulzura = nivel_de_dulzura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getNivel_de_dulzura() {
        return nivel_de_dulzura;
    }

    public void setNivel_de_dulzura(int nivel_de_dulzura) {
        this.nivel_de_dulzura = nivel_de_dulzura;
    }
    
    
    
    
    
}

package mvc;

public class Persona {

    String nombre;
    String comida_favorita;
    int edad;
    int documento;

    public Persona() {
    }

    public Persona(String nombre, String comida_favorita, int documento) {
        this.nombre = nombre;
        this.comida_favorita = comida_favorita;
        this.documento = documento;
    }

    public Persona(String nombre, String comida_favorita, int edad, int documento) {
        this.nombre = nombre;
        this.comida_favorita = comida_favorita;
        this.edad = edad;
        this.documento = documento;
    }

    String saludar() {
        return "hola" + nombre;
    }

}

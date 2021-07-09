package primerMVC;

public class Persona {

    String nombre;
    String sexo;
    int edad;
    String comida_favorita;

    public Persona(String nombre, String sexo, int edad, String comida_favorita) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.comida_favorita = comida_favorita;
    }
    
    public Persona(String nombre, String sexo, String comida_favorita) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.comida_favorita = comida_favorita;
    }

    public Persona() {
    }
    
    

}

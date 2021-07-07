
package carpeta1;

public class Persona {
    
    //variables atributo
    String sexo;
    int altura;
    String comida_favorita;
    
    //metodo constructor
    public Persona(String sexo, int altura, String comida_favorita) {
        this.sexo = sexo;
        this.altura = altura;
        this.comida_favorita = comida_favorita;
    }   

    public Persona() {
    }
    
    public Persona(String sexo) {
        this.sexo=sexo;
    }
    
}

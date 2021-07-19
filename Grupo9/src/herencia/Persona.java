package herencia;

public class Persona {

    char sexo;
    String nombre;
    int estatura;
    String nacionalidad;
    int peso;

    public Persona() {
        this.nacionalidad="Colombiano";
    }

    public Persona(char sexo, String nombre, int estatura, String nacionalidad, int peso) {
        this.sexo = sexo;
        this.nombre = nombre;
        this.estatura = estatura;
        this.nacionalidad = nacionalidad;
        this.peso = peso;
    }
    
    String devolverDatosBasicos(){
        return nombre+" "+nacionalidad+" "+sexo+" "+estatura+" "+peso+" ";
    }

}

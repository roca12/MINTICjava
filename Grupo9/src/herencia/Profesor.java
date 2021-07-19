
package herencia;


public class Profesor extends Persona{
    int salario;
    String coordinacion;

    public Profesor() {
    }

    public Profesor(int salario, String coordinacion) {
        this.salario = salario;
        this.coordinacion = coordinacion;
    }

    public Profesor(int salario, String coordinacion, char sexo, String nombre, int estatura, String nacionalidad, int peso) {
        super(sexo, nombre, estatura, nacionalidad, peso);
        this.salario = salario;
        this.coordinacion = coordinacion;
    }
    
    
    
    
}

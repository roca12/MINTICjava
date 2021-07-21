
package herencia;


public class Administrativo extends Persona{
    String cargo;
    long salario;
    String nivel_de_escolaridad;

    public Administrativo() {
    }

    public Administrativo(String cargo, long salario, String nivel_de_escolaridad) {
        this.cargo = cargo;
        this.salario = salario;
        this.nivel_de_escolaridad = nivel_de_escolaridad;
    }

    public Administrativo(String cargo, long salario, String nivel_de_escolaridad, String nombre, String rh, long cedula, char sexo) {
        super(nombre, rh, cedula, sexo);
        this.cargo = cargo;
        this.salario = salario;
        this.nivel_de_escolaridad = nivel_de_escolaridad;
    }
    
    
}

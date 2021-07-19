
package herencia;


public class Profesor extends Persona{
    String materia,carrera,horario;
    long salario;

    public Profesor() {
    }

    public Profesor(String materia, String carrera, String horario, long salario) {
        this.materia = materia;
        this.carrera = carrera;
        this.horario = horario;
        this.salario = salario;
    }

    public Profesor(String materia, String carrera, String horario, long salario, String nombre, String nacionalidad, int altura, int peso, String sexo) {
        super(nombre, nacionalidad, altura, peso, sexo);
        this.materia = materia;
        this.carrera = carrera;
        this.horario = horario;
        this.salario = salario;
    }
    
    
    
}


package herencia;


public class Estudiante extends Persona{
    int cod_estudiante,semestre;

    public Estudiante() {
    }

    public Estudiante(int cod_estudiante, int semestre) {
        this.cod_estudiante = cod_estudiante;
        this.semestre = semestre;
    }

    public Estudiante(int cod_estudiante, int semestre, String nombre, String nacionalidad, int altura, int peso, String sexo) {
        super(nombre, nacionalidad, altura, peso, sexo);
        this.cod_estudiante = cod_estudiante;
        this.semestre = semestre;
    }
    
    
}

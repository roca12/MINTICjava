
package herencia;


public class Estudiante extends Persona{
    int semestre;
    int cod_estudiante;

    public Estudiante() {
    }

    public Estudiante(int semestre, int cod_estudiante) {
        this.semestre = semestre;
        this.cod_estudiante = cod_estudiante;
    }

    public Estudiante(int semestre, int cod_estudiante, String nombre, String rh, long cedula, char sexo) {
        super(nombre, rh, cedula, sexo);
        this.semestre = semestre;
        this.cod_estudiante = cod_estudiante;
    }
    
    
}

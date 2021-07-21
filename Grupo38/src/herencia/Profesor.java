
package herencia;


public class Profesor extends Persona{
    String area_de_estudio;
    long salario;
    String coordinacion;

    public Profesor() {
    }

    public Profesor(String area_de_estudio, long salario, String coordinacion) {
        this.area_de_estudio = area_de_estudio;
        this.salario = salario;
        this.coordinacion = coordinacion;
    }

    public Profesor(String area_de_estudio, long salario, String coordinacion, String nombre, String rh, long cedula, char sexo) {
        super(nombre, rh, cedula, sexo);
        this.area_de_estudio = area_de_estudio;
        this.salario = salario;
        this.coordinacion = coordinacion;
    }
    
    
    
}

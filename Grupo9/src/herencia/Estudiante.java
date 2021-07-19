package herencia;

public class Estudiante extends Persona {

    int codigo_estudiante;
    int semestre;
    String carrera;

    public Estudiante() {
    }

    public Estudiante(int codigo_estudiante, int semestre, String carrera) {
        this.codigo_estudiante = codigo_estudiante;
        this.semestre = semestre;
        this.carrera = carrera;
    }

    public Estudiante(int codigo_estudiante, int semestre, String carrera, char sexo, String nombre, int estatura, String nacionalidad, int peso) {
        super(sexo, nombre, estatura, nacionalidad, peso);
        this.codigo_estudiante = codigo_estudiante;
        this.semestre = semestre;
        this.carrera = carrera;
    }
    
    String datosCompletos(){
         return this.devolverDatosBasicos()+codigo_estudiante+" "+semestre+" "+carrera+" ";
                 
    }
      
}

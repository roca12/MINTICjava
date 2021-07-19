package herencia;

public class Administrativo extends Persona {

    String cargo, profesion, area;
    long salario;

    public Administrativo() {
    }

    public Administrativo(String cargo, String profesion, String area, long salario) {
        this.cargo = cargo;
        this.profesion = profesion;
        this.area = area;
        this.salario = salario;
    }

    public Administrativo(String cargo, String profesion, String area, long salario, String nombre, String nacionalidad, int altura, int peso, String sexo) {
        super(nombre, nacionalidad, altura, peso, sexo);
        this.cargo = cargo;
        this.profesion = profesion;
        this.area = area;
        this.salario = salario;
    }
    
    
}

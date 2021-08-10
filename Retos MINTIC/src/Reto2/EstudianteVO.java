package Reto2;

import java.util.ArrayList;

public class EstudianteVO {
    
    private ArrayList<Estudiante> estudiantes;
    private EstudianteDAO estudianteDAO;
	
    public EstudianteVO() {
	estudiantes = new ArrayList<Estudiante>();
	estudianteDAO = new EstudianteDAO();
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public EstudianteDAO getEstudianteDAO() {
        return estudianteDAO;
    }

    public void setEstudianteDAO(EstudianteDAO estudianteDAO) {
        this.estudianteDAO = estudianteDAO;
    }
    
}

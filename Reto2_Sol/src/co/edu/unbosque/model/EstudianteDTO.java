package co.edu.unbosque.model;

import java.util.ArrayList;

public class EstudianteDTO {
    
    private ArrayList<Estudiante> estudiantes;
    private EstudianteDAO estudianteDAO;
	
    public EstudianteDTO() {
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

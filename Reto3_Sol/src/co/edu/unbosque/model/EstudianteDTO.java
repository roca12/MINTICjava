package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.Archivo;
import co.edu.unbosque.model.persistence.EstudianteDAO;
import java.io.File;
import java.util.ArrayList;

public class EstudianteDTO {

    private ArrayList<Estudiante> estudiantes;
    private EstudianteDAO estudianteDAO;
    private File file = new File("data/datos_estudiantes.dat");
    private Archivo archivo;

    public EstudianteDTO() {
        estudiantes = new ArrayList<Estudiante>();
        archivo = new Archivo(file);
        estudianteDAO = new EstudianteDAO(archivo);
        estudiantes = archivo.leerArchivo(file);
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

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public Archivo getArchivo() {
        return archivo;
    }

    public void setArchivo(Archivo archivo) {
        this.archivo = archivo;
    }

    
}

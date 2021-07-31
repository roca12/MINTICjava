package co.edu.unbosque.model;

import java.util.ArrayList;

public class EstudianteDAO {
    

    public EstudianteDAO() {
    }

    public String verEstudiantes(ArrayList<Estudiante> estudiantes) {
	String texto = "";
	for (int i = 0; i < estudiantes.size(); i++) {
            texto = texto.concat(estudiantes.get(i) + "\n");
	}
	return texto;
    }

    public Estudiante buscarEstudiante(String correo, ArrayList<Estudiante> estudiantes) {
	Estudiante encontrado = null;
		
        if (!estudiantes.isEmpty()) {
            for (int i = 0; i < estudiantes.size(); i++) {
                if (estudiantes.get(i).getCorreo_institucional().equals(correo)) {
                    encontrado = estudiantes.get(i);
                }
            }
        }
		
	return encontrado;
    }

    public boolean agregarEstudiante(String nombres, String apellidos, String fecha_nacimiento, String correo_institucional, String correo_personal, long celular, long fijo, String programa, ArrayList<Estudiante> estudiantes) {
        Estudiante nuevo = new Estudiante(nombres, apellidos, fecha_nacimiento, correo_institucional, correo_personal, celular, fijo, programa);

	if (buscarEstudiante(correo_institucional, estudiantes) == null) {
            estudiantes.add(nuevo);
            return true;
	} else {
            return false;
	}

    }

    public boolean eliminarEstudiante(String correo, ArrayList<Estudiante> estudiantes) {
        boolean resp=false;
	Estudiante e = buscarEstudiante(correo, estudiantes);
        if(e!=null) {
            estudiantes.remove(e);
            resp= true;
        }
	return resp;
    }
}

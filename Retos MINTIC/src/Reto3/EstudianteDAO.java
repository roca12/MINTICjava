package Reto3;

import Reto3.Estudiante;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class EstudianteDAO {

    private Archivo archivo;

    public EstudianteDAO(Archivo arch) {
        archivo = arch;
    }

    public String verEstudiantes(File file) {
        ArrayList<Estudiante> estudiantes = archivo.leerArchivo(file);
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

    public boolean agregarEstudiante(String nombres, String apellidos, String fecha_nacimiento, String correo_institucional, String correo_personal, long celular, long fijo, String programa, ArrayList<Estudiante> estudiantes, File file) {
        Estudiante nuevo = new Estudiante(nombres, apellidos, fecha_nacimiento, correo_institucional, correo_personal, celular, fijo, programa);

        if (buscarEstudiante(correo_institucional, estudiantes) == null) {
            estudiantes.add(nuevo);
            archivo.escribirEnArchivo(estudiantes, file);
            return true;
        } else {
            return false;
        }

    }

    public boolean eliminarEstudiante(String correo, ArrayList<Estudiante> estudiantes, File file) {
        boolean resp = false;
        try {
            Estudiante e = buscarEstudiante(correo, estudiantes);
            if (e != null) {
                estudiantes.remove(e);
                file.delete();
                file.createNewFile();
                archivo.escribirEnArchivo(estudiantes, file);
                resp = true;
            }
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();

        }
        return resp;
    }
}

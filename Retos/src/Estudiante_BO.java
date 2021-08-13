
import java.util.ArrayList;

public class Estudiante_BO {

    //boolean
    //business object
    //controlador
    //operaciones
    ArrayList<EstudianteVO> listaestudiante = new ArrayList<>();

    public void crearestudiante(String nombres, String apellidos, String nacimiento,
            String correo_in, String correo_pe, long celular, long fijo, String programa) {
        listaestudiante.add(new EstudianteVO(nombres, apellidos, nacimiento, correo_in, correo_pe, celular, fijo, programa));
    }

    public boolean buscarestudiante(String buscar_estudiante) {
        try {
            for (int i = 0; i < listaestudiante.size(); i++) {
                if (listaestudiante.get(i).getEmail_inst().equals(buscar_estudiante)) {
                    EstudianteVO encontrado = listaestudiante.get(i);
                    System.out.println("Nombre:" + encontrado.getNombre());
                    System.out.println("Apellidos:" + encontrado.getApellido());
                    System.out.println("Fecha nacimiento:" + encontrado.getBirthday());
                    System.out.println("Correo institucional:" + encontrado.getEmail_inst());
                    System.out.println("Correo personal:" + encontrado.getEmail());
                    System.out.println("Número de teléfono celular:" + encontrado.getCelular());
                    System.out.println("Número de teléfono fijo:" + encontrado.getFijo());
                    System.out.println("Programa académico:" + encontrado.getPrograma());
                    System.out.println(" ");
                    break;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public boolean actualizarestudiante(String nuevocorreoin, String nuevocorreope,
            long nuevocelular, long nuevofijo, String nuevoprograma) {
        try {
            for (int i = 0; i < listaestudiante.size(); i++) {
                if (listaestudiante.get(i).getEmail_inst().equals(nuevocorreoin)) {
                    listaestudiante.get(i).setEmail(nuevocorreope);
                    listaestudiante.get(i).setCelular(nuevocelular);
                    listaestudiante.get(i).setFijo(nuevofijo);
                    listaestudiante.get(i).setPrograma(nuevoprograma);
                }
            }
        } catch (Exception dato_no_valido) {
            return false;
        }

        return true;
    }

    public boolean eliminarestudiante(String estudiante_borrar) {
        try {
            for (int i = 0; i < listaestudiante.size(); i++) {
                if (listaestudiante.get(i).getEmail_inst().equals(estudiante_borrar)) {
                    listaestudiante.remove(i);
                    break;
                }
            }
        } catch (Exception ex) {
            return false;
        }
        return true;
    }

    public boolean mostrarestudiante() {
        for (EstudianteVO estudiante_actual : listaestudiante) {
            System.out.println("Nombre:" + estudiante_actual.getNombre());
            System.out.println("Apellidos:" + estudiante_actual.getApellido());
            System.out.println("Fecha nacimiento:" + estudiante_actual.getBirthday());
            System.out.println("Correo institucional:" + estudiante_actual.getEmail_inst());
            System.out.println("Correo personal:" + estudiante_actual.getEmail());
            System.out.println("Número de teléfono celular:" + estudiante_actual.getCelular());
            System.out.println("Número de teléfono fijo:" + estudiante_actual.getFijo());
            System.out.println("Programa académico:" + estudiante_actual.getPrograma());
            System.out.println(" ");
        }
        return false;
    }
}

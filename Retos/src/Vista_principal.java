
import java.util.Scanner;

public class Vista_principal {

    public static void main(String[] args) {
        Estudiante_BO miestudiante = new Estudiante_BO();
        Scanner op = new Scanner(System.in);
        while (true) { //Mostrar menu
            System.out.println("INSTITUTO LA FLORESTA");
            System.out.println("Seleccione tarea a realizar");
            System.out.println("1. Ingresar estudiante");
            System.out.println("2. Buscar estudiante");
            System.out.println("3. Modificar estudiante");
            System.out.println("4. Eliminar Estudiante");
            System.out.println("5. Ver directorio de estudiantes");
            System.out.println("6. Salir");
            System.out.println("Opción:");

            int opcion = op.nextInt();
            if (opcion == 1) {
                System.out.println("Ingresar estudiante");
                System.out.println("Ingresar nombres:");
                op.nextLine();
                String nombres = op.nextLine();
                System.out.println("Ingresar apellidos:");
                String apellidos = op.nextLine();
                System.out.println("Ingresar fecha de nacimiento (YYYY-MM-DD):");
                String nacimiento = op.nextLine();
                System.out.println(" Ingresar correo institucional:");
                String correo_in = op.nextLine();
                System.out.println("Ingresar correo personal:");
                String correo_pe = op.nextLine();
                System.out.println("Ingresar número de celular:");
                long celular = op.nextLong();
                System.out.println("Ingresar número fijo:");
                long fijo = op.nextLong();
                op.nextLine();
                System.out.println("Ingresar programa:");
                String programa = op.nextLine();
                System.out.println("Se agregó el estudiante");
                miestudiante.crearestudiante(nombres, apellidos, nacimiento, correo_in, correo_pe, celular, fijo, programa);
                System.out.println("");
            } else if (opcion == 2) {
                System.out.println("Buscar estudiante");
                System.out.println("Ingresar correo institucional:");
                op.nextLine();
                String buscarestudiante = op.nextLine();
                System.out.println("Información del estudiante");
                miestudiante.buscarestudiante(buscarestudiante);
            } else if (opcion == 3) {
                op.nextLine();
                System.out.println("Modificar estudiante");
                System.out.println("Ingresar correo institucional:");
                String nuevocorreoin = op.nextLine();
                System.out.println("Ingresar correo personal:");
                String nuevocorreope = op.nextLine();
                System.out.println("Ingresar número de celular:");
                long nuevocelular = op.nextLong();
                System.out.println("Ingresar número fijo:");
                long nuevofijo = op.nextLong();
                op.nextLine();
                System.out.println("Ingresar programa:");
                String nuevoprograma = op.nextLine();
                miestudiante.actualizarestudiante(nuevocorreoin, nuevocorreope, nuevocelular, nuevofijo, nuevoprograma);
                System.out.println("Se modifico estudiante");
                System.out.println("");
            } else if (opcion == 4) {
                op.nextLine();
                System.out.println("Eliminar estudiante");
                System.out.println("Ingresar correo institucional:");
                String correo_in = op.nextLine();
                miestudiante.eliminarestudiante(correo_in);
                System.out.println("Se eliminó el estudiante");
            } else if (opcion == 5) {
                op.nextLine();
                System.out.println("El directorio de los estudiantes");
                String correo_in = op.nextLine();
                miestudiante.mostrarestudiante();

            } else if (opcion == 6) {
                System.out.println("Hasta pronto");

                break;
            }
        }
    }
}

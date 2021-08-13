package Reto4;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        DBControlador bd = new DBControlador();
        while (true) {
            bd.conectar();
            System.out.println(
                    "INSTITUTO LA FLORESTA\n"
                    + "Seleccione tarea a realizar:\n"
                    + "1. Ingresar estudiante\n"
                    + "2. Buscar estudiante\n"
                    + "3. Modificar estudiante\n"
                    + "4. Eliminar Estudiante\n"
                    + "5. Ver directorio de estudiantes\n"
                    + "6. Salir\n"
                    + "Opción:");
            int op = leer.nextInt();

            if (op == 6) {
                System.out.println("Hasta pronto");
                bd.cerrar();
                break;

            } else if (op == 1) {

                System.out.println("Ingresar estudiante");
                System.out.println("Ingresar nombres:");
                leer.nextLine();
                String nombre = leer.nextLine();

                System.out.println("Ingresar apellidos:");
                String apellidos = leer.nextLine();

                System.out.println("Ingresar fecha de nacimiento (YYYY-MM-DD):");
                String birthday = leer.nextLine();

                System.out.println("Ingresar correo institucional:");
                String email_inst = leer.nextLine();

                System.out.println("Ingresar correo personal:");
                String email = leer.nextLine();

                System.out.println("Ingresar número de celular:");
                long celular = leer.nextLong();

                System.out.println("Ingresar número fijo:");
                long fijo = leer.nextLong();
                leer.nextLine();
                System.out.println("Ingresar programa:");

                String programa = leer.nextLine();

                bd.insertar(nombre, apellidos, birthday, email_inst, email, celular, fijo, programa);
                System.out.println("Se agregó el estudiante\n");

            } else if (op == 5) {

                System.out.println("El directorio de los estudiantes\n");
                for (EstudianteVO estudiante_actual : bd.consultar_todo()) {
                    System.out.println("Nombres: " + estudiante_actual.getNombre() + "\n"
                            + "Apellidos: " + estudiante_actual.getApellido() + "\n"
                            + "Fecha nacimiento: " + estudiante_actual.getBirthday() + "\n"
                            + "Correo institucional: " + estudiante_actual.getEmail_inst() + "\n"
                            + "Correo personal: " + estudiante_actual.getEmail() + "\n"
                            + "Número de teléfono celular: " + estudiante_actual.getCelular() + "\n"
                            + "Número de teléfono fijo: " + estudiante_actual.getFijo() + "\n"
                            + "Programa académico: " + estudiante_actual.getPrograma() + "\n");
                }

            } else if (op == 3) {

                System.out.println("Modificar estudiante\n"
                        + "Ingresar correo institucional:");
                leer.nextLine();
                String nemail_inst = leer.nextLine();

                System.out.println("Ingresar correo personal:");
                String nemail = leer.nextLine();

                System.out.println("Ingresar número de celular:");
                long ncelular = leer.nextLong();

                System.out.println("Ingresar número fijo:");
                long nfijo = leer.nextLong();
                leer.nextLine();

                System.out.println("Ingresar programa:");

                String nprograma = leer.nextLine();
                bd.modificar(nemail_inst, nemail, ncelular, nfijo, nprograma);
                System.out.println("Se modificó el estudiante\n");

            } else if (op == 4) {

                System.out.println("Eliminar estudiante\n"
                        + "Ingresar correo institucional:");
                leer.nextLine();
                String eliminar = leer.nextLine();
                bd.eliminar(eliminar);
                System.out.println("Se eliminó el estudiante\n");

            } else if (op == 2) {

                System.out.println("Buscar estudiante\n"
                        + "Ingresar correo institucional:");
                leer.nextLine();
                String buscar = leer.nextLine();
                EstudianteVO encontrado = bd.buscarEstudiante(buscar);
                System.out.println("Nombres: " + encontrado.getNombre() + "\n"
                        + "Apellidos: " + encontrado.getApellido() + "\n"
                        + "Fecha nacimiento: " + encontrado.getBirthday() + "\n"
                        + "Correo institucional: " + encontrado.getEmail_inst() + "\n"
                        + "Correo personal: " + encontrado.getEmail() + "\n"
                        + "Número de teléfono celular: " + encontrado.getCelular() + "\n"
                        + "Número de teléfono fijo: " + encontrado.getFijo() + "\n"
                        + "Programa académico: " + encontrado.getPrograma() + "\n");

            }
        }
    }
}

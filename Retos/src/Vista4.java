import java.util.Scanner;


public class Vista4 {
    
    public static void main(String[] args) {
        
        Scanner op= new Scanner(System.in);
        DBControlador bd = new DBControlador();
        while (true) {  
            bd.conectar();
            bd.crear();
            System.out.println(
                    "INSTITUTO LA FLORESTA\n"
                    +"Seleccione tarea a realizar:\n"
                    +"1. Ingresar estudiante\n"
                    +"2. Buscar estudiante\n"
                    +"3. Modificar estudiante\n"
                    +"4. Eliminar Estudiante\n"
                    +"5. Ver directorio de estudiantes\n"
                    +"6. Salir\n"
                    +"Opción:");
            int opcion= op.nextInt();
            
            
            if (opcion==1){
                System.out.println("Ingresar estudiante");
                System.out.println("Ingresar nombres:");
                op.nextLine();
                String nombre = op.nextLine();
                
                System.out.println("Ingresar apellidos:");
                String apellidos = op.nextLine();
                
                System.out.println("Ingresar fecha de nacimiento (YYYY-MM-DD):");
                String fecha = op.nextLine();
                
                System.out.println("Ingresar correo institucional:");
                System.out.println();
                String correo_institucional = op.nextLine();
                
                System.out.println("Ingresar correo personal:");
                String correo_personal = op.nextLine();
                
                System.out.println("Ingresar número de celular:");
                long celular = op.nextLong();
                
                System.out.println("Ingresar número fijo:");
                long fijo = op.nextLong();
                op.nextLine();
                System.out.println("Ingresar programa:");
                
                String programa = op.nextLine();
                
                bd.insertar(nombre, apellidos, fecha, nombre, nombre, fijo, fijo, programa);
                System.out.println("Se agregó el estudiante\n");
                
            } else if(opcion==2){
                System.out.println("Buscar estudiante\n"
                        +"Ingresar correo institucional:");
                op.nextLine();
                String buscar = op.nextLine();
                Estud_VO4 encontrado = bd.buscarEstudiante(buscar);
                System.out.println("Nombres: " + encontrado.getNombres() + "\n"
                        + "Apellidos: " + encontrado.getApellidos() + "\n"
                        + "Fecha nacimiento: " + encontrado.getFecha_de_nacimiento() + "\n"
                        + "Correo institucional: " + encontrado.getCorreo_institucional() + "\n"
                        + "Correo personal: " + encontrado.getCorreo_personal() + "\n"
                        + "Número de teléfono celular: " + encontrado.getNumero_tel_celular() + "\n"
                        + "Número de teléfono fijo: " + encontrado.getNumero_tel_fijo() + "\n"
                        + "Programa académico: " + encontrado.getPrograma_academico() + "\n");

           
            } else if (opcion==3){
                
                System.out.println("Modificar estudiante\n"
                        + "Ingresar correo institucional:");
                op.nextLine();
                String nemail_inst = op.nextLine();

                System.out.println("Ingresar correo personal:");
                String nemail = op.nextLine();

                System.out.println("Ingresar número de celular:");
                long ncelular = op.nextLong();

                System.out.println("Ingresar número fijo:");
                long nfijo = op.nextLong();
                op.nextLine();

                System.out.println("Ingresar programa:");

                String nprograma = op.nextLine();
                bd.modificar(nemail_inst, nemail, ncelular, nfijo, nprograma);
                System.out.println("Se modificó el estudiante\n");

            } else if (opcion==4){
                
                System.out.println("Eliminar estudiante\n"
                        +"Ingresar correo institucional:");
                op.nextLine();
                String eliminar_estudiante = op.nextLine();
                bd.eliminar(eliminar_estudiante);
                System.out.println("Se eliminó el estudiante\n");
                
                
            } else if (opcion==5){
                
                System.out.println("El directorio de los estudiantes\n");
                for (Estud_VO4 estudiante_actual : bd.consultar_todo()){
                    System.out.println("Nombres: "+ estudiante_actual.getNombres()+ "\n"
                            + "Apellidos: " + estudiante_actual.getApellidos() + "\n"
                            + "Fecha nacimiento: " + estudiante_actual.getFecha_de_nacimiento() + "\n"
                            + "Correo institucional: " + estudiante_actual.getCorreo_institucional() + "\n"
                            + "Correo personal: " + estudiante_actual.getCorreo_personal() + "\n"
                            + "Número de teléfono celular: " + estudiante_actual.getNumero_tel_celular() + "\n"
                            + "Número de teléfono fijo: " + estudiante_actual.getNumero_tel_fijo() + "\n"
                            + "Programa académico: " + estudiante_actual.getPrograma_academico() + "\n");
                             
                }
               
            }else if (opcion==6){
                System.out.println("Hasta pronto");
                bd.cerrar();
                break;
            }
        }
            
    }    
}
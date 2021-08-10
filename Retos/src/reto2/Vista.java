package reto2;

import java.util.Scanner;
/**
 * clase principal del programa , se encarga de gestionar las operaciones a realizar y mostrar la informacion y los procesos solicitados
 * @author user
 */
public class Vista {
    /**
     * clase main que indica que esta es la clase principal 
     * @param args 
     */
    public static void main(String[] args) {
        /**
         * invocacion de la clase EstudianteVO para traer los datos del la clase
         */
        Estudiante_BO estudiante_bo = new Estudiante_BO();
        //creacion de la funcion scanner para traer datos desde teclado
        Scanner lector = new Scanner(System.in);
        /**
         * imprecion inicial en el programa indicando las funciones a realizar de acuerdo a la opcion seleccionada
         */         
        while (true){
            System.out.println("");
            System.out.println("INSTITUTO LA FLORESTA\n" +
                               "Seleccione tarea a realizar:\n" +
                               "1. Ingresar estudiante\n" +
                               "2. Buscar estudiante\n" +
                               "3. Modificar estudiante\n" +
                               "4. Eliminar Estudiante\n" +
                               "5. Ver directorio de estudiantes\n" +
                               "6. Salir\n" +
                               "Opción:");
            int Seleccion = lector.nextInt();
            /**
             * con la primera opcion invocamos la funcion ingresarEstudiante para ingresar los atributos del estudiante 
             */
            
            if (Seleccion == 1){
                System.out.println("Ingresar estudiante");
                System.out.println("Ingresar nombres:\n");
                lector.nextLine();
                String nombre = lector.nextLine();
                System.out.println("Ingresar apellidos:\n");
                String apellido = lector.nextLine();
                System.out.println("Ingresar fecha de nacimiento (YYYY-MM-DD):\n");
                String fecha = lector.nextLine();
                System.out.println("Ingresar correo institucional:\n");
                String correo_institucional = lector.nextLine();
                System.out.println("Ingresar correo personal:\n"); 
                String correo_personal = lector.nextLine();
                System.out.println("Ingresar número de celular:\n");
                long celular = lector.nextLong();
                System.out.println("Ingresar número fijo:\n");
                long numero_fijo = lector.nextLong();
                lector.nextLine();
                System.out.println("Ingresar programa:\n");
                String programa = lector.nextLine();
                System.out.println("Se agregó el estudiante");
                estudiante_bo.ingresarEstudiante(nombre, apellido, fecha, correo_institucional, correo_personal, celular, numero_fijo, programa, numero_fijo);
                
            }
            /**
             * con la segunda opcion invocamos la funcion buscar_estudiante para buscar un estudiante especifico
             */
            else if (Seleccion==2){
                System.out.println("Buscar estudiante");
                System.out.println("Ingresar correo institucional:");
                lector.nextLine();
                String buscar_estudiante = lector.nextLine();
                System.out.println("Información del estudiante");
                estudiante_bo.buscar_Estudiante(buscar_estudiante);
                
            }
            /**
             * con la tercera opcion invocamos la funcion actualizarEstudiante para modificar los datos de el estudiante
             */
            else if (Seleccion==3){
                System.out.println("Modificar estudiante");
                System.out.println("Ingresar correo institucional:\n");
                lector.nextLine();
                String nuevocorreo_institucional = lector.nextLine();
                System.out.println("Ingresar correo personal:\n"); 
                String nuevocorreo_personal = lector.nextLine();
                System.out.println("Ingresar número de celular:\n");
                long nuevonumero_celular = lector.nextLong();
                System.out.println("Ingresar número fijo:\n");
                long nuevonumero_fijo = lector.nextLong();
                lector.nextLine();
                System.out.println("Ingresar programa:\n");
                String nuevoprograma_academico = lector.nextLine();
                estudiante_bo.actualizarEstudiante(nuevocorreo_institucional, nuevocorreo_personal, nuevonumero_celular, nuevonumero_fijo, nuevoprograma_academico);
                System.out.println("Se modificó el estudiante"); 
                System.out.println("");
                
                
            }
            /**
             * con la cuarta opcion invocamos la funcion eliminarEstudiante  para eliminar algun elemento de nuestra lista
             */
            
            
            else if (Seleccion==4){
                System.out.println("Eliminar estudiante");
                System.out.println("Ingresar correo institucional:");
                lector.nextLine();
                String eliminarEstudiante = lector.nextLine();
                estudiante_bo.eliminarEstudiante(eliminarEstudiante);
                System.out.println("Se eliminó el estudiante");
                System.out.println("");
                        
            }
            /**
             * con la quinta opcion mostramos el directorio completo de estudiantes que esta almacenado en la lista_de_usuarios 
             */
            else if(Seleccion==5){
                
                System.out.println("El directorio de los estudiantes");
                estudiante_bo.mostrarEstudiante();
                
               
                
            }
            /**
             * con la sexta opcion cerramos el programa dando por terminado todo el proceso
             */
            
            else if (Seleccion==6){
                System.out.println("\n");
                System.out.println("Hasta pronto");
                break;
                
            }
            
            
            
        } 
    }
    
}
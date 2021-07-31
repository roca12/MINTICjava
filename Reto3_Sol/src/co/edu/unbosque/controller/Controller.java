package co.edu.unbosque.controller;

import co.edu.unbosque.model.Estudiante;
import co.edu.unbosque.model.EstudianteDTO;
import co.edu.unbosque.view.VistaConsola;

public class Controller {
    
    private VistaConsola vista;
    private EstudianteDTO instituto;
    
    public Controller(){
        vista = new VistaConsola();
        instituto = new EstudianteDTO();
        funcionar();
    }
    
    public void funcionar(){
        int opcion = 0;
        int c = 0, e = 0;
        
        String menu = "INSTITUTO LA FLORESTA" + "\n"+
                      "Seleccione tarea a realizar:"+ "\n"+
                      " 1. Ingresar estudiante"+ "\n"+
                      " 2. Buscar estudiante"+ "\n"+
                      " 3. Modificar estudiante"+ "\n"+
                      " 4. Eliminar Estudiante"+ "\n"+
                      " 5. Ver directorio de estudiantes"+ "\n"+
                      " 6. Salir"+ "\n"+
                      "Opción:";
        do{
            opcion = vista.leerDatoEntero(menu);
            switch(opcion){
                case 1:
                    ingresarEstudiante();
                    break;
                case 2:
                    buscarEstudiante();
                    break;
                case 3:
                    modificarEstudiante();
                    break;
                case 4:
                    eliminarEstudiante();
                    break;
                case 5:
                    mostrarDirectorio();
                    break;
                case 6:
                    vista.mostrarInformacion("\nHasta pronto");
                    break;
                default:
                    vista.mostrarInformacion("\nError: Opción no válida");
            }
        }while(opcion!=6);
    }
    
    public void ingresarEstudiante(){
        String n = "" , a = "", fn = "", ci = "", cp = "", pr = "";
        long cel = 0, f = 0;
        vista.mostrarInformacion("\nIngresar estudiante");
        n = vista.leerDatoString("Ingresar nombres: ");
        a = vista.leerDatoString("Ingresar apellidos: ");
        fn = vista.leerDatoString("Ingresar fecha de nacimiento (YYYY-MM-DD): ");
        ci = vista.leerDatoString("Ingresar correo institucional: ");
        cp = vista.leerDatoString("Ingresar correo personal: ");
        cel = vista.leerDatoLong("Ingresar número de celular: ");
        f = vista.leerDatoLong("Ingresar número fijo: ");
        pr = vista.leerDatoString("Ingresar programa: ");
        
        if(instituto.getEstudianteDAO().agregarEstudiante(n, a, fn, ci, cp, cel, f, pr, instituto.getEstudiantes(), instituto.getFile())){
            vista.mostrarInformacion("Se agregó el estudiante\n");
        }else{
            vista.mostrarInformacion("No fue posible agregar el estudiante\n");
        }
        
    }
    
    public void buscarEstudiante(){
        String ci = "";
        vista.mostrarInformacion("\nBuscar estudiante");
        ci = vista.leerDatoString("Ingresar correo institucional: ");
        Estudiante rta = instituto.getEstudianteDAO().buscarEstudiante(ci, instituto.getEstudiantes()) ;       
        if(rta != null){
            vista.mostrarInformacion(rta.toString());
        }else{
            vista.mostrarInformacion("El estudiante no se encuentra registrado en el instituto\n");
        }
    }
    
    public void modificarEstudiante(){
        String n = "" , a = "", fn = "", ci = "", cp = "", pr = "";
        long cel = 0, f = 0;
        vista.mostrarInformacion("\nModificar estudiante");
        ci = vista.leerDatoString("Ingresar correo institucional: ");
        Estudiante rta = instituto.getEstudianteDAO().buscarEstudiante(ci, instituto.getEstudiantes()) ;       
        if(rta != null){
            n = rta.getNombres();
            a = rta.getApellidos();
            fn = rta.getFecha_nacimiento();
            cp = vista.leerDatoString("Ingresar correo personal: ");
            cel = vista.leerDatoLong("Ingresar número de celular: ");
            f = vista.leerDatoLong("Ingresar número fijo: ");
            pr = vista.leerDatoString("Ingresar programa: ");
            instituto.getEstudianteDAO().eliminarEstudiante(ci, instituto.getEstudiantes(), instituto.getFile());
            instituto.getEstudianteDAO().agregarEstudiante(n, a, fn, ci, cp, cel, f, pr, instituto.getEstudiantes(), instituto.getFile());
            vista.mostrarInformacion("Se modificó el estudiante\n");
        }else{
            vista.mostrarInformacion("El estudiante no se encuentra registrado en el instituto\n");
        }
    }
    
    public void eliminarEstudiante(){
        String ci = "";
        vista.mostrarInformacion("\nEliminar estudiante");
        ci = vista.leerDatoString("Ingresar correo institucional: ");
        if(instituto.getEstudianteDAO().eliminarEstudiante(ci, instituto.getEstudiantes(), instituto.getFile())){
            vista.mostrarInformacion("Se eliminó el estudiante\n");
        }else{
            vista.mostrarInformacion("El estudiante no se encuentra registrado en le instituto\n");
        }
    }
    
    public void mostrarDirectorio(){
        vista.mostrarInformacion("\nEl directorio de los estudiantes");
        vista.mostrarInformacion(instituto.getEstudianteDAO().verEstudiantes(instituto.getFile()));
    }
}

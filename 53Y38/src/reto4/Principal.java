
package reto4;


public class Principal {

    
    public static void main(String[] args) {
       ControladorBD bd= new  ControladorBD();
       bd.verificarYconectar();
       bd.crearTabla();
       bd.insertar("pepito", 
               "perez", 
               "01-01-2000", 
               "p@unbosque.edu.co", 
               "p@gmail.com", 
               3001234567L, 
               1234567L, 
               "Contaduria");
       
       bd.cerrarTodo();
    }
    
}

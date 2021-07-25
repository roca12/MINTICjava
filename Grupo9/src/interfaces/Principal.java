
package interfaces;


public class Principal {
    public static void main(String[] args) {
        Estudiante9 jef= new Estudiante9();
        System.out.println(jef.cocinar());
        
        Senador palpatine = new Senador();
        System.out.println(palpatine.cocinar());
        
        System.out.println(jef.toString());
        System.out.println(palpatine.toString());
    }
    
}

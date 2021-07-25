
package interfaces;

public class Principal {
    
    public static void main(String[] args) {
        Estudiante53 carolina = new Estudiante53();
        System.out.println(carolina.hablar());
        
        Senador palpatine = new Senador();
        System.out.println(palpatine.hablar());
        
        System.out.println(carolina.toString());
        System.out.println(palpatine.toString());

    }
    
}

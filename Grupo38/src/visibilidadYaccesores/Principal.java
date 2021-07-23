
package visibilidadYaccesores;


public class Principal {


    public static void main(String[] args) {
        Animal a1=new Animal("Perro", "Urbano", "Ovnivoro", 7);
        Animal a2= new Animal("Gato", "Hogareño", "Carnivoro", 1);
        a1.setAmbiente("Hogareño");
        System.out.println(a2.getEspecie());
        System.out.println(a1.getAmbiente());
    }
    
}

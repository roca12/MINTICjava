package visibilidad;

public class Principal {

    public static void main(String[] args) {
        Animal a1= new Animal("Leon", "Llanuras", "Carnivoro", 8);
        Animal a2= new Animal("Pinguino", "Polar", "Ovnivoro", 2);
        Animal a3 = new Animal();
        a3.setEspecie("gato");
        a3.setAmbiente("domestico");
        a3.setAlimentacion("carnivoro");
        a3.setPeligrosidad(1);
        
        a2.setAmbiente("Antartico");
        System.out.println(a2.getAmbiente()+" "+a2.getEspecie());
        
        a1.setPeligrosidad(10);
        System.out.println(a1.getPeligrosidad());
        
        Rosa roja = new Rosa();

        
        
    }

}

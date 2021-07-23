package clasesabstractas;

public class Principal {

    public static void main(String[] args) {
        Gato misifu = new Gato();
        Perro dante = new Perro();
        System.out.println(misifu.hacerRuido());
        System.out.println(dante.hacerRuido());
        Animal nuevoanimal = new Animal() {
            @Override
            String hacerRuido() {
                return "Soy un nuevo engendro de la naturaleza";
            }
        };
        
        Animal otromisifu= new Gato();
        Animal otroperro = new Perro();
    }

}

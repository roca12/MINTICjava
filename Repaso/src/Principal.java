
public class Principal {

    public static void main(String[] args) {
        ComidaFavorita c1 = new ComidaFavorita("Lasagna", "Fredy");
        ComidaFavorita c2 = new ComidaFavorita("Hamburguesa", "Jenniffer");
        ComidaFavorita c3 = new ComidaFavorita();
        c3.setNombre_plato("Arroz con pollo");
        c3.setNombre_persona("Johan");
        System.out.println(c3.getNombre_persona());
        System.out.println(c3.getNombre_plato());

        Pais p1 = new Pais("Mexico", "CIUDAD DE MEXICO", 20000000);
        Pais p2 = new Pais();
        p2.nombre = "EEUU";
        p2.capital = "Washigton DC";
        p2.habitantes = 18000000;

        if (c1.equals(c2)) {
            System.out.println("Verdadero");

        } else {

            System.out.println("falso");
        }

    }

}

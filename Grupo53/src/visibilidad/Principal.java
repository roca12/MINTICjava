package visibilidad;

public class Principal {

    public static void main(String[] args) {

        Dulce d1 = new Dulce("Supercoco", "Colombina", 400.0, 4);
        Dulce d2 = new Dulce("Bombombun", "Colombina", 300.0, 8);
        Dulce d3 = new Dulce();

        d3.setNombre("Nucita");
        d3.setMarca("nacional de chocolates");
        d3.setPrecio(500.0);
        d3.setNivel_de_dulzura(9);

        System.out.println(d1.getNombre());
        System.out.println(d2.getMarca());
        System.out.println(d3.getNombre());

        Pinguino happyfeet = new Pinguino();
        System.out.println(happyfeet.hacerRuido());

        Tiburon lenny = new Tiburon();
        System.out.println(lenny.hacerRuido());

        Animal mipresidente = new Animal() {
            @Override
            public String hacerRuido() {
                return "Duelale a quien le duela";
            }

            @Override
            public int devolverAltura() {
                return -3;
            }
        };
        
        System.out.println(mipresidente.hacerRuido());

    }

}

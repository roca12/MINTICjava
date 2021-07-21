package herencia;

public class Principal {

    public static void main(String[] args) {

        Abuelo camilo_andres = new Abuelo();
        camilo_andres.accesorio = "reloj";
        camilo_andres.herencia_monetaria = 1000000;
        camilo_andres.mascota = "hamster";
        camilo_andres.vehiculo = "moto clasica";
        System.out.println(camilo_andres.accesorio);

        Abuelo deisy = new Abuelo("gato", 500000000, "mustang", "tiara");
        System.out.println(deisy.herencia_monetaria);

        Papa rosendo = new Papa();
        rosendo.accesorio = "portail";
        rosendo.herencia_monetaria = 500000000;
        rosendo.mascota = "perrito";
        rosendo.vehiculo="camioneta";
        System.out.println(rosendo.vehiculo);

        Papa lino = new Papa("Apartamento", "Samsung", "Millonarios");
        System.out.println(lino.obtenerDatos());
        
        
        Papa laura = new Papa("finca", "motorola", "America", "perro", 300000000, "moto", "fotografia");
        System.out.println(laura.obtenerDatos());
        
        System.out.println(laura);
        System.out.println(lino);
        
        Hijo juan_pablo = new Hijo("play", "facebook", 3, "casa", "iphone", "millonarios", "perro", 30000000, "pickup", "bufanda");
        
        
        
        System.out.println(camilo_andres.obtenerDatos());
        System.out.println(laura.obtenerDatos());
        System.out.println(juan_pablo.obtenerDatos());

    }

}

package herencia;

public class Principal {

    public static void main(String[] args) {
//        Abuelo caro = new Abuelo("Caballito de madera", 10000000, "Tortuga", "Anillo");
//        System.out.println(caro.mostrarTodosLosDatos());
//        Papa stiven = new Papa();
//        System.out.println(stiven.mostrarTodosLosDatos());
//        stiven.juguete="Volqueta";
//        stiven.mascota="Perro";
//        stiven.herencia_monetaria=10000000;
//        stiven.accesorio="Reloj";
//        System.out.println(stiven.mostrarTodosLosDatos());
//        
//        Papa daniel= new Papa();
//        System.out.println(daniel.mostrarTodosLosDatos());
//        
//        
//        Papa karen= new Papa("Kia", "Pacific", 30000000, "Caja musical", 3_000_000, "Pajaros", "Collar");
//        System.out.println(karen.mostrarTodosLosDatos());
//        
//        
//        Hijo ivonne = new Hijo();

        Estudiante e1 = new Estudiante(192432, 5, "Pablo Londoño", "Ruso", 180, 50, "M");
        Profesor p1 = new Profesor("Seguridad", "Ing. telecomunicaciones", "Nocturno", 50000000, "Cesar Hernandez", "Colombiano", 180, 70, "M");
        Administrativo a1 = new Administrativo("Rector", "Ingeniero", "Rectoria", 12000000, "Jesus Layton", "Polombiano", 180, 80, "M");
        Persona p4 = new Profesor();
        Persona p2 = new Estudiante();
        Persona p3 = new Administrativo();
        Object o1 = new Persona();
        Object o2 = new Administrativo();

    }

}

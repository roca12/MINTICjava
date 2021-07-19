package herencia;

public class Principal {

    public static void main(String[] args) {
        Abuelo miabuelo = new Abuelo();
        Papa mipapa = new Papa();

        Persona sergio = new Persona('M', "Sergio Luis", 180, "Polombiana", 86);
        Estudiante juan_pablo = new Estudiante(1995, 10, "Programador", 'M', "Juan Pablo Moreno", 171, "Senegales", 60);
        Profesor andryuz = new Profesor(2500000, "Ingles", 'M', "Andryuz Mateus", 180, "Koreano del norte", 75);
        Estudiante jessica = new Estudiante(529157, 7, "Diseño grafico");
        Persona laura = new Persona();

        System.out.println(sergio.devolverDatosBasicos());
        System.out.println(juan_pablo.devolverDatosBasicos());
        System.out.println(andryuz.devolverDatosBasicos());
        System.out.println(jessica.devolverDatosBasicos());
        System.out.println(laura.devolverDatosBasicos());

        laura.estatura = 170;
        laura.nacionalidad = "Peruana";
        laura.nombre = "Laura Gonzalez";
        laura.sexo = 'F';
        laura.peso = 60;
        
        System.out.println(laura.devolverDatosBasicos());
        
        System.out.println(juan_pablo.datosCompletos());

    }

}

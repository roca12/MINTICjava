package primerMVC;

import java.util.ArrayList;
import java.util.Scanner;

public class Vista {

    public static void main(String[] args) {
//        //objeto lector
//        Scanner lector = new Scanner(System.in);
//        
//        //instancias
//        Persona carolina = new Persona("Carolina", "F", 25 , "Lasagna");
//        Persona nicolas= new Persona("Nicolas", "M", 27, "Filet mignon");
//        Persona pablo = new Persona("Pablo", "M", 52, "Pasta");
//
//        //crear instancia desde teclado
//        String nombre=lector.nextLine();
//        String sexo = lector.nextLine();
//        //int()
//        int edad = Integer.parseInt(lector.nextLine());
//        String comida_favorita= lector.nextLine();
//        
//        Persona nuevapersona= new Persona(nombre, sexo, edad, comida_favorita);
//        
//        System.out.println("Nombre: "+nuevapersona.nombre );
//        System.out.println("Sexo: "+nuevapersona.sexo);
//        System.out.println("Edad: "+nuevapersona.edad);
//        System.out.println("Comida favorita: "+nuevapersona.comida_favorita);
//        
//        nuevapersona.comida_favorita=lector.nextLine();
//        
//        System.out.println("Nombre: "+nuevapersona.nombre );
//        System.out.println("Sexo: "+nuevapersona.sexo);
//        System.out.println("Edad: "+nuevapersona.edad);
//        System.out.println("Comida favorita: "+nuevapersona.comida_favorita);

        //objeto lector
        Scanner lector = new Scanner(System.in);
        Controlador micontrolador = new Controlador();
        while (true) {
            System.out.println("Programa base de datos de personas de la registraduria");
            System.out.println("Que desea realizar? (1-crear persona, 2- mostar personas)");
            String opcion = lector.nextLine();
            switch (opcion) {
                case "1":

                    System.out.println("Creando nuevo dato");

                    System.out.println("Nombre:");
                    String nombre = lector.nextLine();

                    System.out.println("Sexo:");
                    String sexo = lector.nextLine();

                    System.out.println("Edad:");
                    int edad = Integer.parseInt(lector.nextLine());

                    System.out.println("Comida favorita:");
                    String comida_favorita = lector.nextLine();

                    micontrolador.crearPersona(nombre, sexo, edad, comida_favorita);

                    System.out.println("Persona agregada con exito");
                    break;

                case "2":

                    System.out.println("Lista de personas");
                    ArrayList<Persona> resultado = micontrolador.obtenerLista();
                    for (Persona p : resultado) {
                        System.out.println("Nombre: " + p.nombre);
                        System.out.println("Sexo: " + p.sexo);
                        System.out.println("Edad: " + p.edad);
                        System.out.println("Comida favorita: " + p.comida_favorita);
                    }
                    break;

            }

        }

    }

}

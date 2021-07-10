package mvc;

import java.util.ArrayList;
import java.util.Scanner;

public class Vista {

    public static void main(String[] args) {
        //instancia del controlador
        Controlador micontrolador = new Controlador();
        //lectura por teclado
        Scanner lector = new Scanner(System.in);
        System.out.println("Registraduria nacional de estado civil");
        System.out.println("HACIENDO VOTOS DE MUERTOS DESDE EL 72");
        while (true) {
            System.out.println("1) crear persona 2) mostrar lista");
            String op = lector.nextLine();
            switch (op) {
                case "1":
                    System.out.println("Inserte los datos de la persona");
                    String nombre = lector.nextLine();
                    String comida_favorita = lector.nextLine();
                    int edad = Integer.parseInt(lector.nextLine(), 10);
                    int documento = Integer.parseInt(lector.nextLine(), 10);
                    micontrolador.crearPersona(nombre, comida_favorita, edad, documento);
                    break;

                case "2":
                    System.out.println("Imprimiendo la lista");
                    ArrayList<Persona> resultados = micontrolador.mostrarPersonas();
                    for (Persona personaactual : resultados) {
                        System.out.println(personaactual.nombre);
                        System.out.println(personaactual.comida_favorita);
                        System.out.println(personaactual.edad);
                        System.out.println(personaactual.documento);
                    }
                    break;
            }

        }

    }

}

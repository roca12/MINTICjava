package carpeta3;

import carpeta1.Persona;
import java.util.ArrayList;
import java.util.Scanner;

public class EstructurasDeControl {
    
    static class Casa{
    
    }

    public static void main(String[] args) {
        //condicionales
        Persona sergio = new Persona("M", 183, "Mantequilla de mani");
        if (sergio.altura > 170) {
            System.out.println("El hombre es alto");
        } else {
            System.out.println("El hombre el bajito");
        }

        Persona alba = new Persona("F", 163, "Pasta");

        if (alba.comida_favorita.equals("Pizza")) {
            System.out.println("Que no tenga piña");
        } else if (alba.comida_favorita.equals("Pasta")) {
            System.out.println("Colocale boloñesa");
        } else if (alba.comida_favorita.equals("Camarones")) {
            System.out.println("Que esten bien concinados");
        }

        //while 
        Scanner lector = new Scanner(System.in);
        ArrayList<Persona> lista = new ArrayList<>();
        //int()
        while (lista.size()<4){
            lista.add(new Persona(lector.nextLine(), Integer.parseInt(lector.nextLine()), lector.nextLine()));
        }
        
        while (lista.size()>0){
            Persona personaactual=lista.get(0);
            System.out.println(personaactual.sexo+" "+personaactual.altura+" "+personaactual.comida_favorita);
            lista.remove(0);
        }

        //for
        for (int veces = 0; veces < 10; veces += 2) {
            System.out.println("Estamos en el ciclo " + veces);
        }
        System.out.println("");
        
         for (int veces = 10; veces > -1; veces -=2) {
            System.out.println("Estamos en el ciclo " + veces);
        }

        //for each
        String texto = "los pollitos dicen pío, pío";
        for (char letra : texto.toCharArray()) {
            System.out.println("La letra es "+letra);
        }
        
        ArrayList<Persona> lista2= new ArrayList<>();
        lista2.add(new Persona("M", 172, "Ajiaco"));
        lista2.add(new Persona("F", 169, "Ceviche"));
        lista2.add(new Persona("M", 170, "Mojarra"));
        
        for (Persona p : lista2) {
            System.out.println(p.sexo+" "+p.altura+" "+p.comida_favorita);
        }
        
        int[] numeros ={3,4,5,6,7,8,9,0};
        for (int n : numeros) {
            System.out.println("El numero es "+n);
        }
       
    }

}


package carpeta1;


import java.util.Scanner;


public class Principal {
   
    public static void main(String[] args) {
        
        //instanciando persona
        Persona mhartim = new Persona("M", 165, "Arroz");
        Persona carol = new Persona("F", 167, "Sushi");
        System.out.println("Mhartim");
        System.out.println("Sexo "+mhartim.sexo);
        System.out.println("Altura "+mhartim.altura);
        System.out.println("Comida favorita "+mhartim.comida_favorita);
        
        //objeto scanner
        Scanner lector= new Scanner(System.in);
        
        //lectura de datos con conversion directa
        String sexo=lector.nextLine();
        int altura =lector.nextInt();
        //quemar linea
        lector.nextLine();
        String comida=lector.nextLine();
        
        Persona geraldin =new Persona(sexo, altura, comida);
        
        System.out.println("Geraldin");
        System.out.println("Sexo "+geraldin.sexo);
        System.out.println("Altura "+geraldin.altura);
        System.out.println("Comida favorita "+geraldin.comida_favorita);
        
        Persona sergio = new Persona("M");
        System.out.println("Sergio");
        System.out.println("Sexo "+sergio.sexo);
        System.out.println("Altura "+sergio.altura);
        System.out.println("Comida favorita "+sergio.comida_favorita);
        
        Persona jessica = new Persona();
        System.out.println("Jessica");
        System.out.println("Sexo "+jessica.sexo);
        System.out.println("Altura "+jessica.altura);
        System.out.println("Comida favorita "+jessica.comida_favorita);
        
        jessica.sexo="F";
        jessica.altura=163;
        jessica.comida_favorita="Lasagna";
        
        System.out.println("Jessica");
        System.out.println("Sexo "+jessica.sexo);
        System.out.println("Altura "+jessica.altura);
        System.out.println("Comida favorita "+jessica.comida_favorita);
        
        
     
    }
    
}

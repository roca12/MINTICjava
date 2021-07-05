
package carpeta1;

import java.util.Scanner;


public class Celular {

    //funcion principal
    public static void main(String[] args) {
        //Numero entero
        int el_mas_pequeno=-2147483648;
        int el_mas_grande=2147483647;
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        
        //Numero entero largo
        long long_mas_pequeno=Long.MIN_VALUE;
        long long_mas_grande=Long.MAX_VALUE;
        System.out.println(long_mas_pequeno+" "+long_mas_grande);
        long cedula =123456789087865L;
        System.out.println(cedula);
        
        //numeros flotantes
        float numero_de_lina=3.1416f;
        float numero_de_lino=2.272530f;
        System.out.println(numero_de_lina+" "+numero_de_lino);
        
        //numeros flotantes largos
        double numero_de_william=80305120.50;
        double numero_de_anamaria=36786868.765757;
        System.out.println(numero_de_william+"->"+numero_de_anamaria);
        
        //Cadenas de caracteres
        String cadena ="Hola mundo!";
        String comidas ="Pizza de piña, Arroz con pollo, Spaguetti, Lasagna, Camarones al ajillo";
        System.out.println(cadena+" Hoy tengo antojo de comer "+comidas);
        
        //caracter solitario
        char char_de_angie='d';
        char char_de_brenda='2';
        char char_de_diego='@';
        System.out.println((int) char_de_angie);
        int numero_de_luis=100;
        System.out.println((char) numero_de_luis);
        System.out.println(char_de_angie+char_de_brenda+char_de_diego);
        System.out.println(
                String.valueOf(char_de_angie)+
                String.valueOf(char_de_brenda)+
                String.valueOf(char_de_diego));  
        
        //booleanos
        boolean tome_tinto=false;
        boolean deisy_ha_comido=true;
        if (tome_tinto==false){
            System.out.println("Voy por un tinto");
        }
        if (deisy_ha_comido){
            System.out.println("Ya esta llenita");
        }
        
        //lecturas por teclado
        Scanner lector =new Scanner(System.in);
        int num1;
        long num2;
        float num3;
        double num4;
        String cad;
        char c;
        
        num1=lector.nextInt();
        num2=lector.nextLong(2);
        num3=lector.nextFloat();
        num4=lector.nextDouble();
        lector.nextLine();
        cad=lector.nextLine();
        c=lector.next().charAt(0);
        
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(cad);
        System.out.println(c);
//        
//7
//1001010111010101010
//3,14
//6,54
//soy una cadena
//5
     
    }
}

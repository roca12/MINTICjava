
package calculadora;

import java.util.Scanner;

public class Vista {
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int num1,num2;
        num1=lector.nextInt();
        num2=lector.nextInt();
        int resultado=num1+num2;
        System.out.println(resultado);
        
        
        //mvc
        Controlador c = new Controlador();
        System.out.println(c.sumarNumeros(num1, num2));
        
    }
    
}

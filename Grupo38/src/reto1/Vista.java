package reto1;

import java.util.Scanner;

public class Vista {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int num1 = lector.nextInt();
        int num2 = lector.nextInt();

        int res = num1 + num2;
        System.out.println(res);

        Controlador contop = new Controlador();
        System.out.println(contop.sumarNumeros(num1, num2));
        System.out.printf("%.1f\n", contop.sumarNumeros(num1, num2));

        int num3 = 999;
        float num4 = (float) num1;

        int op = 3;
        switch (op) {
            case 1:
            case 2:
                System.out.println("numeros 1 y 2");
                break;
            case 3:
            case 4:

        }
        
        
        
    }
}

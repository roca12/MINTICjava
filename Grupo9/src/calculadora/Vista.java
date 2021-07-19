package calculadora;


import java.util.Scanner;

public class Vista {

    public static void main(String[] args) {
        System.out.println("Calculadora del grupo 9");
        System.out.println("Inserte 2 numeros");

        int num1, num2;
        Scanner lector = new Scanner(System.in);

        num1 = lector.nextInt();
        num2 = lector.nextInt();

        int resultado = num1 + num2;

        System.out.println("El resultado es " + resultado);

        //mvc
        System.out.println("Calculadora del grupo 9");
        System.out.println("Inserte 2 numeros");

        int num3, num4;
        Scanner lector2 = new Scanner(System.in);

        num3 = lector.nextInt();
        num4 = lector.nextInt();

        Controlador c = new Controlador();
        int resultado2 = c.sumarNumeros(num3, num4);

        System.out.println("El resultado es " + resultado2);

    }

}

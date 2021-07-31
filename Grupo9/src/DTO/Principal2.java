package DTO;

import java.util.Scanner;

public class Principal2 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int op = lector.nextInt();
        switch (op) {
            case 1:
            case 3:
                System.out.println("Este es un numero 1");
                break;
            case 2:
            case 4:
                System.out.println("Este es un numero 2");
                break;
            default:
                System.out.println("Este es otro numero diferente");
                break;
               
        }
    }

}

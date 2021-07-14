package Dispositivos;

import java.util.Scanner;

public class TEST {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        while (true) {
            System.out.println("Menu: 1) seguir 2) salir");
            int op = lector.nextInt();
            if (op == 1) {
                System.out.println("Sigo");
            } else {
                break;
            }

        }
    }

}

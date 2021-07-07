/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodigoBasico;

import java.util.Scanner;

/**
 *
 * @author Diego Rodriguez (roca12)
 */
public class EstructurasDeControl {

    public static void condicionales(int numero) {

        if (numero % 2 == 0) {
            System.out.println("El numero es par");
        } else if (numero == 3) {
            System.out.println("El numero ingresado es un 3");
        } else {
            System.out.println("El numero es impar");
        }

    }

    public static void cicloFor(int desde, int hasta, int salto) {
        //ciclo for ascendente
        for (int veces = desde; veces < hasta; veces += salto) {
            System.out.println("Estoy en el numero" + veces);
        }

        //ciclo for ascendente
        for (int veces = hasta; veces > desde; veces -= salto) {
            System.out.println("Estoy en el numero" + veces);
        }

        for (int dulces = 1; dulces < 10; dulces++) {
            System.out.println("Me he comido " + dulces + " dulces");
        }

    }

    public static void cicloForEach(int[] numeros) {

        for (int numero : numeros) {
            System.out.println("El dato de numero es " + numero);
        }

        String frase = "la vida es bella hay que disfrutarla";
        for (Character letra : frase.toCharArray()) {
            System.out.println("La siguente letra es " + letra);
        }

        String[] separados = "la vida es bella hay que disfrutarla".split(" ");
        for (String palabra : separados) {
            System.out.println("La siguente palabra es " + palabra);
        }
    }

    public static void ciclosWhile() {
        int chocolates = 10;
        while (chocolates != 0) {
            System.out.println("Tengo " + chocolates + " Chocolates");
            chocolates--;
        }

        int contador = 0;
        while (true) {
            contador++;
            System.out.println("He atendido a " + contador + " clientes");
            if (contador == 6) {
                break;
            }
        }
    }

    public static void controlDeExepciones() throws Exception {
        try {
            int numero = Integer.parseInt("345gh");

        } catch (Exception e) {
            System.out.println("El valor dado no es un numero valido");
        }

        throw new Exception("Quisimos que el programa se suicidara");
    }

    public static void switchCase() {
        int numero = 99;
        switch (numero) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
                break;
            default:
                System.out.println("Ninguno de los anteriores");
                break;
        }

        String vehiculo = "Patines";
        switch (vehiculo) {
            case "Carro":
            case "Moto":
            case "Camion":
                System.out.println("Este vehiculo genera CO2");
                break;
            case "Bicicleta":
            case "Monopatin":
            case "Patines":
                System.out.println("Este medio es amigable con el ambiente");

        }

    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        int num1;
        num1=lector.nextInt();
        lector.nextLine();
        String cad=lector.nextLine();
    }

}

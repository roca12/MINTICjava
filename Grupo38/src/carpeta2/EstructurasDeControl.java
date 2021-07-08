package carpeta2;


import java.util.ArrayList;
import java.util.Scanner;

public class EstructurasDeControl {

    public static void main(String[] args) throws Exception {
        //lectura basica
        Scanner lector = new Scanner(System.in);
        
        //condicionales
        boolean lino_tiene_frio = lector.nextBoolean();
        
        
        if (lino_tiene_frio == true) {
            System.out.println("Que se ponga una cobija");
        } else {
            System.out.println("Se encuentra muy a gustin");
        }

        int numero_de_juandavid = lector.nextInt();
        if (numero_de_juandavid == 1) {
            System.out.println("Es 1");
        } else if (numero_de_juandavid == 2) {
            System.out.println("Es 2");
        } else if (numero_de_juandavid == 3) {
            System.out.println("Es 3");
        }

        //ciclo for
        for (int veces = 0; veces < 10; veces++) {
            System.out.println("Estoy en el ciclo numero " + veces);
        }

        for (int chocolates = 20; chocolates > -1; chocolates-=2) {

            System.out.println("Me comi un chocolate, me quedan " + chocolates);
        }
        //ciclos while
        boolean trabajando = true;
        while (trabajando) {
            System.out.println("Sigo trabajando");
            System.out.println("Seguire trabajando?");
            String opcion = lector.nextLine();
            if (opcion.toLowerCase().contains("si")) {
                continue;
            } else {
                System.out.println("Termine de trabajar");
                break;
            }
        }

        int chocolatinas2 = 10;
        while (chocolatinas2 != -1) {
            System.out.println("Tengo " + chocolatinas2 + " chocolatinas");
            chocolatinas2--;

        }
        //for each
        String frase = "jajajaaa";
        for (char letra : frase.toCharArray()) {
            System.out.println("La letra siguiente es "+letra);
        }
        
        int[] vector_de_numeros={2,3,4,5,6,7,8,9,0};
        for (int numero : vector_de_numeros) {
            System.out.println("El numero actual es "+numero);
        }
        
        //vectores
        float[] vector= new float[20];
        //lista
        ArrayList<Long> lista = new ArrayList<>();
        
        //switch case
        int numeroarevisar = 4;
        switch (numeroarevisar) {
            case 1:
                System.out.println("ES 1");
                break;
            case 2:
                System.out.println("ES 2");
                break;
            case 3:
                System.out.println("ES 3");
                break;
            case 4:
                System.out.println("ES 4");
                break;
            default:
                System.out.println("Ninguno de los anteriores");
                break;
        }

        switch (numeroarevisar) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
                System.out.println("Es impar");
                break;

            case 2:
            case 4:
            case 6:
            case 8:
            case 0:
                System.out.println("Es par");
                break;
        }

        //try catch
        try {
            int numerox=lector.nextInt();
            
        } catch (Exception e) {
            System.out.println("El dato no es valido");
        }
        throw new Exception("Queria que el programa se suicidara");
    }

}

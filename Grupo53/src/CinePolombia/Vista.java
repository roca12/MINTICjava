package CinePolombia;

import java.util.Scanner;

public class Vista {

    public static void main(String[] args) {
        //objeto lector
        Scanner lector = new Scanner(System.in);
        
        //instancia de controlador
        Controlador micontrolador= new Controlador();
        System.out.println("Cine polombia");
        
        //si no hay break, continua infinitamente
        while (true) {
            
            System.out.println("Menu 1) agregar pelicula 2) mostrar peliculas");//print
            //leer opcion
            
            String opcion=lector.nextLine();//input
            //menú
            //crear peliculas
            if (opcion.contains("1")){
                System.out.println("Inserte los datos");
                String titulo =lector.nextLine();//input
                String genero =lector.nextLine();//input
                int sillas_disponibles=Integer.parseInt(lector.nextLine());//int(input())
                micontrolador.crearNuevaPelicula(titulo, genero, sillas_disponibles);
                
            //mostrar peliculas
            }else if (opcion.contains("2")){
                System.out.println(micontrolador.mostrarPeliculas());
            }
            
        }

    }

}

package archivos2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class Principal {

    public static void main(String[] args) {
        abrirArchivo();
        crearYEscribirArchivo();

    }

    public static void crearYEscribirArchivo() {
        try {
            //paso 1
            //creando instancias
            FileWriter creador = new FileWriter("src/archivos2/nuevo.txt");
            
            PrintWriter escritor = new PrintWriter(creador);
            
            //paso 2
            // escribir cosas dentro del archivo
            escritor.println("Mira mamá, mi primer archivo en java");
            
            for (int i = 0; i < 10; i++) {
                escritor.println("Numero "+i);
            }
            
            //paso 3
            //cerrar el archivo
            creador.close();
            
            
        } catch (IOException ex) {
            System.out.println("Error al crear el archivos");
        }
        

    }

    public static void abrirArchivo() {

        //paso 1
        //Cargando el archivo en memoria
        File archivo = new File("src/archivos2/tabla.csv");
        //revisando el peso del archivo
        System.out.println("El peso del archivo es " + archivo.length());

        //paso 2
        //crear lector y verificar existencia del archivo
        Scanner lector = null;
        try {
            lector=new Scanner(archivo);

            //paso 3 
            //leer contenido y copiarlo en el programa
            ArrayList<String> lista_de_lineas = new ArrayList<>();

            //verificar si tiene siguiente linea
            while (lector.hasNextLine()) {
                //si la tiene, leala
                lista_de_lineas.add(lector.nextLine());
            }

            //paso 4 
            // mostrar lo que lei y copie anteriormente (Paso 3)
            for (String linea : lista_de_lineas) {
                System.out.println(linea);
            }
            
            //paso 4.5 
            //eliminar titulos
            lista_de_lineas.remove(0);

            //paso 5
            // de datos crudos a instancias 
            ArrayList<Pais> lista_paises = new ArrayList<>();
            for (String linea : lista_de_lineas) {
                String[] separadas = linea.split(",");
                lista_paises.add(new Pais(separadas[0], separadas[1], Long.parseLong(separadas[2])));
            }

        } catch (FileNotFoundException ex) {
            System.out.println("No se encontro el archivo especificado " + ex.getMessage());
        }
        
        

    }

}

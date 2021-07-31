package archivos2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Principal {

    public static void main(String[] args) {
        //paso 1
        //crear objetos y cargar archivo
        File archivo = new File("src/archivos2/tabla.csv");
        System.out.println(archivo.length());

        //paso 2 
        //leer el contenido del archivo
        ArrayList<String> lista_de_lineas = new ArrayList<>();
        Scanner lector = null;
        
        try {
            lector = new Scanner(archivo);
        } catch (FileNotFoundException ex) {
            System.out.println("Error al abrir el archivo " + ex.getMessage());
        }

        while (lector.hasNextLine()) {
            //System.out.println(lector.nextLine());
            lista_de_lineas.add(lector.nextLine());
        }
        
        //paso 3
        // de crudo a instancia
        
        ArrayList<Pais> lista_de_paises = new ArrayList<>();
        
        //paso 3.5
        // quitar titulos
        lista_de_lineas.remove(0);
        
        for (String linea : lista_de_lineas) {
            String [] separado = linea.split(",");
            System.out.println(separado[0]);
            System.out.println(separado[1]);
            System.out.println(separado[2]);
            lista_de_paises.add(new Pais(separado[0], separado[1], Long.parseLong(separado[2])));
         
        }
        
        //paso 4
        //verificar datos
        System.out.println(lista_de_paises.size());
        
        
        
        try {
            //////////
            
            //paso 1
            //crear instancias

            FileWriter creador = new FileWriter("src/archivos2/nuevo.txt");
            PrintWriter escritor = new PrintWriter(creador);
            
            //paso 2
            //llenar
            escritor.println("Hola mamá, este es mi primer archivo escrito en llaba");
            
            
            //paso 3
            //cerrar
            creador.close();
            
        } catch (IOException ex) {
            System.out.println("Error al escribir un archivo");
        }
        

    }

}

package serializacion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class Principal {

    //lienzo y pintor
    static FileOutputStream archivo;
    static ObjectOutputStream salida;

    //lienzo entrada, lector
    static FileInputStream archivoentrada;
    static ObjectInputStream entrada;

    static void crearYAbrir() {
        //creador de archivos
        try {
            archivo = new FileOutputStream("src/serializacion/salida.txt");
        } catch (FileNotFoundException ex) {
            System.out.println("Fallo al crear el archivo");
        }

        //escritor de archivos
        try {
            salida = new ObjectOutputStream(archivo);
        } catch (IOException ex) {
            System.out.println("Fallo al crear el archivo 2");
        }

    }

    static void escribir(Restaurante res_a_escribir) {
        if (salida != null) {
            try {
                salida.writeObject(res_a_escribir);
            } catch (IOException ex) {
                System.out.println("Error al escribir el archivo");
            }
        }
    }

    static void cerrar() {
        if (salida != null) {
            try {
                salida.close();
            } catch (IOException ex) {
                System.out.println("Error al cerrar el archivo");
            }
        }

    }

    static void buscarYAbrir() {
        try {
            archivoentrada = new FileInputStream("src/serializacion/salida.txt");
        } catch (FileNotFoundException ex) {
            System.out.println("Error al abrir el archivo");
        }

        try {
            entrada = new ObjectInputStream(archivoentrada);
        } catch (IOException ex) {
            System.out.println("Error al leer el archivo");
        }

    }

    static Restaurante leer() {
        Restaurante recien_deserializado = null;
        try {
            recien_deserializado = (Restaurante) entrada.readObject();
        } catch (IOException ex) {
            System.out.println("Error al acceder al archivo");
        } catch (ClassNotFoundException ex) {
            System.out.println("Clase modelo a convertir no encontrada");
        }
        return recien_deserializado;
    }

    static void cerrarLectura() {
        if (entrada != null) {
            try {
                entrada.close();
            } catch (IOException ex) {
                System.out.println("Error al cerrar el archivo");
            }

        }
    }

    public static void main(String[] args) {
        Restaurante camilo = new Restaurante("PizzaConPiña", 10);
        crearYAbrir();
        escribir(camilo);
        cerrar();
        
        
        
        buscarYAbrir();
        Restaurante deserializado = leer();
        cerrarLectura();
        
        System.out.println(deserializado.getEstrellas());
    }

}

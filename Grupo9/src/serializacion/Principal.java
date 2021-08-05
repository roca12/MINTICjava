package serializacion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Principal {

    //Lienzo y pintor
    static FileOutputStream archivosalida;
    static ObjectOutputStream escritor;

    //lienzo y lector
    static FileInputStream archivoentrada;
    static ObjectInputStream lector;

    //SERIALIZAR
    //paso 1 inicializar objetos
    static void inicializar() {
        try {
            archivosalida = new FileOutputStream("src/serializacion/salida.txt");
        } catch (FileNotFoundException ex) {
            System.out.println("Error al crear el archivo");
        }

        try {
            escritor = new ObjectOutputStream(archivosalida);
        } catch (IOException ex) {
            System.out.println("Error al acceder al archivo");
        }
    }

    //paso 2
    //escribir objetos en el archivo
    static void escribir(Comidas comida_a_escribir) {
        if (escritor != null) {
            try {
                escritor.writeObject(comida_a_escribir);
            } catch (IOException ex) {
                System.out.println("Error al escribir el archivo");
            }
        }
    }

    //paso 3
    // cerrar archivo
    static void cerrarsalida() {
        if (escritor != null) {
            try {
                escritor.close();
            } catch (IOException ex) {
                System.out.println("Error al cerrar el archivo");
            }
        }
    }

    // DESERIALIZAR
    // paso 1
    //inicialización
    static void inicializar2() {
        try {
            archivoentrada = new FileInputStream("src/serializacion/salida.txt");
        } catch (FileNotFoundException ex) {
            System.out.println("Error al encontrar el archivo");
        }

        try {
            lector = new ObjectInputStream(archivoentrada);
        } catch (IOException ex) {
            System.out.println("Error al acceder al archivo");
        }

    }

    //paso 2
    // convirtiendo a objeto desde binario
    static Comidas leer() {
        Comidas temporal = null;
        if (lector != null) {
            try {
                temporal = (Comidas) lector.readObject();
            } catch (IOException ex) {
                System.out.println("Error al leer el archivo");
            } catch (ClassNotFoundException ex) {
                System.out.println("Error al convertir el archivo");
            }

        }
        return temporal;

    }

    //paso 3
    //cerrar
    static void cerrar2() {
        if (lector != null) {
            try {
                lector.close();
            } catch (IOException ex) {
                System.out.println("Error al cerrar el archivo");
            }
        }

    }

    public static void main(String[] args) {
        Comidas c = new Comidas("Cazuela de mariscos", "Benjamin");
        inicializar();
        escribir(c);
        cerrarsalida();

        inicializar2();
        Comidas c2 = leer();
        System.out.println(c2.getNombre_persona());
        cerrar2();
    }
}

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

    //SERIALIZACION
    //paso 1
    // creacion de los objetos
    static FileOutputStream archivo_salida;
    static ObjectOutputStream escritor;
    
    //DESERIALIZACION
    //paso 1 creacion de los objetos
    static FileInputStream archivo_entrada;
    static ObjectInputStream lector;

    //paso 1.5 inicializar
    static void inicializarsalida() {
        
        try {
            archivo_salida = new FileOutputStream("src/serializacion/salida.txt");
        } catch (FileNotFoundException ex) {
            System.out.println("Error al crear el archivo");
        }
        
        try {
            escritor = new ObjectOutputStream(archivo_salida);
        } catch (IOException ex) {
            System.out.println("Error al acceder al archivo");
        }
        
    }

    //paso 2
    //escribir datos
    static void escribir(Planeta planeta_a_escribir) {
        if (escritor != null) {
            try {
                escritor.writeObject(planeta_a_escribir);
                
            } catch (IOException ex) {
                System.out.println("Error al escribir el archivo");
            }
        }
    }
    
    //paso 3
    // cerrar el archivo
    static void cerrarSalida(){
        if (escritor!=null){
            try {
                escritor.close();
            } catch (IOException ex) {
                System.out.println("Error al cerrar el archivo");
            }
        }
    }
    
    
    //DESERIALIZACION
    //paso 1.5
    //inicializacion
    
    static void inicializarentrada(){
        try {
            archivo_entrada= new FileInputStream("src/serializacion/salida.txt");
        } catch (FileNotFoundException ex) {
            System.out.println("Error al abrir el archivo");
        }
        
        try {
            lector= new ObjectInputStream(archivo_entrada);
        } catch (IOException ex) {
            System.out.println("Error al acceder al archivo");
        }
    }
    
    //paso 2
    //leer y convertir
    
    static Planeta leer(){
        Planeta temporal=null;
        if (lector!=null){
            try {
                temporal=(Planeta)lector.readObject();
            } catch (IOException ex) {
                System.out.println("Error al leer el archivo");
            } catch (ClassNotFoundException ex) {
                System.out.println("Error en la conversion");
            }
        
        }
        return temporal;
    }
    
    //paso 3
    //cerrar
    
    static void cerrarLector(){
        if (lector!=null){
            try {
                lector.close();
            } catch (IOException ex) {
                System.out.println("Error al cerrar el archivo");
            }
        }
    }
    
    
    public static void main(String[] args) {
        //serializacion
        Planeta marte= new Planeta("Marte");
        inicializarsalida();
        escribir(marte);
        cerrarSalida();
        
        //deserializacion
        inicializarentrada();
        Planeta resultado = leer();
        System.out.println(resultado.getNombre());
        cerrarLector();
    }
    
}

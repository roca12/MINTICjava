package propiedades;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Principal {

    public static void main(String[] args) {
        

        try {
            System.out.println("Soy un texto de prueba");
            // creamos instancia para almacenar propiedades
            Properties archivo_propiedades = new Properties();
            //traer las propiedades a la instancia desde el archivo
            archivo_propiedades.load(new FileInputStream(new File("src/propiedades/mispropiedades.properties")));
            //saber carpeta actual
            System.out.println(System.getProperty("user.dir"));
            //obteniendo propiedades buscando su valor clave
            System.out.println(archivo_propiedades.get("juanpablo.juegofavorito"));
            System.out.println(archivo_propiedades.get("juanpablo.comidafavorita"));
            System.out.println(archivo_propiedades.get("jasson.juegofavorito"));
            System.out.println(archivo_propiedades.get("jasson.comidafavorita"));
            System.out.println(archivo_propiedades.get("laura.juegofavorito"));
            System.out.println(archivo_propiedades.get("laura.comidafavorita"));
            System.out.println(archivo_propiedades.get("yenireth.juegofavorito"));
        } catch (FileNotFoundException ex) {
            System.out.println("No se encontro el archivo");
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }

}

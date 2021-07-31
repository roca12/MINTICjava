package properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Principal {

    public static void main(String[] args) {
        Properties archivo_de_propiedades = new Properties();
        try {
            System.out.println(System.getProperty("user.dir"));
            archivo_de_propiedades.load(new FileInputStream(new File("src/properties/propiedades.properties")));
            System.out.println(archivo_de_propiedades.get("lino.juegofavorito"));
            System.out.println(archivo_de_propiedades.get("lino.comidafavorita"));
            System.out.println(archivo_de_propiedades.get("lino.colorfavorito"));
            System.out.println(archivo_de_propiedades.get("anamaria.juegofavorito"));
            System.out.println(archivo_de_propiedades.get("anamaria.comidafavorita"));
            System.out.println(archivo_de_propiedades.get("anamaria.colorfavorito"));
            System.out.println(archivo_de_propiedades.get("juanpablo.juegofavorito"));
            System.out.println(archivo_de_propiedades.get("juanpablo.comidafavorita"));
            System.out.println(archivo_de_propiedades.get("juanpablo.colorfavorito"));
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}

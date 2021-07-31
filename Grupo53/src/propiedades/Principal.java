package propiedades;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class Principal {

    public static void main(String[] args) {
        try {
            Properties todas_las_propiedades = new Properties();
            int numero = 2;
            if (numero == 1) {
                todas_las_propiedades.load(new FileInputStream(new File("src/propiedades/propiedades_es.properties")));

            } else {

                todas_las_propiedades.load(new FileInputStream(new File("src/propiedades/propiedades_en.properties")));
            }

            System.out.println(todas_las_propiedades.get("andersson.comidafavorita"));
            System.out.println(todas_las_propiedades.get("andersson.juegofavorito"));
            System.out.println(todas_las_propiedades.get("ivonne.comidafavorita"));
            System.out.println(todas_las_propiedades.get("ivonne.juegofavorito"));
            System.out.println(todas_las_propiedades.get("andres.comidafavorita"));
            System.out.println(todas_las_propiedades.get("andres.juegofavorito"));
            System.out.println(todas_las_propiedades.get("avion"));
            System.out.println(todas_las_propiedades.get("carro"));
            System.out.println(todas_las_propiedades.get("mar"));
            System.out.println(todas_las_propiedades.get("sol"));
            System.out.println(todas_las_propiedades.get("programacion"));
        } catch (FileNotFoundException ex) {
            System.out.println("Archivo no encontrado");
        } catch (IOException ex) {
            System.out.println("Error en la lectura");
        }
    }

}

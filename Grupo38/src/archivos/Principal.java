package archivos;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
       
        try {
            File mi_archivo = new File("src/archivos/tabla.csv");
            System.out.println(mi_archivo.getAbsolutePath());
            System.out.println(mi_archivo.length());

            Scanner lector = new Scanner(mi_archivo);

            ArrayList<Estudiante38> lista_de_estudiantes = new ArrayList<>();

            while (lector.hasNextLine()) {
                String linea_actual = lector.nextLine();
                String[] datos_separados = linea_actual.split(",");
                System.out.println(datos_separados[0]
                        + "->"
                        + datos_separados[1]
                        + "->"
                        + datos_separados[2]);

                lista_de_estudiantes.add(new Estudiante38(datos_separados[0], datos_separados[1], datos_separados[2]));
            }
            lista_de_estudiantes.remove(0);
            System.out.println(lista_de_estudiantes.size());

        } catch (Exception e) {
            System.out.println("Algo falló al abrir el archivo");
        }
    }

    static class Estudiante38 {

        String nombre, comida_favorita, color_favorito;

        public Estudiante38() {
        }

        public Estudiante38(String nombre, String comida_favorita, String color_favorito) {
            this.nombre = nombre;
            this.comida_favorita = comida_favorita;
            this.color_favorito = color_favorito;
        }

    }
}

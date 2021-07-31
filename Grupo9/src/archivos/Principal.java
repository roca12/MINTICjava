package archivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        try {
            //cargando archivo en memoria
            File mi_archivo = new File("src/archivos/tabla.csv");
            
            //verificando que se haya cargado bien
            System.out.println(mi_archivo.getAbsolutePath());
            System.out.println(mi_archivo.length());

            //lista en donde se almacenan las instancias de estudiantes
            ArrayList<Estudiante9> lista_de_estudiantes = new ArrayList<>();

            //objeto lector que ahora lee desde el archivo
            Scanner lector = new Scanner(mi_archivo);
            
            //mientras el archivo siga teniendo lineas, hacer algo
            while (lector.hasNextLine()) {
                
                //variable intermedia o de paso
                String linea_actual = lector.nextLine();

                // a,b,c me los separa en tres datos diferentes
                String[] separado = linea_actual.split(",");
                
                //imprime por separado las separaciones anteriores
                
                for (int i = 0; i < separado.length; i++) {
                    System.out.println(separado[i]);
                }
                for (String dato_separado : separado) {
                    System.out.println(dato_separado);
                }
                
                //luego de separar, creamos un nuevo estudiante con esos datos separados
                lista_de_estudiantes.add(new Estudiante9(separado[0], separado[1], separado[2]));

            }
            //contar cuantos estudiantes al final se crearon
            System.out.println(lista_de_estudiantes.size());

        } catch (FileNotFoundException excepcion_que_salto) {
            System.out.println("Fallo al abrir el archivo");
        }

    }

}

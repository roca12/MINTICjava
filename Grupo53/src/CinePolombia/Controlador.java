package CinePolombia;

import java.util.ArrayList;

public class Controlador {

    ArrayList<Pelicula> en_estreno = new ArrayList<>();

    public Controlador() {

        en_estreno.add(new Pelicula("Black Widow", "Acción", 50));
    }

    void crearNuevaPelicula(String titulo, String genero, int sillas_disponibles) {
        en_estreno.add(new Pelicula(titulo, genero, sillas_disponibles));
    }
    
    String mostrarPeliculas(){
        String resultado="";
        for (Pelicula p : en_estreno) {
            resultado+=p.titulo+" "+p.genero+" "+p.sillas_restantes+"\n";
        }
        return resultado;
    }
    
//    void restarDisponibles (String  nombre){
//        for (Pelicula pe : en_estreno) {
//            if (pe.equals(nombre)){
//                pe.sillas_restantes-3;
//            }
//        }
//    }

}

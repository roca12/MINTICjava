
package CinePolombia;

public class Pelicula {
    String titulo;
    String genero;
    int sillas_restantes=50;

    public Pelicula(String titulo, String genero, int sillas_restantes) {
        this.titulo = titulo;
        this.genero = genero;
        this.sillas_restantes = sillas_restantes;
    }   

    public Pelicula(String titulo, String genero) {
        this.titulo = titulo;
        this.genero = genero;
    }
    
    
}

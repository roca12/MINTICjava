
package herencia;


public class Hijo extends Papa{
    String consola_de_juego;
    String red_social;
    int no_deduas;

    public Hijo() {
    }

    public Hijo(String consola_de_juego, String red_social, int no_deduas) {
        this.consola_de_juego = consola_de_juego;
        this.red_social = red_social;
        this.no_deduas = no_deduas;
    }

    public Hijo(String consola_de_juego, String red_social, int no_deduas, String vivienda, String celular, String gusto_de_equipo) {
        super(vivienda, celular, gusto_de_equipo);
        this.consola_de_juego = consola_de_juego;
        this.red_social = red_social;
        this.no_deduas = no_deduas;
    }

    public Hijo(String consola_de_juego, String red_social, int no_deduas, String vivienda, String celular, String gusto_de_equipo, String mascota, long herencia_monetaria, String vehiculo, String accesorio) {
        super(vivienda, celular, gusto_de_equipo, mascota, herencia_monetaria, vehiculo, accesorio);
        this.consola_de_juego = consola_de_juego;
        this.red_social = red_social;
        this.no_deduas = no_deduas;
    }
    
    
    
}

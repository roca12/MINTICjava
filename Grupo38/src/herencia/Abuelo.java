
package herencia;


public class Abuelo {
    
    String mascota;
    long herencia_monetaria;
    String vehiculo;
    String accesorio;

    public Abuelo() {
    }

    public Abuelo(String mascota, long herencia_monetaria, String vehiculo, String accesorio) {
        this.mascota = mascota;
        this.herencia_monetaria = herencia_monetaria;
        this.vehiculo = vehiculo;
        this.accesorio = accesorio;
    }
    
    String obtenerDatos(){
        return "Las pertenencias del abuelo son "+mascota+" $"+herencia_monetaria+" "+vehiculo+" "+accesorio;
    }
}

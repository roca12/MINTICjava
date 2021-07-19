package herencia;

public class Abuelo {

    String juguete;
    long herencia_monetaria;
    String mascota;
    String accesorio;

    public Abuelo() {
        this.accesorio = "Celular";
        this.herencia_monetaria = 20000000;
        this.juguete = "PlayStation 5";
        this.mascota = "Perro";
    }

    public Abuelo(String juguete, long herencia_monetaria, String mascota, String accesorio) {
        this.juguete = juguete;
        this.herencia_monetaria = herencia_monetaria;
        this.mascota = mascota;
        this.accesorio = accesorio;
    }

    String mostrarTodosLosDatos() {
        return "Los datos son:\n " + juguete + "\n" + herencia_monetaria + "\n" + mascota + "\n" + accesorio;
    }

}

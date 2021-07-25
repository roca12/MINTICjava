package interfaces;

public class Senador implements Humano, SerVivo {

    @Override
    public String razonar() {
        return "No sabe razonar, no puede hacerlo";
    }

    @Override
    public String cocinar() {
        return "Pide puro domicilio";
    }

    @Override
    public String hablar() {
        return "Duelale a quien le duela";
    }

    @Override
    public String dormir() {
        return "En plena plenaria, como raro";
    }

    @Override
    public String comer() {
        return "Pa esto si estan plenos";
    }

    @Override
    public String reproducirse() {
        return "Todo el tiempo, por eso hay demasiados";
    }

    @Override
    public String toString() {
        return "La posicion en memoria de esto es:" + super.toString();
    }

}

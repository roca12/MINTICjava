
package interfaces;

public class Senador implements Humano,SerVivo{

    @Override
    public String hablar() {
        return "Duelale a quien le duela";
    }

    @Override
    public String cocinar() {
        return "No cocina, es puro domicilio";
    }

    @Override
    public String razonar() {
        return "Mi tortuga razona mas";
    }

    @Override
    public String comer() {
        return "Pa esto si estan prestos todo el tiempo";
    }

    @Override
    public String dormir() {
        return "En plena plenaria, el colmo";
    }

    @Override
    public String reproducirse() {
        return "Todo el tiempo, hay demasiados";
    }

    @Override
    public String toString() {
        return "La clase principal de este objeto es"+Senador.class; 
    }
    
    
}

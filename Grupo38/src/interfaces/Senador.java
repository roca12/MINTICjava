
package interfaces;


public class Senador implements Persona,SerVivo{

    @Override
    public String hablar() {
        return "Duelale a quien le duela";
    }

    @Override
    public String razonar() {
        return  "No se puede razonar con ellos";
    }

    @Override
    public String cocinar() {
        return "Solo pide domicilios";
    }

    @Override
    public String dormir() {
        return "En plena plenaria, como raro";
    }

    @Override
    public String reproducirse() {
        return "Pa eso si son buenos";
    }

    @Override
    public String comer() {
        return "Eso lo hacen muy bien";
    }

    @Override
    public String toString() {
        return "Info: "+hablar()+" "+cocinar()+" "+razonar();
    }
       
}

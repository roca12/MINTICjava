package interfaces;

public class Estudiante9 implements Humano, SerVivo {

    @Override
    public String razonar() {
        return "lo realiza cuando esta desarrollando el reto 2";
    }

    @Override
    public String cocinar() {
        return "Cocina en el desayuno, el almuerzo y la cena";
    }

    @Override
    public String hablar() {
        return "Cuando alguien esta malito por la vacuna";
    }

    @Override
    public String dormir() {
        return "No lo hace, esta haciendo el reto";
    }

    @Override
    public String comer() {
        return "En clase";
    }

    @Override
    public String reproducirse() {
       return  "Cuando tiene ganitas";
    }

}

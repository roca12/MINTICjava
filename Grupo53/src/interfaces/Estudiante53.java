package interfaces;

public class Estudiante53 implements Humano, SerVivo {

    @Override
    public String hablar() {
        return "Dice palabras pero comunmente no habla, le da pena";
    }

    @Override
    public String cocinar() {
        return "Prepara su desayuno, almuerzo y cena, y la come en clase";
    }

    @Override
    public String razonar() {
        return "Cuando esta pensando en el reto 2 ";
    }

    @Override
    public String comer() {
        return "En clase sin que el profe se de cuenta";
    }

    @Override
    public String dormir() {
        return "NO LO HACE ESTA PENSANDO EN EL RETO";
    }

    @Override
    public String reproducirse() {
        return "Cuando le dan ganitas";
    }

}

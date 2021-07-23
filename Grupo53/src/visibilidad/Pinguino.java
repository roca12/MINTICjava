package visibilidad;

public class Pinguino extends Animal {

    @Override
    public String hacerRuido() {
        return "Aaaaaaaaaa!!!";
    }

    @Override
    public int devolverAltura() {

        int altura = 80 + 98 + 32 / 5;
        return altura;
    }

}

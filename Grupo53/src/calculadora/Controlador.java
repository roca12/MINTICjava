package calculadora;

public class Controlador {

    String sumarNumeros(int num1, int num2) {
        Numero n1 = new Numero(num1);
        Numero n2 = new Numero(num2);
        int resultado = n1.valor + n2.valor;
        String res="La suma de los dos numero es "+resultado;
        return res;

    }

}

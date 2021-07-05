package carpeta1;

/**
 *
 * @author Diego Rodriguez (roca12)
 */
public class Celular {

    public static void main(String[] args) {
        //Numero entero
        int numero_de_deisy = 32;
        int numero_de_benja = -12;
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        //numero entero largo
        long numero_de_sergio = 27433;
        long numero_de_juansebas = 7272723838745L;
        System.out.println(numero_de_sergio);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        
        //numeros flotantes
        float numero_de_kevin=4.75f;
        float numero_de_july=1.56f;
        System.out.println(numero_de_kevin+numero_de_july);
        
        //numeros flotantes largos
        double numero_de_andres=520;
        double numero_de_claudia=950.10;
        System.out.println(numero_de_andres*numero_de_claudia);
        
        //Cadenas de caracteres
        String comidas="Nachos, "
                + "Salchipapa, "
                + "Sushi, "
                + "Butifarra, "
                + "Arroz Chino, "
                + "Asado Huilense, "
                + "Camarones al ajillo";
        System.out.println("Tengo antojo de "+comidas+numero_de_andres);
        
        //caracter solitario
        char c ='w';
        System.out.println((int)c);
        System.out.println((char)200);
        
        //booleanos
        boolean mhartim_tiene_hambre=true;
        boolean yeldi_desayuno=false;
        
        if (mhartim_tiene_hambre==true){
            System.out.println("Puede ir a comer algo");
        }
        
        if(yeldi_desayuno){
            System.out.println("Que bien , esta llenita");
        } else{
            System.out.println("A comer alguito");
        }
        
        // int -> Integer
        // long -> Long
        // float -> Float
        // double -> Double
        // char -> Character
        // boolean -> Boolean
        System.out.println(Long.parseLong("fa", 16));
        
    }
}

package Dispositivos;

public class Tablet {

    public static void main(String[] args) {
        //numero entero
        int numero_de_bryam = 5;
        int numero_de_carolina = 19;
        System.out.println(Integer.MIN_VALUE + " " + Integer.MAX_VALUE);
        System.out.println(numero_de_bryam + numero_de_carolina);

        //numero entero largo
        long numero_de_daniel = 2473495801000L;
        long numero_de_alexander=279958483729394798l;
        System.out.println(Long.MIN_VALUE + " " + Long.MAX_VALUE);
        System.out.println(numero_de_daniel - numero_de_alexander);
        
        //flotante 
        float numero_de_haider=3.5F;
        float numero_de_ivonne=14.6f;
        System.out.println(numero_de_haider*numero_de_ivonne);
       
        //flotante largo
        double numero_de_jeniffer=222.5000000000000000000000001;
        double numero_de_juancarlos=32.7;
        System.out.println(numero_de_jeniffer/numero_de_juancarlos);
        
        //cadenas de caracteres
        String comidas="Pasta,"
                + "Pizza,"
                + "hamburguesa,"
                + "Arroz con pollo,"
                + "sushi,punta de anca, "
                + "camarones, "
                + "asado, filet mignon";
        System.out.println("Tengo antojo de "+comidas);
        
        //caracter solitario
        char c='@';
        System.out.println((int)c);
        System.out.println((char)222);
        
        //booleanos
        boolean paula_tiene_frio=false;
        boolean jesus_tienes_hambre=true;
        
        if (paula_tiene_frio==false){
            System.out.println("Entonces tiene calor");
        }else{
            System.out.println("Ponte una cobija");
        }
        
        if (jesus_tienes_hambre){
            System.out.println("Una pizza de camarones");
        }
       
        
    }
}

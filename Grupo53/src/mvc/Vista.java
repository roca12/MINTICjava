package mvc;

public class Vista {

    public static void main(String[] args) {
        Controlador mi_controlador= new Controlador();
        System.out.println(mi_controlador.imprimirListaPanes());
        System.out.println("Precio de la docena de huevos por tipo");
        System.out.println(mi_controlador.costoPorDocena());

    }

}

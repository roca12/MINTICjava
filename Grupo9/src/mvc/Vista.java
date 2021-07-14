package mvc;

import java.util.ArrayList;

public class Vista {

    public static void main(String[] args) {
        //creo una copia de mi controlador
        Controlador micontrolador = new Controlador();
        System.out.println(micontrolador.obtenerListaPanes());
        
        ControladorHuevos huevocontroller=new ControladorHuevos();
        System.out.println(huevocontroller.obtenerListaHuevos());


    }

}

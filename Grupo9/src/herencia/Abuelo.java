package herencia;

import java.awt.Color;

public class Abuelo {

    String finca = "La granjita";
    long herencia_monetaria = 300000000;
    String automovil = "Renault 4";
    Color ojos = Color.BLACK;

    public Abuelo() {
    }
    
    

    String devolverNombreGranja() {
        return "El nombre de la granja familiar es " + finca;
    }

    String devolverHerenciaMonetaria() {
        return "Se tiene " + herencia_monetaria + " de herencia monetaria";
    }

}

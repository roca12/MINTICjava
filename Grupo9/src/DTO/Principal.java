package DTO;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        //LEctura y creacion
        Scanner lector = new Scanner(System.in);
        DulcesBO bo = new DulcesBO();
        for (int i = 0; i < 4; i++) {
            System.out.println("Inserte nombre del nuevo dulce");
            String nombre = lector.next();
            bo.crearDulce(nombre);

        }

        //obtencion y muestra
        System.out.println("");
        System.out.println("Lista dulces");
        int pos = 0;
        for (DulcesVO dulce_actual : bo.obtenerDulces()) {
            System.out.println(pos + " " + dulce_actual.getNombre());
            pos++;
        }
        System.out.println("");
        
        
        //eliminacion
        if (bo.eliminarDulce(2)) {
            System.out.println("Dato eliminado con exito");
        } else {
            System.out.println("Error al eliminar");
        }

        System.out.println("");
        
        //actualizacion
        if (bo.actualizarDulce(1, "Gomita")) {
            System.out.println("Dato actualizado con exito");
        } else {
            System.out.println("Error al actualizar");
        }
        
        //volver a mostrar
        System.out.println("");
        System.out.println("Lista dulces");
        int pos2 = 0;
        for (DulcesVO dulce_actual : bo.obtenerDulces()) {
            System.out.println(pos2 + " " + dulce_actual.getNombre());
            pos2++;
        }
        System.out.println("");

    }
}

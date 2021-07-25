package DTO;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        PaisesBO bo = new PaisesBO();
        //creando nuevos paises
        for (int i = 0; i < 6; i++) {
            System.out.println("inserte el nombre del nuevo pais");
            String pais_nuevo = lector.nextLine();
            bo.crearPais(pais_nuevo);
        }

        //mostrarndo nuevos paises
        int pos = 0;
        for (PaisesVO pais_actual : bo.obtenerPaises()) {
            System.out.println(pos + " -> " + pais_actual.getNombre());
            pos++;
        }

        //actualizar
        if (bo.actualizarPais(1, "Polombia")) {
            System.out.println("dato modificado con exito");
        } else {
            System.out.println("error al actualizar el dato");
        }

        //eliminar
        if (bo.eliminarPais(0)) {
            System.out.println("dato eliminado con exito");
        } else {
            System.out.println("error al eliminar el dato");
        }

        //mostrarndo nuevos paises
        pos = 0;
        for (PaisesVO pais_actual : bo.obtenerPaises()) {
            System.out.println(pos + " -> " + pais_actual.getNombre());
            pos++;
        }

    }

}

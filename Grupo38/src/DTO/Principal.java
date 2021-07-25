
package DTO;

import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        ComidaFavoritaBO bo= new ComidaFavoritaBO();
        
        
        for (int i = 0; i < 4; i++) {
            System.out.println("Inserte ingredientes");
            String ingredientes=lector.nextLine();
            System.out.println("Inserte preparación");
            String preparación = lector.nextLine();
            System.out.println("Inserte costo del plato");
            double costo = Double.parseDouble(lector.nextLine());
            bo.crearComidaFavorita(ingredientes, preparación, costo);
        }
        
        
        System.out.println("Lista de comidas almacenadas");
        for (ComidaFavoritaVO  comida_actual: bo.obtenerComidasFavoritas() ) {
            System.out.println(comida_actual.getIngredientes()+
                    "\n"+comida_actual.getPreparación()+
                    "\n"+comida_actual.getCosto());
        }
        
        
        if (bo.eliminarComidaFavorita(0)) {
            System.out.println("Dato eliminado con exito");
            
        }else{
            System.out.println("Error, no se pudo eliminar");
        }
        
        if (bo.actualizarComidaFavorita(1, 40000)) {
            System.out.println("Dato actualizado con exito");
            
        }else{
            System.out.println("Error, no se pudo actualizar");
        } 
    }
}

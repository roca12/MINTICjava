package DTO;

import java.util.ArrayList;

public class ComidaFavoritaBO {

    //LISTA
    ArrayList<ComidaFavoritaVO> lista_de_comidas = new ArrayList<>();

    //CRUD
    //crear
    public void crearComidaFavorita(String ingredientes, String preparación, double costo) {
        lista_de_comidas.add(new ComidaFavoritaVO(ingredientes, preparación, costo));
    }

    //buscar
    public ArrayList<ComidaFavoritaVO> obtenerComidasFavoritas() {
        return lista_de_comidas;
    }

    //eliminar
    public boolean eliminarComidaFavorita(int pos) {
        try {
            lista_de_comidas.remove(pos);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    
    //actualizar
    public boolean actualizarComidaFavorita(int pos,double precio) {
        try {
            lista_de_comidas.get(pos).setCosto(precio);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

}

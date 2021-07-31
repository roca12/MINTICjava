package DTO;

import java.util.ArrayList;

public class PaisesBO {

    //lista almacenando los paises
    ArrayList<PaisesVO> lista_paises = new ArrayList<>();

    //crear
    public void crearPais(String nuevo_pais) {
        lista_paises.add(new PaisesVO(nuevo_pais));
    }

    //mostar
    public ArrayList<PaisesVO> obtenerPaises() {
        return lista_paises;
    }

    //eliminar 
    public boolean eliminarPais(String pais_a_borrar) {
        try {
            for (int i = 0; i < lista_paises.size(); i++) {
                if (lista_paises.get(i).getNombre().equals(pais_a_borrar)) {
                    lista_paises.remove(i);
                    break;
                }
            }

        } catch (Exception e) {
            return false;
        }
        return true;
    }

    //actualizar
    public boolean actualizarPais(int pos, String nombre_nuevo) {
        try {
            lista_paises.get(pos).setNombre(nombre_nuevo);
        } catch (Exception error_que_ha_saltado) {
            return false;
        }
        return true;
    }
}

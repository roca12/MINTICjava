package DTO;

import java.util.ArrayList;

public class DulcesBO {

    ArrayList<DulcesVO> lista_dulces = new ArrayList<>();

    //crear
    public void crearDulce(String nuevo_dulce) {
        lista_dulces.add(new DulcesVO(nuevo_dulce));
    }

    //buscar
    public ArrayList<DulcesVO> obtenerDulces() {
        return lista_dulces;
    }

    //eliminar
    public boolean eliminarDulce(int pos) {
        try {
            lista_dulces.remove(pos);
        } catch (Exception excepcion_que_salto) {
            return false;
        }
        return true;
    }

    //actualizar
    public boolean actualizarDulce(int pos,String nuevo_nombre) {
        try {
            lista_dulces.get(pos).setNombre(nuevo_nombre);
            
        } catch (Exception excepcion_que_salto) {
            return false;
        }
        return true;
    }

}

package reto2;

import java.util.ArrayList;

public class Estudiante_BO {
    ArrayList<EstudianteVO>Lista_de_usuarios=new ArrayList<>() ;
    
    
    public void ingresarEstudiante(String nombres,String apellidos,String fecha_nacimiento, String correo_institucional, String correo_personal , long celular , long telefono_fijo, String programa_academico, long numero_fijo){
        Lista_de_usuarios.add(new EstudianteVO(nombres,apellidos,fecha_nacimiento,correo_institucional,correo_personal,celular,numero_fijo,programa_academico));
        
    }
    public boolean buscar_Estudiante(String buscar_estudiante){
        try {
            for(int i =0; i<Lista_de_usuarios.size(); i++){
                if (Lista_de_usuarios.get(i).getCorreo_institucional().equals(buscar_estudiante)){
                    EstudianteVO encontrado = Lista_de_usuarios.get(i);
                    System.out.println("Nombres: "+ encontrado.getNombres());
                    System.out.println("Apellidos: "+ encontrado.getApellidos());
                    System.out.println("Fecha nacimiento:" + encontrado.getfecha_nacimiento());
                    System.out.println("Correo institucional:" + encontrado.getCorreo_institucional());
                    System.out.println("Correo personal:" + encontrado.getCorreo_personal());
                    System.out.println("Numero de telefono celular:" + encontrado.getCelular());
                    System.out.println("Numero de telefono fijo:" + encontrado.getNumero_fijo());
                    System.out.println("Programa academico:" + encontrado.getPrograma_academico());
                    System.out.println("");
                    break;
                }
            }
        }catch(Exception e){
            return false;
        }
        return true;
    }
    public boolean actualizarEstudiante(String nuevocorreo_institucional, String nuevocorreo_personal, long nuevonumero_celular, long nuevonumero_fijo, String nuevoprograma_academico){
        try {
            for (int i = 0; i <Lista_de_usuarios.size(); i++){
                if (Lista_de_usuarios.get(i).getCorreo_institucional().equals(nuevocorreo_institucional)){
                    
                    Lista_de_usuarios.get(i).setCorreo_personal(nuevocorreo_personal);
                    Lista_de_usuarios.get(i).setCelular(nuevonumero_celular);
                    Lista_de_usuarios.get(i).setNumero_fijo(nuevonumero_fijo);
                    Lista_de_usuarios.get(i).setPrograma_academico(nuevoprograma_academico);
                }
                
            }
        }catch (Exception dato_invalido){
            return false; 
        }
        return true;
           
    }
    public boolean eliminarEstudiante(String estudiante_a_eliminar){
        try{
            for (int i =0; i <Lista_de_usuarios.size(); i++){
                if (Lista_de_usuarios.get(i).getCorreo_institucional().equals(estudiante_a_eliminar)){
                    Lista_de_usuarios.remove(i);
                    break;
                }
            }
        }
        catch(Exception e){
            return  false;
        }
        return true;
    }
    public void mostrarEstudiante(){
        for (EstudianteVO eVO : Lista_de_usuarios){
            System.out.println("Nombres: " + eVO.getNombres());
            System.out.println("Apellidos: " + eVO.getApellidos());
            System.out.println("Fecha nacimiento: " + eVO.getfecha_nacimiento());
            System.out.println("Correo institucional: " + eVO.getCorreo_institucional());
            System.out.println("Correo personal: " + eVO.getCorreo_personal());
            System.out.println("Numero de telefono celular: " + eVO.getCelular());
            System.out.println("Numero de telefono fijo " + eVO.getNumero_fijo());
            System.out.println("Programa academico: " + eVO.getPrograma_academico());
            System.out.println("");
        }
    }
    
            
}
    
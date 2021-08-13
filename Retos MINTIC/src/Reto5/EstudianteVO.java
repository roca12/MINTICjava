package Reto5;

import Reto4.*;




public class EstudianteVO {

    private String nombre;
    private String apellido;
    private String birthday;
    private String email_inst;
    private String email;
    private long celular;
    private long fijo;
    private String programa;

    public EstudianteVO() {
    }

    public EstudianteVO(String nombre, String apellido, String birthday, String email_inst, String email, long celular, long fijo, String programa) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.birthday = birthday;
        this.email_inst = email_inst;
        this.email = email;
        this.celular = celular;
        this.fijo = fijo;
        this.programa = programa;
    }

    
    
    EstudianteVO(String nuevo_estudiantes){
        throw new UnsupportedOperationException("No supported yet.");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getEmail_inst() {
        return email_inst;
    }

    public void setEmail_inst(String email_inst) {
        this.email_inst = email_inst;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getCelular() {
        return celular;
    }

    public void setCelular(long celular) {
        this.celular = celular;
    }

    public long getFijo() {
        return fijo;
    }

    public void setFijo(long fijo) {
        this.fijo = fijo;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

}
   
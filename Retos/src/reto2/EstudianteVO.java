package reto2;

public class EstudianteVO {
    
    private String nombres;
    private String apellidos;
    private String fecha_nacimiento;
    private String correo_institucional;
    private String correo_personal;
    private long celular;
    private long numero_fijo;
    private String programa_academico;
    
    public EstudianteVO(){
    
}

    public EstudianteVO(String nombres, String apellidos, String fecha_nacimiento, String correo_institucional, String correo_personal, long celular,long numero_fijo, String programa_academico) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fecha_nacimiento = fecha_nacimiento;
        this.correo_institucional = correo_institucional;
        this.correo_personal = correo_personal;
        this.celular = celular;
        this.numero_fijo  = numero_fijo;
        this.programa_academico = programa_academico;
    }
    EstudianteVO(String nuevo_estudiante){
        throw new UnsupportedOperationException("not suported yet.");
        
    }
    
    public String getNombres(){
        return nombres;
    }
    public void setNombres(String nombres){
        this.nombres=nombres;
    }
    public String getApellidos(){
        return apellidos;
    }
    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }
    public String getfecha_nacimiento(){
        return fecha_nacimiento;
    }
    public void setfecha_nacimiento(String fecha_nacimiento){
        this.fecha_nacimiento=fecha_nacimiento;
    }
    public String getCorreo_institucional(){
        return correo_institucional;
    }
    public void setcorreo_institucional(String correo_institucional){
        this.correo_institucional=correo_institucional;
    }
    public String getCorreo_personal(){
        return correo_personal;
    }
    public void setCorreo_personal(String Correo_personal){
        this.correo_personal=Correo_personal;
    }
    public long getCelular(){
        return celular;
    }
    public void setCelular(long celular){
        this.celular=celular;
    }
    public long getNumero_fijo(){
        return numero_fijo;
    }
    public void setNumero_fijo(long numero_fijo){
        this.numero_fijo=numero_fijo;
    }
    public String getPrograma_academico(){
        return programa_academico;
    }
    public void setPrograma_academico(String programa_academico){
        this.programa_academico=programa_academico;
    }
}
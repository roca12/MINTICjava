package co.edu.unbosque.model;

public class Estudiante {
    
    private String nombres;
    private String apellidos;
    private String fecha_nacimiento;
    private String correo_institucional;
    private String correo_personal;
    private long celular;
    private long fijo;
    private String programa;

    public Estudiante(String nombres, String apellidos, String fecha_nacimiento, String correo_institucional, String correo_personal, long celular, long fijo, String programa) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fecha_nacimiento = fecha_nacimiento;
        this.correo_institucional = correo_institucional;
        this.correo_personal = correo_personal;
        this.celular = celular;
        this.fijo = fijo;
        this.programa = programa;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getCorreo_institucional() {
        return correo_institucional;
    }

    public void setCorreo_institucional(String correo_institucional) {
        this.correo_institucional = correo_institucional;
    }

    public String getCorreo_personal() {
        return correo_personal;
    }

    public void setCorreo_personal(String correo_personal) {
        this.correo_personal = correo_personal;
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

    @Override
    public String toString() {
        return    "Nombres: " + nombres + 
                "\nApellidos: " + apellidos + 
                "\nFecha nacimiento: " + fecha_nacimiento + 
                "\nCorreo institucional: " + correo_institucional + 
                "\nCorreo personal: " + correo_personal + 
                "\nNúmero de teléfono celular: " + celular + 
                "\nNúmero de teléfono fijo: " + fijo + 
                "\nPrograma académico: " + programa + "\n";
    }
    
    
    
    
}
 
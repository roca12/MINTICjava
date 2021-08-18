
public class Estud_VO4 {
       
    private String nombres;
    private String apellidos;
    private String fecha_de_nacimiento;
    private String correo_institucional;
    private String correo_personal;
    private long numero_tel_celular;
    private long numero_tel_fijo;
    private String programa_academico;

    public Estud_VO4() {
    }

    public Estud_VO4(String nombres, String apellidos, String fecha_de_nacimiento, String correo_institucional, String correo_personal, long numero_tel_celular, long numero_tel_fijo, String programa_academico) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fecha_de_nacimiento = fecha_de_nacimiento;
        this.correo_institucional = correo_institucional;
        this.correo_personal = correo_personal;
        this.numero_tel_celular = numero_tel_celular;
        this.numero_tel_fijo = numero_tel_fijo;
        this.programa_academico = programa_academico;
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

    public String getFecha_de_nacimiento() {
        return fecha_de_nacimiento;
    }

    public void setFecha_de_nacimiento(String fecha_de_nacimiento) {
        this.fecha_de_nacimiento = fecha_de_nacimiento;
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

    public long getNumero_tel_celular() {
        return numero_tel_celular;
    }

    public void setNumero_tel_celular(long numero_tel_celular) {
        this.numero_tel_celular = numero_tel_celular;
    }

    public long getNumero_tel_fijo() {
        return numero_tel_fijo;
    }

    public void setNumero_tel_fijo(long numero_tel_fijo) {
        this.numero_tel_fijo = numero_tel_fijo;
    }

    public String getPrograma_academico() {
        return programa_academico;
    }

    public void setPrograma_academico(String programa_academico) {
        this.programa_academico = programa_academico;
    }
    
    

}
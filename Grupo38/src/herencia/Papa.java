package herencia;

public class Papa extends Abuelo {

    String vivienda;
    String celular;
    String gusto_de_equipo;

    public Papa() {
    }

    public Papa(String vivienda, String celular, String gusto_de_equipo) {
        this.vivienda = vivienda;
        this.celular = celular;
        this.gusto_de_equipo = gusto_de_equipo;
    }

    public Papa(String vivienda, String celular, String gusto_de_equipo, String mascota, long herencia_monetaria, String vehiculo, String accesorio) {
        super(mascota, herencia_monetaria, vehiculo, accesorio);
        this.vivienda = vivienda;
        this.celular = celular;
        this.gusto_de_equipo = gusto_de_equipo;
    }

    String obtenerDatosPapa() {
        return obtenerDatos() + " " + vivienda + " " + celular + " " + gusto_de_equipo;

    }
    
    @Override
    String obtenerDatos(){
        return "Los datos que llegan desde mi abuelo son"+accesorio+" "+vehiculo;
    
    }
    
    

}

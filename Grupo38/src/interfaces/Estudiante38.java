
package interfaces;

public class Estudiante38 implements SerVivo,Persona{

    @Override
    public String dormir() {
        return  "Estoy leyendo el reto, no voy a dormir";
    }

    @Override
    public String reproducirse() {
        return  "Pues todos sabemos como";
    }

    @Override
    public String comer() {
        return "Masticando mientras esta en clase";
    }

    @Override
    public String hablar() {
        return  "Deja en visto";
    }

    @Override
    public String razonar() {
        return  "Cuando esta pensando la solución de los retos";
    }

    @Override
    public String cocinar() {
        return "viendo videos de YT";
    }

    @Override
    public String toString() {
        return "Info: "+dormir()+" "+reproducirse()+" "+cocinar();
    }
    
   
}


package herencia;


public class Papa extends Abuelo{
    String carro;
    String acciones;
    int dinero_banco;

    public Papa() {
    }

    public Papa(String carro, String acciones, int dinero_banco) {
        this.carro = carro;
        this.acciones = acciones;
        this.dinero_banco = dinero_banco;
    }

    public Papa(String carro, String acciones, int dinero_banco, String juguete, long herencia_monetaria, String mascota, String accesorio) {
        super(juguete, herencia_monetaria, mascota, accesorio);
        this.carro = carro;
        this.acciones = acciones;
        this.dinero_banco = dinero_banco;
    }
    
    
}

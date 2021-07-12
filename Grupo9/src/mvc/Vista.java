package mvc;

public class Vista {

    public static void main(String[] args) {
        //creo una copia de mi controlador
        Controlador micontrolador = new Controlador();
        
        //traigo los datos de todos los panes y los guardo en una copia
        Pan[] todoslospanes = micontrolador.mostrarTodosPanes();
        
        // reviso en for each todos los panes e imprimo la informacion de cada uno
        for (Pan p : todoslospanes) {
            //imprimo nombre del pan + su costo
            System.out.println(p.tipo_de_pan + " costo $" + p.precio);
        }
        
        //uso la funcion del controlador que usa la funcion de la clase Pan, para mostrar el precio de un pan especifico
        System.out.println("El precio de el frances es"+micontrolador.obtenerPrecio("Hojaldrado"));

    }

}

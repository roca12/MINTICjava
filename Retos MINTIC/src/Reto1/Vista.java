package Reto1;


import java.util.Scanner;

public class Vista {
    //copia controlador

    public static void main(String[] args) {

        ControladorCentral controller = new ControladorCentral();
        Scanner lector = new Scanner(System.in);

        while (true) {
            //Lista de opciones
            System.out.println("PAGO DE SERVICIOS PÚBLICOS");
            System.out.println("Seleccione el servicio público:");
            System.out.println("1. Energia");
            System.out.println("2. Acueducto");
            System.out.println("3. Gas Natural");
            System.out.println("4. Salir");
            System.out.println("Opción:");
            int opcion = lector.nextInt();
            if (opcion == 1) {
                System.out.println("Pago de servicio de Energia");
                System.out.println("Estrato del inmueble:");
                int estrato = lector.nextInt();
                System.out.println("Consumo del inmueble:");
                int consumo = lector.nextInt();
                System.out.println("El consumo fue: " + consumo);
                System.out.println("Valor unidad: " + controller.luz.VALOR_KW);
                System.out.println("Estrato del inmueble: " + estrato);
                float costo_total = controller.consumo_bruto_luz(consumo);
                System.out.println("Costo total: " + costo_total);
                System.out.print("Descuento o sobrecosto: ");
                if (estrato <= 2) {
                    System.out.print(controller.desc_est_1_2(costo_total) + "\n");

                } else if (estrato == 3 || estrato == 4) {
                    System.out.print(controller.desc_est_3_4(costo_total) + "\n");

                } else if (estrato > 4) {
                    System.out.print(controller.sobre_est_5_6(costo_total) + "\n");
                }
                System.out.println("Impuesto por infraestructura: " + controller.impuesto_infraestructura(costo_total));
                System.out.println("TOTAL A PAGAR: " + controller.total_a_pagar(estrato, costo_total) + "\n");

            } else if (opcion == 2) {
                System.out.println("Pago de Servicio de Acueducto");
                System.out.println("Estrato del inmueble:");
                int estrato = lector.nextInt();
                System.out.println("Consumo del inmueble:");
                int consumo = lector.nextInt();
                System.out.println("El consumo fue: " + consumo);
                System.out.println("Valor unidad: " + controller.agua.VALOR_M3);
                System.out.println("Estrato del inmueble: " + estrato);
                float costo_total = controller.consumo_bruto_agua(consumo);
                System.out.println("Costo total: " + costo_total);
                System.out.print("Descuento o sobrecosto: ");
                if (estrato <= 2) {
                    System.out.print(controller.desc_est_1_2(costo_total) + "\n");

                } else if (estrato == 3 || estrato == 4) {
                    System.out.print(controller.desc_est_3_4(costo_total) + "\n");

                } else if (estrato > 4) {
                    System.out.print(controller.sobre_est_5_6(costo_total) + "\n");
                }
                System.out.println("Impuesto por infraestructura: " + controller.impuesto_infraestructura(costo_total));
                System.out.println("TOTAL A PAGAR: " + controller.total_a_pagar(estrato, costo_total) + "\n");

            } else if (opcion == 3) {
                System.out.println("Pago de Servicio de Gas Natural");
                System.out.println("Estrato del inmueble:");
                int estrato = lector.nextInt();
                System.out.println("Consumo del inmueble:");
                int consumo = lector.nextInt();
                System.out.println("El consumo fue: " + consumo);
                System.out.println("Valor unidad: " + controller.gas.VALOR_M3);
                System.out.println("Estrato del inmueble: " + estrato);
                float costo_total = controller.consumo_bruto_gas(consumo);
                System.out.println("Costo total: " + costo_total);
                System.out.print("Descuento o sobrecosto: ");
                if (estrato <= 2) {
                    System.out.print(controller.desc_est_1_2(costo_total) + "\n");

                } else if (estrato == 3 || estrato == 4) {
                    System.out.print(controller.desc_est_3_4(costo_total) + "\n");

                } else if (estrato > 4) {
                    System.out.print(controller.sobre_est_5_6(costo_total) + "\n");
                }
                System.out.println("Impuesto por infraestructura: " + controller.impuesto_infraestructura(costo_total));
                System.out.println("TOTAL A PAGAR: " + controller.total_a_pagar(estrato, costo_total) + "\n");

            } else if (opcion == 4) {
                System.out.println("Hasta pronto");
                break;
            }

        }

    }

}


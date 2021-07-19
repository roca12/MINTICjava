package Reto1;

public class ControladorCentral {

    Agua agua = new Agua();
    Energia luz = new Energia();
    Gas gas = new Gas();

    // calculo de precio estandar
    float consumo_bruto_agua(int consumo) {
        agua.consumo = consumo;
        float total = (consumo * agua.VALOR_M3);
        return total;
    }

    float consumo_bruto_luz(int consumo) {
        luz.consumo = consumo;
        float total = (consumo * luz.VALOR_KW);
        return total;
    }

    float consumo_bruto_gas(int consumo) {
        gas.consumo = consumo;
        float total = (consumo * gas.VALOR_M3);
        return total;
    }

    // calculo de descuentos y sobrecostros
    float desc_est_1_2(float precio) {
        return precio * 0.5f * -1;
    }

    float desc_est_3_4(float precio) {
        return precio * 0.1f * -1;
    }

    float sobre_est_5_6(float precio) {
        return precio * 0.25f;
    }

    // calculo impuesto de infraestructura
    float impuesto_infraestructura(float precio) {
        return precio / 100;
    }

    // calculo total a pagar
    float total_a_pagar(int estrato, float costo_total) {
        switch (estrato) {
            case 1:
            case 2:
                return costo_total + desc_est_1_2(costo_total) + impuesto_infraestructura(costo_total);

            case 3:
            case 4:
                return costo_total + desc_est_3_4(costo_total) + impuesto_infraestructura(costo_total);

            case 5:
            case 6:
                return costo_total + sobre_est_5_6(costo_total) + impuesto_infraestructura(costo_total);

        }

        return 0.0f;

    }
}

package ConversorDivisas;

public class CalcularConversion {
    TasaDeConversion tasaDeConversion;
    double conversion;

    public double realizarConversion(double valor, int opciones) {
        switch (opciones) {
            case 1:
                conversion = valor * tasaDeConversion.PESOS_MX_A_DOLARES.getValor();
                conversion = (double) Math.round(conversion *100d)/100;
                System.out.println("El resultado es: " + conversion + " Dolares (USD)");
                break;
            case 2:
                conversion = valor * tasaDeConversion.DOLARES_A_PESOS_MX.getValor();
                conversion = (double) Math.round(conversion *100d)/100;
                System.out.println("El resultado es: " + conversion + " Pesos (MX)");
                break;
            case 3:
                conversion = valor * tasaDeConversion.YEN_JPY_A_PESOS_MX.getValor();
                conversion = (double) Math.round(conversion *100d)/100;
                System.out.println("El resultado es: " + conversion + " Pesos (MX)");
                break;
            case 4:
                conversion = valor * tasaDeConversion.PESOS_MX_A_YEN_JPY.getValor();
                conversion = (double) Math.round(conversion *100d)/100;
                System.out.println("El resultado es: " + conversion + " Yen (JPY)");
                break;
            case 5:
                conversion = valor * tasaDeConversion.DOLARES_A_YEN_JPY.getValor();
                conversion = (double) Math.round(conversion *100d)/100;
                System.out.println("El resultado es: " + conversion +  "Yen (JPY)");
                break;
            case 6:
                conversion = valor * tasaDeConversion.YEN_PY_A_DOLARES.getValor();
                conversion = (double) Math.round(conversion *100d)/100;
                System.out.println("El resultado es: " + conversion + " Dolares (USD)");
                break;
            case 0:
                System.out.println("Gracias por usar el Convertidor de Monedas");
                System.exit(0);
            default:
                System.out.println("Opción no valida favor de teclear una opción valida");
        }
        return conversion;
    }
}

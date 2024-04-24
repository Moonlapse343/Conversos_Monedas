package ConversorDivisas;

public enum TasaDeConversion {
    PESOS_MX_A_DOLARES(0.059),
    DOLARES_A_PESOS_MX(16.97),
    YEN_JPY_A_PESOS_MX(0.11),
    PESOS_MX_A_YEN_JPY(9.12),
    DOLARES_A_YEN_JPY(154.78),
    YEN_PY_A_DOLARES(0.0065);

    private double valor;

    TasaDeConversion(double descripcion) {
        this.valor = descripcion;
    }

    public double getValor() {
        return valor;
    }
}

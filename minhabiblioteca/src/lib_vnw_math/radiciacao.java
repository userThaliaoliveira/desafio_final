package lib_vnw_math;

public class radiciacao {
    // Radiciação
    public static double calcularRaiz(double radicando, int... indices) {
        double resultado = radicando;
        for (int indice : indices) {
            resultado = calcularRaizN(resultado, indice);
        }
        return resultado;
    }

    private static double calcularRaizN(double radicando, int indice) {
        if (indice <= 0) {
            throw new IllegalArgumentException("Índice inválido. O índice deve ser um número positivo maior que zero.");
        }

        double chuteInicial = 1.0; // Chute inicial para a raiz
        double precisao = 1.0e-10; // Precisão desejada para o resultado

        // Método da bisseção para encontrar a raiz
        double limiteInferior = 0.0;
        double limiteSuperior = radicando;

        while (limiteSuperior - limiteInferior > precisao) {
            double meio = (limiteInferior + limiteSuperior) / 2;
            double potencia = calcularPotencia(meio, indice);
            if (potencia == radicando) {
                return meio;
            } else if (potencia < radicando) {
                limiteInferior = meio;
            } else {
                limiteSuperior = meio;
            }
        }
        return (limiteInferior + limiteSuperior) / 2;
    }

    private static double calcularPotencia(double base, int expoente) {
        double resultado = 1.0;
        for (int i = 0; i < expoente; i++) {
            resultado *= base;
        }
        return resultado;
    }
}

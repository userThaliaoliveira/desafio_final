package lib_vnw_math;

public class divisao {
    // Divisão Inteira
    public static <T extends Number> T realizarDivisao(T dividendo, T... divisores) {
        for (T divisor : divisores) {
            validarDivisorNaoZero(divisor);
        }

        T resultado = dividendo;
        for (T divisor : divisores) {
            resultado = calcularQuociente(resultado, divisor);
        }
        return resultado;
    }

    private static <T extends Number> T calcularQuociente(T dividendo, T divisor) {
        if (dividendo instanceof Integer || dividendo instanceof Double) {
            double resultado = dividendo.doubleValue();
            double divisorValue = divisor.doubleValue();
            return (T) Double.valueOf(resultado / divisorValue);
        } else {
            throw new IllegalArgumentException("Tipos de dados não suportados");
        }
    }

    // Resto da Divisão
    public static <T extends Number> T calcularResto(T dividendo, T... divisores) {
        for (T divisor : divisores) {
            validarDivisorNaoZero(divisor);
        }

        T resto = dividendo;
        for (T divisor : divisores) {
            resto = calcularModulo(resto, divisor);
        }
        return resto;
    }

    private static <T extends Number> T calcularModulo(T dividendo, T divisor) {
        if (dividendo instanceof Integer || dividendo instanceof Double) {
            double resto = dividendo.doubleValue();
            double divisorValue = divisor.doubleValue();
            return (T) Double.valueOf(resto % divisorValue);
        } else {
            throw new IllegalArgumentException("Tipos de dados não suportados");
        }
    }

    private static <T extends Number> void validarDivisorNaoZero(T divisor) {
        if (divisor.doubleValue() == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida");
        }
    }
}

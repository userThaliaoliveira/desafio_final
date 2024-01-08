package lib_vnw_math;

public class multiplicacao {
    // Multiplicação
    public static <T extends Number> T realizarMultiplicacao(T multiplicador, T... multiplicandos) {
        double produto = multiplicador.doubleValue();
        for (T multiplicando : multiplicandos) {
            produto *= multiplicando.doubleValue();
        }
        return converterParaTipoDesejado(multiplicador, produto);
    }

    private static <T extends Number> T converterParaTipoDesejado(T original, double resultado) {
        if (original instanceof Integer) {
            return (T) Integer.valueOf((int) resultado);
        } else if (original instanceof Double) {
            return (T) Double.valueOf(resultado);
        } else {
            throw new IllegalArgumentException("Tipos de dados não suportados");
        }
    }
}

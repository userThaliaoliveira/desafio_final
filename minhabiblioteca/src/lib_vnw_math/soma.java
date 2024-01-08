package lib_vnw_math;

public class soma {
    // Soma
    public static <T extends Number> T realizarSoma(T valorInicial, T... valores) {
        double resultado = valorInicial.doubleValue();
        for (T valor : valores) {
            resultado += valor.doubleValue();
        }
        return converterParaTipoDesejado(valorInicial, resultado);
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

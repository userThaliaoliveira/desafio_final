package lib_vnw_math;

public class subtracao {
    // Subtração
    public static <T extends Number> T realizarSubtracao(T minuendo, T... subtrahendos) {
        double diferenca = minuendo.doubleValue();
        for (T subtrahendo : subtrahendos) {
            diferenca -= subtrahendo.doubleValue();
        }
        return converterParaTipoDesejado(minuendo, diferenca);
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

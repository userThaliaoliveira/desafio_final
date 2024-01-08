package lib_vnw_math;

public class potencia {
    // Potência
    public static <T extends Number> double calcularPotencia(T base, int... expoentes) {
        double resultado = base.doubleValue();
        for (int expoente : expoentes) {
            resultado = calcularPotenciaPositiva(resultado, expoente);
        }
        return resultado;
    }

    private static double calcularPotenciaPositiva(double base, int expoente) {
        if (expoente < 0) {
            throw new IllegalArgumentException("Expoente negativo não é suportado nesta implementação");
        }
        double resultado = 1.0;
        for (int i = 0; i < expoente; i++) {
            resultado *= base;
        }
        return resultado;
    }
}

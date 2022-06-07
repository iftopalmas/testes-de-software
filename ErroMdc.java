public class ErroMdc {
    /** O que há de errado com este método? */
    public static int mdc(int... valores) {
        if (valores.length == 0) {
            throw new IllegalArgumentException("É preciso indicar um valor para se calcular o MDC");
        }
        Objects.requireNonNull(valores, "O parâmetro valores não pode ser nulo para se calcular o MDC");

        int a = valores[0];
        for (int b : valores) {
            a = mdc(a, b);
        }

        return a;
    }
}
public class Main {

    public static long calcularFatorial(int n) {
        if (n < 0) {
            System.out.println("Número deve ser inteiro positivo");
        }

        long resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static void main(String[] args) {
        System.out.println(calcularFatorial(0) == 1);
        System.out.println(calcularFatorial(1) == 1);
        System.out.println(calcularFatorial(5) == 120);
        System.out.println(calcularFatorial(10) == 3628800);

        try {
            calcularFatorial(-1);
            System.out.println("FALHOU");
        } catch (IllegalArgumentException e) {
            System.out.println("OK");
        }
    }
}

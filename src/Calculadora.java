public class Calculadora {
    public static int multiplicacao(int a, int b) {
        return a * b;
    }

    public static double divisao(int a, int b) {
        if (b == 0) throw new IllegalArgumentException("Divisão por zero não permitida!");
        return (double) a / b;
    }
    public static void main(String[] args) {
    System.out.println("Multiplicação: " + Calculadora.multiplicacao(10, 5));
        System.out.println("Divisão: " + Calculadora.divisao(10, 5));
    }
}
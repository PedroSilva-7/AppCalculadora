public class Calculadora {
    public static int soma(int a, int b) {
        return a + b;
    }

    public static int subtracao(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        System.out.println("Soma: " + Calculadora.soma(10, 5));
        System.out.println("Subtração: " + Calculadora.subtracao(10, 5));
    }
}
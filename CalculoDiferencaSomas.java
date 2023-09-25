public class CalculoDiferencaSomas {
    public static void main(String[] args) {
        int n = 10; // Número de naturais

        int somaQuadrados = 0;
        for (int i = 1; i <= n; i++) {
            somaQuadrados += i * i;
        }

        int soma = 0;
        for (int i = 1; i <= n; i++) {
            soma += i;
        }

        int quadradoSoma = soma * soma;
        int diferenca = quadradoSoma - somaQuadrados;

        System.out.println("A soma dos quadrados dos primeiros " + n + " números naturais é: " + somaQuadrados);
        System.out.println("O quadrado da soma dos primeiros " + n + " números naturais é: " + quadradoSoma);
        System.out.println("A diferença entre a soma dos quadrados e o quadrado da soma é: " + diferenca);
    }
}

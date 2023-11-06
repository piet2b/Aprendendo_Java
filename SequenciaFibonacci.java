import java.util.Scanner;

public class SequenciaFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o número de termos de Fibonacci que você deseja: ");
        int n = scanner.nextInt();

        System.out.println("Sequência de Fibonacci com " + n + " termos:");
        for (int i = 0; i < n; i++) {
            int termo = calcularFibonacci(i);
            System.out.print(termo + " ");
        }

        scanner.close();
    }

    public static int calcularFibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        int termoAnterior = 0;
        int termoAtual = 1;
        int resultado = 0;

        for (int i = 2; i <= n; i++) {
            resultado = termoAnterior + termoAtual;
            termoAnterior = termoAtual;
            termoAtual = resultado;
        }

        return resultado;
    }
}

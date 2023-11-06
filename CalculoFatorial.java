import java.util.Scanner;

public class CalculoFatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("O fatorial não está definido para números negativos.");
        } else {
            long resultado = calcularFatorial(numero);
            System.out.println("O fatorial de " + numero + " é " + resultado);
        }

        scanner.close();
    }

    public static long calcularFatorial(int n) {
        if (n == 0 || n == 1) {
            return 1; 
        } else {
            return n * calcularFatorial(n - 1);
        }
    }


}

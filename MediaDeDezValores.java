import java.util.Scanner;

public class MediaDeDezValores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadeValores = 10;
        double soma = 0;

        for (int i = 0; i <quantidadeValores; i++){
            System.out.println("Digite o valor " + (i + 1) + ": ");
            double valor = scanner.nextDouble();
            soma += valor;
        }

        double media = soma / quantidadeValores;

        System.out.println("A média aritmética dos valores digitados é: " + media);

        scanner.close();
    }
}

import java.util.Scanner;

public class ListaDeNomes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a quantidade de nomes de pessoas a entrar: ");
        int quantidadeNomes = input.nextInt();
        input.nextLine();

        String[] nomes = new String[quantidadeNomes];

        for (int i = 0; i < quantidadeNomes; i++) {
            System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
            nomes[i] = input.nextLine();
        }

        System.out.println("Nomes fornecidos:");

        for (String nome : nomes) {
            System.out.println(nome);
        }

        input.close();
    }
}

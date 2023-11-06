import java.util.Scanner;

public class CalculadoraMenuComHelp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao;
        double num1, num2, resultado;

        if (args.length > 0 && (args[0].equals("-h") || args[0].equalsIgnoreCase("help"))) {
            exibirAjuda();
            return;
        }

        while (true) {
            System.out.println("Menu de Opções:");
            System.out.println("1. Adição");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("5. Ajuda (-h ou help)");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            if (opcao == 6) {
                System.out.println("Encerrando o programa.");
                break;
            }

            if (opcao == 5) {
                exibirAjuda();
                continue;
            }

            System.out.print("Digite o primeiro valor: ");
            num1 = scanner.nextDouble();

            System.out.print("Digite o segundo valor: ");
            num2 = scanner.nextDouble();

            switch (opcao) {
                case 1:
                    resultado = num1 + num2;
                    System.out.println("Resultado da Adição: " + resultado);
                    break;
                case 2:
                    resultado = num1 - num2;
                    System.out.println("Resultado da Subtração: " + resultado);
                    break;
                case 3:
                    resultado = num1 * num2;
                    System.out.println("Resultado da Multiplicação: " + resultado);
                    break;
                case 4:
                    if (num2 != 0) {
                        resultado = num1 / num2;
                        System.out.println("Resultado da Divisão: " + resultado);
                    } else {
                        System.out.println("Erro: Divisão por zero.");
                    }
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                    break;
            }
        }
        scanner.close();
    }

    public static void exibirAjuda() {
        System.out.println("Bem-vindo à Calculadora!");
        System.out.println("Este programa permite que você realize operações matemáticas simples.");
        System.out.println("Para usar a calculadora, siga estas instruções:");
        System.out.println("1. Escolha a operação desejada no menu.");
        System.out.println("2. Digite os números que deseja calcular quando solicitado.");
        System.out.println("3. O resultado da operação será exibido.");
        System.out.println("4. Para sair, escolha a opção 'Sair' no menu.");
        System.out.println("5. Para exibir esta ajuda, escolha a opção 'Ajuda' ou use '-h' ou 'help' via linha de comando.");
    }
}
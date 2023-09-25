import java.util.Scanner;

public class CalculadoraMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int opcao;
        double num1, num2, resultado;
        
       
            System.out.println("Menu de Opções:");
            System.out.println("1. Adição");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("5. Saída");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            
            System.out.println (" Digite o valor 1:");
            num1 = scanner.nextInt () ;
            System.out.println (" Digite o valor 2:");
            num2 = scanner.nextInt () ;
            
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
                case 5:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                    break;
            }
        
        
        scanner.close();
    }
}

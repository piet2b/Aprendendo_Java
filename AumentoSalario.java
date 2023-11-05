import java.util.Scanner;

public class AumentoSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salario: ");
        double salario = scanner.nextDouble();

        System.out.print("Digite o aumento em porcentagem: ");
        double aumentoPorcentagem = scanner.nextDouble();

        double aumento = (salario * aumentoPorcentagem)/ 100.00;
        double novoSalario = salario + aumento;

        aumento = Math.round(aumento * 100.0) / 100.0;
        novoSalario = Math.round(novoSalario * 100.0) / 100.0;

        System.out.println("O valor do aumento é: " + aumento);
        System.out.println("O novo salário com aumento é: " + novoSalario);

        scanner.close();
    }
}

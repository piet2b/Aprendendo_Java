import java.util.Scanner;

public class CalculadoraSalario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor do salário por hora: R$ ");
        double salarioPorHora = input.nextDouble();
        System.out.print("Digite o número de horas trabalhadas por mês: ");
        int horasTrabalhadasPorMes = input.nextInt();

        double salarioBruto = salarioPorHora * horasTrabalhadasPorMes;

        double IR = 0.11 * salarioBruto;
        double INSS = 0.08 * salarioBruto;
        double Sindicato = 0.05 * salarioBruto;

        double salarioLiquido = salarioBruto - IR - INSS - Sindicato;

        System.out.println("+ Salário Bruto: R$ " + salarioBruto);
        System.out.println("- IR (11%): R$ " + IR);
        System.out.println("- INSS (8%): R$ " + INSS);
        System.out.println("- Sindicato (5%): R$ " + Sindicato);
        System.out.println("= Salário Líquido: R$ " + salarioLiquido);

        input.close();

    }
}

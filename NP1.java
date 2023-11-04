import java.util.Scanner;

public class NP1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o salário do trabalhador: R$ ");
        double salario = input.nextDouble();
        System.out.print("Digite o valor da prestação do empréstimo: R$ ");
        double prestacao = input.nextDouble();

        double limitePrestacao = salario * 0.2;

        if (prestacao > limitePrestacao) {
            System.out.println("Empréstimo não concedido.");
        } else {
            System.out.println("Empréstimo concedido.");
        }

        input.close();

    }
}

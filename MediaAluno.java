import java.util.Scanner;

public class MediaAluno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = input.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = input.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media >= 7) {
            System.out.println("Situação: Aprovado");
        } else if (media < 4) {
            System.out.println("Situação: Reprovado");
        } else {
            System.out.println("Situação: Final");

            System.out.print("Digite a nota da prova final: ");
            double notaFinal = input.nextDouble();

            double mediaFinal = (media + notaFinal) / 2;

            System.out.println("Média Final: " + mediaFinal);

            if (mediaFinal >= 5) {
                System.out.println("Resultado: Aprovado na Final");
            } else {
                System.out.println("Resultado: Reprovado na Final");
            }}

            input.close();
}
}
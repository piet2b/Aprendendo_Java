import java.util.Scanner;

public class CalculoPesoIdeal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a altura (em metros): ");
        double altura = input.nextDouble();

        System.out.print("Digite o sexo (M para masculino, F para feminino): ");
        char sexo = input.next().charAt(0);

        boolean isMasculino = (sexo == 'M' || sexo == 'm');

        double pesoIdeal;
        if (isMasculino) {
            pesoIdeal = (72.7 * altura) - 58;
        } else {
            pesoIdeal = (62.1 * altura) - 44.7;
        }

        System.out.printf("O peso ideal é: %.2f kg%n", pesoIdeal);
        
        input.close();
    }
}

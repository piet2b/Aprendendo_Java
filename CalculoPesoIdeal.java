import java.util.Scanner;

public class CalculoPesoIdeal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu peso (em kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Digite sua altura (em m): ");
        double altura = scanner.nextDouble();

        System.out.print("Digite seu gênero (h para homem, m para mulher): ");
        char genero = scanner.next().charAt(0);

        double imc = calcularIMC(peso, altura);
        double pesoIdeal = calcularPesoIdeal(altura, genero);

        System.out.printf("Seu IMC é: %.2f%n", imc);
        System.out.printf("O peso ideal é: %.2f kg%n", pesoIdeal);

        scanner.close();
    }

    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    public static double calcularPesoIdeal(double altura, char genero) {
        if (genero == 'h' || genero == 'H') {
            return (72.7 * altura) - 58;
        } else if (genero == 'm' || genero == 'M') {
            return (62.1 * altura) - 44.7;
        } else {
            System.out.println("Gênero inválido. Use h para homem ou m para mulher.");
            return 0;
        }
    
    }
}

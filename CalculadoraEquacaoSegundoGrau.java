import java.util.Scanner;

public class CalculadoraEquacaoSegundoGrau {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite os coeficientes da equação de segundo grau (a, b e c):");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        if (a == 0) {
            System.out.println("Não é uma equação de segundo grau.");
        } else {

            double delta = b * b - 4 * a * c;

            if (delta < 0) {
                System.out.println("Não existe raiz real.");
            } else if (delta == 0) {

                double raizUnica = -b / (2 * a);

                System.out.println("Raiz Única: " + raizUnica);
            } else {

                double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
                double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);

                System.out.println("Duas Raízes: " + raiz1 + " e " + raiz2);
            }
        }
        input.close();
    }
}

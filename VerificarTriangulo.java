import java.util.Scanner;

public class VerificarTriangulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        double a = input.nextDouble();
        System.out.print("Digite o valor de B: ");
        double b = input.nextDouble();
        System.out.print("Digite o valor de C: ");
        double c = input.nextDouble();

        boolean eTriangulo = (a < b + c) && (b < a + c) && (c < a + b);

        if (eTriangulo) {
            System.out.println("Os valores podem ser os lados de um triângulo.");
        } else {
            System.out.println("Os valores não podem formar um triângulo.");
        }

        input.close();
    }
}

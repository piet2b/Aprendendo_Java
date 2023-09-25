import java.util.Scanner;

public class DistribuicaoNotas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a quantia: ");
        int quantia = input.nextInt();

        int notas50 = quantia / 50;
        quantia %= 50;
        int notas10 = quantia / 10;
        quantia %= 10;
        int notas5 = quantia / 5;
        quantia %= 5;
        int notas1 = quantia;

        System.out.println("Nota50 = " + notas50);
        System.out.println("Nota10 = " + notas10);
        System.out.println("Nota5 = " + notas5);
        System.out.println("Nota1 = " + notas1);

        input.close();
    }
}

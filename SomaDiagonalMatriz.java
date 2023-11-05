import java.util.Scanner;

public class SomaDiagonalMatriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [][] matriz = new int[3][3];
        int somaDiagonalPrincipal = 0;

        System.out.println("Digite os elementos da matriz 3x3:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + (i+1)+ "][" + (j+1) + "]: ");
                matriz[i][j] = scanner.nextInt();

                if (i == j) {
                    somaDiagonalPrincipal += matriz[i][j];
                }
            }
        }

        System.out.println("A soma dos elementos da diagonal principal é: " + somaDiagonalPrincipal);

        scanner.close();
    }
}

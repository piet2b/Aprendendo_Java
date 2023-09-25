import java.util.Scanner;

public class SequenciaFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de termos da sequência de Fibonacci que você deseja ver: ");
        int n = scanner.nextInt();
        
        int primeiroTermo = 0;
        int segundoTermo = 1;
        
        System.out.println("Os primeiros " + n + " termos da sequência de Fibonacci são:");
        
        for (int i = 0; i < n; i++) {
            System.out.print(primeiroTermo + " ");
            int proximoTermo = primeiroTermo + segundoTermo;
            primeiroTermo = segundoTermo;
            segundoTermo = proximoTermo;
        }
        
        scanner.close();
    }
}

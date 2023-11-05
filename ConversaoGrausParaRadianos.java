import java.util.Scanner;

public class ConversaoGrausParaRadianos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o ângulo em graus: ");
        double anguloGraus = scanner.nextDouble();
        
        double anguloRadianos = anguloGraus * Math.PI / 180.0;
       
        System.out.println("O ângulo em radianos é: " + anguloRadianos);
        
        scanner.close();
    }
}

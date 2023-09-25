import java.util.Scanner;

public class CalculadoraDeAreaDeCirculo{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite raio do circulo: ");
        double raio = input.nextDouble();

        double area = Math.PI * raio * raio;

        System.out.printf("O valor da area é %,.2f \n", area);

        input.close();

    }
}
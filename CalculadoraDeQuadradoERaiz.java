import java.util.Scanner;

public class CalculadoraDeQuadradoERaiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        double numero = input.nextDouble();

        if (numero>0){
            double quadrado = numero * numero;
            double raiz = Math.sqrt(numero);

            System.out.println("O quadrado do número digitado é: " + quadrado);
            System.out.println("A raiz quadrada do número digitado é: " + raiz);     
        } else {
            System.out.println("O número digitado não é positivo.");
        }
        input.close();
    }
}

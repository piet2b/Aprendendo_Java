import java.util.Scanner;

public class ContadorPar{
        public static void main(String[] args){
            Scanner scan = new Scanner(System.in);

            int vetor[] = new int[10];
            int contPar = 0;
            
            for( int i=0; i< vetor.length; i++){
                System.out.printf("Digite o vetor[%d]: ",i);
                vetor[i] = scan.nextInt();
                if (vetor[i]%2==0){
                    contPar++;
                }
            }
            System.out.println("Quantidade de pares: "+contPar);

            scan.close();
        }
    }
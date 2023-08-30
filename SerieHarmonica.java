package AprendendoJava;

import java.util.Scanner;

public class SerieHarmonica{
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int termos;
            double SerieHarmonica = 0;
            System.out.println("Digite a quantidade de termos da H(n): ");
            termos = scan.nextInt();

            for(int i = 1; i<= termos; i++){
                SerieHarmonica = SerieHarmonica + (double)1/i;
            }

            System.out.println(("Valor de H(n): " + SerieHarmonica));
        }
    }

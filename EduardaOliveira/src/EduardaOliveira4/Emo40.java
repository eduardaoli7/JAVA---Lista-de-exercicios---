package EduardaOliveira4;

import java.util.Scanner;

public class Emo40 {

	public static void main(String[] args) {
		System.out.println("**********************************");
        System.out.println("Aluna: Eduarda Moreira de Oliveira");
        System.out.println("RA- 0024023");
        System.out.println("Classe EMO40 - Ler números e mostrar o maior (até digitar negativo)");
        System.out.println("**********************************");
        
        Scanner scanner = new Scanner(System.in);
        
        int num;
        int maior = Integer.MIN_VALUE; 

        do {
            System.out.print("Digite um número (negativo para sair): ");
            num = scanner.nextInt();

            if (num >= 0) {
                if (num > maior) {
                    maior = num; 
                }
            }

        } while (num >= 0); 

        if (maior == Integer.MIN_VALUE) {
            System.out.println("\nNenhum número positivo foi digitado.");
        } else {
            System.out.println("\nO maior número digitado foi: " + maior);
        }

        scanner.close();

	}
}

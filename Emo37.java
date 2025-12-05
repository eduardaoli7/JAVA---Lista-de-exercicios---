package EduardaOliveira4;

import java.util.Scanner;

public class Emo37 {

	public static void main(String[] args) {
		System.out.println("**********************************");
        System.out.println("Aluna: Eduarda Moreira de Oliveira");
        System.out.println("RA- 0024023");
        System.out.println("Classe EMO37 - Soma até o número ser múltiplo de 10");
        System.out.println("**********************************");
        
        Scanner scanner = new Scanner(System.in);
        
        int num;
        int soma = 0;

        do {
            System.out.print("Digite um número: ");
            num = scanner.nextInt();

            soma += num; 

        } while (num % 10 != 0); 

        System.out.println("\n🔹 Você digitou um múltiplo de 10!");
        System.out.println("A soma total dos números digitados é: " + soma);

        scanner.close();

	}
}

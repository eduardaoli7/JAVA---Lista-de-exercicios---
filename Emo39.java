package EduardaOliveira4;

import java.util.Scanner;

public class Emo39 {

	public static void main(String[] args) {
		System.out.println("**********************************");
        System.out.println("Aluna: Eduarda Moreira de Oliveira");
        System.out.println("RA- 0024023");
        System.out.println("Classe EMO39 - Validar número entre 1 e 5");
        System.out.println("**********************************");
        
        Scanner scanner = new Scanner(System.in);
        
        int num;

        do {
            System.out.print("Digite um número entre 1 e 5: ");
            num = scanner.nextInt();

            if (num < 1 || num > 5) {
                System.out.println("Número inválido! Tente novamente.\n");
            }

        } while (num < 1 || num > 5); 

        System.out.println("Número válido! Você digitou: " + num);

        scanner.close();

	}

}

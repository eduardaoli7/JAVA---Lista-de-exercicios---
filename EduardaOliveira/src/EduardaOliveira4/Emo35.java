package EduardaOliveira4;

import java.util.Scanner;

public class Emo35 {
	public static void main(String[] args) {
		System.out.println("**********************************");
        System.out.println("Aluna: Eduarda Moreira de Oliveira");
        System.out.println("RA- 0024023");
        System.out.println("Classe EMO35 - Número positivo obrigatório");
        System.out.println("**********************************");
        
        Scanner scanner = new Scanner(System.in);
        
        int num;
        
        do {
        System.out.print("Digite um número: ");
        num = scanner.nextInt();
   
        if(num > 0) {
        	System.out.println("Você digitou um número positivo, saindo do programa...");
        } else {
        	System.out.println("Você digitou um número negativo, tente novamente!");
        }
        } while (num <= 0);
        
        scanner.close();
	}
}

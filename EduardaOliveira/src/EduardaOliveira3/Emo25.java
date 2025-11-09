package EduardaOliveira3;

import java.util.Scanner;

public class Emo25 {
	public static void main(String[] args) {
		System.out.println("**********************************");
		System.out.println("Aluna: Eduarda Moreira de Oliveira");
		System.out.println("RA- 0024023");
		System.out.println("Classe EMO25 - Tabuada com while");
		System.out.println("**********************************");
		
		Scanner scanner = new Scanner(System.in); 
		
		int i = 1;
		int num, result;
		
		System.out.println("Digite um número para ver a sua tabuada");
		System.out.print("\nDigite um número: ");
		num = scanner.nextInt();
		
		while(i < 11) {
			result= num*i;
			
			System.out.print("\n" + num + " * " + i + " = " + result);
			
			i++;
		}
		
		scanner.close();
	}
}

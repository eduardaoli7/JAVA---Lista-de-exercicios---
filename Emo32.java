package EduardaOliveira4;

import java.util.Scanner;

public class Emo32 {
	public static void main(String[] args) {
		System.out.println("**********************************");
		System.out.println("Aluna: Eduarda Moreira de Oliveira");
		System.out.println("RA- 0024023");
		System.out.println("Classe EMO26 - Número primo com while");
		System.out.println("**********************************");
		
		Scanner scanner = new Scanner(System.in); 
		int num, result; 
		int i = 1;
		
		System.out.println("***Digite um número para ver a sua tabuada***");
		System.out.print("\nDigite um número: ");
		num = scanner.nextInt(); 

		do {
			result= num*i;
			System.out.print("\n" + num + " * " + i + " = " + result);
			i++;
		} while(i < 11); 
		
		scanner.close();
	}
}

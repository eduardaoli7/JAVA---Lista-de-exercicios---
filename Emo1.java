package EduardaOliveira;

import java.util.Scanner;

public class Emo1 {
	public static void main(String[] args) {
		System.out.println("**********************************");
		System.out.println("Aluna: Eduarda Moreira de Oliveira");
		System.out.println("RA- 0024023");
		System.out.println("Classe EMO1- Número positivo ou negativo");
		System.out.println("**********************************");
		 
		 Scanner scanner = new Scanner(System.in);
		 
		 System.out.print("Digite um número: ");
	        float numero = scanner.nextFloat();

	        if (numero > 0) {
	            System.out.println("O número é positivo.");
	        } else if (numero < 0) {
	            System.out.println("O número é negativo.");
	        } else {
	            System.out.println("O número é zero.");
	        }

	        scanner.close();

	}
}

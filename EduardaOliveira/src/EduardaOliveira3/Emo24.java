package EduardaOliveira3;

import java.util.Scanner;

public class Emo24 {
	public static void main(String[] args) {
		System.out.println("**********************************");
		System.out.println("Aluna: Eduarda Moreira de Oliveira");
		System.out.println("RA- 0024023");
		System.out.println("Classe EMO24 - Verificar se um número é positivo");
		System.out.println("**********************************");
		
		Scanner scanner = new Scanner(System.in); 
		
		int num=0;
		
		System.out.println("Verificando se o número é positivo");
		
		while(num <=0) {
			System.out.println("\nDigite o número: ");
			num = scanner.nextInt();
			
			if (num >=0) {
				System.out.println("Perfeito, seu número é positivo!!");
			} else {
				System.out.println("Sua verificação falou pois seu número é negativo, tente novamente!");
			}
		}
		scanner.close();
	}
}

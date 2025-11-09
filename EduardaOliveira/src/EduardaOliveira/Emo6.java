package EduardaOliveira;

import java.util.Scanner;

public class Emo6 {
	public static void main(String[] args) {
		System.out.println("**********************************");
		System.out.println("Aluna: Eduarda Moreira de Oliveira");
		System.out.println("RA- 0024023");
		System.out.println("Classe EMO6- Múltiplo de 3 e/ou 5");
		System.out.println("**********************************");
		
		Scanner scanner =  new Scanner(System.in); 
		
		System.out.println("Digite um número: ");
		float num = scanner.nextFloat();
		
		if(num % 3 == 0 && num % 5 == 0) {
			System.out.println("O número é multiplo de 3 e 5.");
		} else if (num % 3 == 0) {
			System.out.println("O número só é multiplo de 3.");
		} else if (num % 5 == 0) {
			System.out.println("O número só é multiplo de 5.");
		} else {
			System.out.println("Esse número não é mutiplo nem de 3 nem de 5.");
		}

		scanner.close();
	}
}

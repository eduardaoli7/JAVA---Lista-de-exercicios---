package EduardaOliveira;

import java.util.Scanner;

public class Emo10 {

	public static void main(String[] args) {
		System.out.println("**********************************");
		System.out.println("Aluna: Eduarda Moreira de Oliveira");
		System.out.println("RA- 0024023");
		System.out.println("Classe EMO10-  Ano bissexto");
		System.out.println("**********************************");
		
		Scanner scanner =  new Scanner(System.in);
		
		System.out.println("Digite um ano: ");
		int ano = scanner.nextInt();
		
		if( ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)) {
			System.out.println(ano + " é bissexto.");
		} else {
			System.out.println(ano + " não é bissexto.");
		}

		scanner.close();
	}
}

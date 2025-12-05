package EduardaOliveira2;

import java.util.Scanner;

public class Emo12 {
	public static void main(String[] args) {
		System.out.println("**********************************");
		System.out.println("Aluna: Eduarda Moreira de Oliveira");
		System.out.println("RA- 0024023");
		System.out.println("Classe EMO12- Tabuada de um número");
		System.out.println("**********************************");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número para ver a sua tabuada: ");
		int num = scanner.nextInt();
		
		System.out.println("Tabuada do número " + num);

		for(int i=1; i <= 10; i++) {
			System.out.println(num + " x " + i + " = " + (num*i));
		}
		
		scanner.close();
	}

}

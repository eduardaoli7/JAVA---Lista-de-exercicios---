package EduardaOliveira;

import java.util.Scanner;

public class Emo2 {
	public static void main(String[] args) {
		System.out.println("**********************************");
		System.out.println("Aluna: Eduarda Moreira de Oliveira");
		System.out.println("RA- 0024023");
		System.out.println("Classe EMO2- Par ou ímpar");
		System.out.println("**********************************");
		 
		 Scanner scanner = new Scanner(System.in);
		 
		 System.out.println("Digite um número: ");
		 float numero = scanner.nextFloat();
		 
		 if (numero % 2 == 0) {
			 System.out.println("O número é par.");
		 } else {
			 System.out.println("O número é impar.");
		 }
		 
		 scanner.close();
	}
}
package EduardaOliveira;

import java.util.Scanner;

public class Emo8 {
	public static void main(String[] args) {
		System.out.println("**********************************");
		System.out.println("Aluna: Eduarda Moreira de Oliveira");
		System.out.println("RA- 0024023");
		System.out.println("Classe EMO8- Login simples");
		System.out.println("**********************************");
		
		Scanner scanner =  new Scanner(System.in);
		
		Double senhaCorreta = (double) 2804;
		
		System.out.println("Bem-vindo usuário! Digite sua senha para realizar o login: ");
		double senha = scanner.nextDouble(); 
		
		if (senha == senhaCorreta) {
			System.out.println("Login bem-sucedido!");
		} else {
			System.out.println("Senha incorreta!");
		}

		scanner.close();
	}
}

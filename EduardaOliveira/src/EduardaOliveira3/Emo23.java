package EduardaOliveira3;

import java.util.Scanner; 

public class Emo23 {
	public static void main(String[] args) {
		System.out.println("**********************************");
		System.out.println("Aluna: Eduarda Moreira de Oliveira");
		System.out.println("RA- 0024023");
		System.out.println("Classe EMO23 - Senha correta");
		System.out.println("**********************************");
		
		Scanner scanner = new Scanner(System.in); 

		
		int senhaC = 2804;
		int senha = 0; 
		
		System.out.print("Digite a senha correta: ");
		System.out.println("\n!Lembrete: são apenas quatro digitos!");
		
		while(senha != senhaC) {
			System.out.print("Digite a senha: ");
			senha = scanner.nextInt();
			
			if (senha == 2804 && senha == senhaC) {
				System.out.println("\nSenha correta!");			
				break; 
			}
			
		}
		scanner.close();
	}
}

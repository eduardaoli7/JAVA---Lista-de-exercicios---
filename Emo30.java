package EduardaOliveira3;

import java.util.Scanner; 

public class Emo30 {
	public static void main(String[] args) {
		System.out.println("**********************************");
		System.out.println("Aluna: Eduarda Moreira de Oliveira");
		System.out.println("RA- 0024023");
		System.out.println("Classe EMO30 - Menu até escolher sair");
		System.out.println("**********************************");
		
		Scanner scanner = new Scanner(System.in); 

		int opcao = -1; 
		
		while(opcao != 0) {
		 System.out.println("\n======= MENU =======");
         System.out.println("1 - Dizer Olá");
         System.out.println("2 - Mostrar uma mensagem");
         System.out.println("0 - Sair");
         System.out.print("Escolha uma opção: ");
         opcao = scanner.nextInt();
         

         if (opcao == 1) {
             System.out.println("Olá, seja bem-vindo!");
         } else if (opcao == 2) {
             System.out.println("Jesus te ama! Jamais desista da sua vida com Ele.");
         } else if (opcao == 0) {
             System.out.println("Saindo do programa... Até logo!");
         } else {
             System.out.println("Opção inválida! Tente novamente.");
         }
         
		}
		 
		scanner.close();
	}

}

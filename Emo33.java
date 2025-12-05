package EduardaOliveira4;

import java.util.Scanner;

public class Emo33 {

	public static void main(String[] args) {
		System.out.println("**********************************");
        System.out.println("Aluna: Eduarda Moreira de Oliveira");
        System.out.println("RA- 0024023");
        System.out.println("Classe EMO33 - Menu com opção de sair");
        System.out.println("**********************************");
        
        Scanner scanner = new Scanner(System.in); 
        
        int i;
        
        System.out.println("Escolha uma opção do menu: ");
        
        do {
        	 System.out.println("\n======= MENU =======");
             System.out.println("1 - Mostrar uma mensagem");
             System.out.println("2 - Sair");
             System.out.print("Escolha uma opção: ");
             i = scanner.nextInt();
             
             if (i == 1) {
            	 System.out.println("Você escolheu a mensagem!");
             } else {
            	 System.out.println("Saindo do programa... Até logo!");
             }
            	
        } while (i != 2);
		
        scanner.close();
	}
}

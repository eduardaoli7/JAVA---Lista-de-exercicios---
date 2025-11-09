package EduardaOliveira4;

import java.util.Scanner;

public class Emo38 {

	public static void main(String[] args) {
		System.out.println("**********************************");
        System.out.println("Aluna: Eduarda Moreira de Oliveira");
        System.out.println("RA- 0024023");
        System.out.println("Classe EMO38 - Confirmar saída com 's'");
        System.out.println("**********************************");
        
        Scanner scanner = new Scanner(System.in);
        
        char opcao; 

        do {
            System.out.println("\n===== MENU PRINCIPAL =====");
            System.out.println("1 - Opção 1");
            System.out.println("2 - Opção 2");
            System.out.println("3 - Opção 3");
            System.out.println("Digite 's' para sair.");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.next().toLowerCase().charAt(0); 

            if (opcao != 's') {
                System.out.println("Você escolheu a opção: " + opcao);
                System.out.println("Voltando ao menu...\n");
            }

        } while (opcao != 's'); 

        System.out.println("\nPrograma encerrado... Byebye!");
        scanner.close();

	}

}

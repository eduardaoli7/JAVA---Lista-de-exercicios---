package EduardaOliveira4;

import java.util.Scanner; 

public class Emo34 {

	public static void main(String[] args) {
		System.out.println("**********************************");
        System.out.println("Aluna: Eduarda Moreira de Oliveira");
        System.out.println("RA- 0024023");
        System.out.println("Classe EMO34 - Pedir senha até acertar");
        System.out.println("**********************************");
        
        Scanner scanner = new Scanner(System.in);
        
        int senhaC = 1111;
        int senha;
       
        do {
        	
        	System.out.println("Digite a senha correta para ter acesso: ");
            senha = scanner.nextInt();
            
        	if(senha == senhaC) {
        		System.out.println("Acesso liberado!");
        	} else {
        		System.out.println("Acesso negado! Tente novamente");
        	}
        	
        } while (senha != senhaC);
        
        scanner.close();
	}
}

package EduardaOliveira;

import java.util.Scanner;

public class Emo4 {
	public static void main(String[] args) {
		System.out.println("**********************************");
		System.out.println("Aluna: Eduarda Moreira de Oliveira");
		System.out.println("RA- 0024023");
		System.out.println("Classe EMO4- Pode votar?");
		System.out.println("**********************************");
		
		Scanner scanner =  new Scanner(System.in);
		
	    System.out.println("Digite a sua idade: ");
	    float num = scanner.nextFloat();
	    
	    if(num>=16) {
	    	System.out.println("Você já pode votar!!");
	    } else {
	    	System.out.println("Você ainda é menor de idade e/ou não tem a idade minima para votar :/");
	    }
	    
	    scanner.close(); 		
	}
}

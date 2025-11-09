package EduardaOliveira3;

import java.util.Scanner;

public class Emo26 {
	public static void main(String[] args) {
		System.out.println("**********************************");
		System.out.println("Aluna: Eduarda Moreira de Oliveira");
		System.out.println("RA- 0024023");
		System.out.println("Classe EMO26 - Número primo com while");
		System.out.println("**********************************");
		
		Scanner scanner = new Scanner(System.in); 

		 System.out.print("Digite um número: ");
	        int num = scanner.nextInt();

	        int i = 2; 
	        boolean primo = true; 

	        
	        while (i <= num / 2) {
	            if (num % i == 0) {
	                primo = false; 
	                break; 
	            }
	            i++;
	        }

	        if (num <= 1) {
	            System.out.println(num + " não é primo.");
	        } else if (primo) {
	            System.out.println(num + " é primo!");
	        } else {
	            System.out.println(num + " não é primo.");
	        }

	        scanner.close();
	}
}

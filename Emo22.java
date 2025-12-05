package EduardaOliveira3;

import java.util.Scanner;

public class Emo22 {

	public static void main(String[] args) {
		System.out.println("**********************************");
		System.out.println("Aluna: Eduarda Moreira de Oliveira");
		System.out.println("RA- 0024023");
		System.out.println("Classe EMO22 -  Soma de números até digitar zero");
		System.out.println("**********************************");
		
		 Scanner scanner = new Scanner(System.in);

	        int numero;
	        int soma = 0;

	        System.out.print("Digite números para somar (digite 0 para encerrar)");

	        while (true) {
	            System.out.print("\nNúmero: ");
	            numero = scanner.nextInt();

	            if (numero == 0) {
	                break; 
	            }

	            soma += numero; 
	        }
	            System.out.println("\nA soma dos números digitados é: " + soma);
	    
	      
	        scanner.close();
	}

}

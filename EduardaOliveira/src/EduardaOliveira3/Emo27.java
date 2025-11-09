package EduardaOliveira3;

import java.util.Scanner;

public class Emo27 {
	public static void main(String[] args) {
		System.out.println("**********************************");
		System.out.println("Aluna: Eduarda Moreira de Oliveira");
		System.out.println("RA- 0024023");
		System.out.println("Classe EMO27 - Quantidade de números ímpares digitados");
		System.out.println("**********************************");
		
		Scanner scanner = new Scanner(System.in); 
		
		int contador = 1;
		int impares = 0;
		
		System.out.println("Digite 10 números:");

        while (contador <= 10) {
            System.out.print("Número " + contador + "° : ");
            int num = scanner.nextInt();
           
            if (num % 2 != 0) {
                impares++;
            }

            contador++; 
        }

        System.out.println("\nVocê digitou " + impares + " números ímpares.");

        scanner.close();
	}

}

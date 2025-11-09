package EduardaOliveira2;

import java.util.Scanner;
import java.math.BigInteger;

public class Emo15 {

	public static void main(String[] args) {
		System.out.println("**********************************");
		System.out.println("Aluna: Eduarda Moreira de Oliveira");
		System.out.println("RA- 0024023");
		System.out.println("Classe EMO15 - Fatorial de um número");
		System.out.println("**********************************");
		
		Scanner scanner = new Scanner(System.in); 
		
		System.out.print("Digite um número para calcular seu fatorial: ");
		int numero = scanner.nextInt();
		
		BigInteger fatorial = BigInteger.ONE; // esse BigInter é usado para caber valores muito grandes que um long não suportaria, por exemplo 
		
		for (int i = 1; i <= numero; i++) {
		    fatorial = fatorial.multiply(BigInteger.valueOf(i));
		}
        System.out.println("O fatorial de " + numero + " é: " + fatorial);
	
        scanner.close();

	}

}

package EduardaOliveira;

import java.util.Scanner;

public class Emo9 {
	public static void main(String[] args) {
		System.out.println("**********************************");
		System.out.println("Aluna: Eduarda Moreira de Oliveira");
		System.out.println("RA- 0024023");
		System.out.println("Classe EMO9-  Ordem crescente (três números)");
		System.out.println("**********************************");
		
		Scanner scanner =  new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		int a = scanner.nextInt();
		System.out.println("Digite o segundo número: ");
		int b = scanner.nextInt();
		System.out.println("Digite o terceiro número: ");
		int c = scanner.nextInt();
		
		int maior, menor, meio; 
		
		 if (a <= b && a <= c) {
	            menor = a;
	            if (b <= c) {
	                meio = b;
	                maior = c;
	            } else {
	                meio = c;
	                maior = b;
	            }
	        } else if (b <= a && b <= c) {
	            menor = b;
	            if (a <= c) {
	                meio = a;
	                maior = c;
	            } else {
	                meio = c;
	                maior = a;
	            }
	        } else {
	            menor = c;
	            if (a <= b) {
	                meio = a;
	                maior = b;
	            } else {
	                meio = b;
	                maior = a;
	            }
	        }
		
		 System.out.println("Ordem crescente: " + menor + ", " + meio + ", " + maior);

		 scanner.close();
	}
}
